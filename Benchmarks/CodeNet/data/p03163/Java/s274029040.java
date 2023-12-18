import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int noOfItems = in.nextInt();
    int W = in.nextInt();
    Item[] items = new Item[noOfItems + 1];
    items[0] = new Item(0, 0);
    for (int k = 0; k < noOfItems; k++) {
      items[k + 1] = new Item(in.nextInt(), in.nextInt());
    }
    Arrays.sort(items);
    long[][] dp = new long[items.length][W + 1];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 0;
    }
    for (int j = 0; j < dp[0].length; j++) {
      dp[0][j] = 0;
    }

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (items[i].weight > j) {
          dp[i][j] = dp[i - 1][j];
        } else {
          long secWeight = 0;
          if (j - items[i].weight > 0) {
            secWeight = dp[i - 1][j - items[i].weight];
          }
          dp[i][j] = Math.max(dp[i - 1][j], items[i].price + secWeight);
        }
      }
    }
    System.out.println(dp[items.length - 1][W]);
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
