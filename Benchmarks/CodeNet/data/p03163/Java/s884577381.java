

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int noOfItems = in.nextInt();
    int W = in.nextInt();
    Item[] items = new Item[noOfItems];
    
    for (int k = 0; k < noOfItems; k++) {
      items[k] = new Item(in.nextInt(), in.nextInt());
    }
    
    long[] dp = new long[W + 1];
    for (int i = 0; i < dp.length; i++) {
      dp[i] = 0L;
    }

    for (int i = 0; i < items.length; i++) {
      for (int j = W - items[i].weight; j >= 0; j--) {
        dp[j + items[i].weight] = Math.max(dp[j + items[i].weight], items[i].price + dp[j]);

      }

    }
    System.out.println(dp[W]);
    in.close();
  }


  static class Item implements Comparable<Item> {
    int weight;
    int price;

    public Item(int w, int p) {
      this.weight = w;
      this.price = p;
    }

    public int compareTo(Item t) {
      return this.weight - t.weight;
    }
  }

}
