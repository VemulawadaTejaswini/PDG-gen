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

  private static long knapsack(int[][] weightValues, int N, int W) {
    if (N == 0 || W == 0)
      return 0;

    long[][] dp = new long[N][W + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int currentWeight = weightValues[0][i];
        int weightLeftover = j - currentWeight;
        if (weightLeftover < 0) {
          dp[i][j] = i == 0 ? 0 : dp[i-1][j];
        } else {
          int currentValue = weightValues[1][i];
          long additionalValue = i == 0 ? 0 : dp[i-1][weightLeftover];
          long oldValue = i == 0 ? 0 : dp[i-1][j];
          dp[i][j] = Math.max(oldValue, currentValue + additionalValue);
        }
      }
    }
    
    //for (long[] a : dp)
      //System.out.println(Arrays.toString(a));
    
    return dp[dp.length - 1][dp[0].length - 1];
  }

}
