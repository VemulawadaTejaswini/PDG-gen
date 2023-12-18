import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    final long INF = 1_000_000_000_000L;
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int W = input.nextInt();
      int[] w = new int[N + 1];
      int[] v = new int[N + 1];
      int sumV = 0;
      
      for (int i = 1; i < w.length; ++i) {
        w[i] = input.nextInt();
        v[i] = input.nextInt();
        sumV += v[i];
      }
      
      long[][] dp = new long[N + 1][sumV + 1];
      Arrays.fill(dp[0], INF);
      dp[0][0] = 0;
      for (int i = 1; i < dp.length; ++i) {
        Arrays.fill(dp[i], INF);
        dp[i][0] = 0;
        for (int j = 1; j < dp[i].length; ++j) {
          if (j - v[i] >= 0) {
          	dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
          }
          dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
        }
      }
      
      int maxV = 0;
      for (int i = dp[N].length - 1; i >= 0; --i) {
        if (dp[N][i] <= W) {
        	maxV = i;
          	break;
        }
        
      }
      
      System.out.println(maxV);
    }
  }
}