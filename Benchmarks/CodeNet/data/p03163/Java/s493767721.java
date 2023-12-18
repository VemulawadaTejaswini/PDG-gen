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

    System.out.println(knapsack(weightValues, N, W));
  }

  private static int knapsack(int[][] weightValues, int N, int W) {
    if (N == 0 || W == 0)
      return 0;

    int[] dp = new int[weightValues.length][W + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int currentMinimum = i == 0 ? 0 : dp[i - 1][j];
        int currentWeight = weightValues[i][0];
        int currentValue = weightValues[i][1];
        int weightLeftover = j - currentWeight;
        int candidateMinimum = weightLeftover < 0 : Integer.MAX_VALUE : dp[weightLeftover];

        dp[i][j] = Math.min(currentMinimum, candidateMinimum);
      }
    }

    return dp[dp.length - 1][dp[0].length - 1];
  }

}
