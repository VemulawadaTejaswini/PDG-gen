import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int valuesCount = sc.nextInt(); // 価格の個数
    // 時刻tにおける価格を配列に格納
    int values[] = new int[valuesCount];
    for (int i = 0; i < valuesCount; i++) {
      values[i] = sc.nextInt();
    }
    sc.close();

    System.out.println(getMaxProfit(values));
  }

  private static int getMaxProfit(int[] values) {
    int maxProfit = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int value : values) {
      if (value - min > maxProfit) {
        maxProfit = value - min;
      }
      if (value < min) {
        min = value;
      }
    }
    return maxProfit;
  }
}
