/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio4;

/**
 *
 * @author renmo
 */
public class ItemManager {
    private Item[] items;
    private int nItem;
    private final int MAX;

    public ItemManager() {
        this.MAX = 30;
        this.items = new Item[this.MAX];
        this.nItem = 0;
    }
    
    public void addItem (Item item) {
        if (this.nItem < this.MAX) {
            this.items[this.nItem] = item;
            this.nItem++;
        }
    }
    
    public void removeItem (int index) {
        if (index < this.nItem) {
            for (int i = index + 1; i < this.nItem; i++) {
                this.items[i] = this.items[i + 1];
            }
            this.nItem--;
        }
    }

    public Item getItem(int index) {
        if (index < this.nItem) {
            return this.items[index];
        } else 
            return null;
    }
}
