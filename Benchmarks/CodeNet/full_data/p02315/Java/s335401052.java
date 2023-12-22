import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;

class Item {
  private int value;
  private int weight;

  public Item(int value, int weight) {
    this.set(value, weight);
  }

  public void set(int value, int weight) {
    this.value = value;
    this.weight = weight;
  }

  public int getValue() {
    return this.value;
  }

  public int getWeight() {
    return this.weight;
  }

}

class Main {
  private static int[][] dp;

  private static int calc(int N, int W, Item[] item) {
    if (N <= 0) {
      return 1;
    }

    for (int i = 1; i < N + 1; i++) {
      for (int j = 0; j < W + 1; j++)  {
        int candidate1 = dp[i - 1][j];
        int candidate2 = 0;

        if ((j - item[i].getWeight() >= 0) && (item[i].getWeight() <= W)) {
          if (j >= item[i].getWeight() * 2) {
            candidate2 = (dp[i][item[i].getWeight() * 2 - 1]);
          } else {
            candidate2 = (dp[i][j - item[i].getWeight()] + item[i].getValue());
          }
        } else {
          candidate2 = Integer.MIN_VALUE;
        }

        dp[i][j] = Math.max(candidate1, candidate2);
        //System.out.println(((j - item[i].getWeight() >= 0) && (item[i].getWeight() <= W)) + " candidate1 " + candidate1 + " candidate2 " + candidate2);
        //System.out.println("dp[" + i + "]" + "[" + j + "], " + dp[i][j]);
      }
    }

    return dp[N][W];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    Item[] item = new Item[N + 1];
    item[0] = new Item(0, Integer.MIN_VALUE);
    for (int i = 1; i < N + 1; i++) {
      int value = sc.nextInt();
      int weight = sc.nextInt();
      item[i] = new Item(value, weight);
    }
    dp = new int[N + 1][W + 1];

    // init kind of coin(i) == 0;
    int i = 0;
    for (int j = 0; j < N + 1; j++) {
      if (j == 0) {
        dp[i][j] = 0;
      } else {
        dp[i][j] = 0;
      }
    }

    int result = calc(N, W, item);

    System.out.println(result);
  }
}