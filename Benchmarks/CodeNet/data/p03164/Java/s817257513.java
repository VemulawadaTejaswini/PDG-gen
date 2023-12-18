import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int W = scan.nextInt();
    int[][] weightValues = new int[2][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 2; j++) {
        weightValues[j][i] = scan.nextInt();
      }
    }
    scan.close();

    System.out.println(knapsack2(weightValues, N, W));
  }

  private static long knapsack2(int[][] weightValues, int N, int W) {
    if (N == 0 || W == 0)
      return 0;

    int maxPossibleSum = 0;
    for (int i = 0; i < N; i++)
      maxPossibleSum += weightValues[1][i];

    long MAX_VAL = Long.MAX_VALUE;
    long[] dp = new long[maxPossibleSum + 1];
    Arrays.fill(dp, MAX_VAL);
    dp[0] = 0;

    for (int i = 0; i < N; i++) {
      int currentValue = weightValues[1][i];
      int currentWeight = weightValues[0][i];
      for (int j = dp.length - 1; j >= 0; j--) {
        if (dp[j] == MAX_VAL) continue;
        int combinedValue = currentValue + j;
        long combinedWeight = currentWeight + dp[j];
        if (combinedWeight < dp[combinedValue]) {
          dp[combinedValue] = combinedWeight;
        }
      }
    }
    for (int i = dp.length - 1; i >= 0; i--) {
      if (dp[i] <= W) return i;
    }

    return 0;
  }

}