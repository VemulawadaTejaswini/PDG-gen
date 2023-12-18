import java.util.*;
import java.io.*;

public class Main {
  
  static int n;
  static double[] p;
  static double[][] dp;
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    p = new double[n + 1];
    for (int i = 1; i <= n; ++i) {
      p[i] = in.nextDouble();   
    }

    dp = new double[n + 1][n + 1];

    dp[0][0] = 1;
    
    for (int i = 1; i <= n; ++i) {
      for (int j = 0; j <= i; ++j) {
        dp[i][j] += (1 - p[i]) * dp[i - 1][j];
        if (j > 0) {
          dp[i][j] += p[i] * dp[i - 1][j - 1];
        }
      }
    }


    double ans = 0;
    for (int j = ((n+1) / 2); j <= n; ++j) {
      System.err.print(dp[n][j] + " ");
      ans += dp[n][j];
    } System.err.println();

    System.out.println(ans);//dp(0, 0));
  }

  static double dp(int i, int j) {
    if (i == n) {
      if (j > (n/2)) return 1.0;
      else return 0.0;
    }

    if (dp[i][j] >= 0) return dp[i][j];
    return dp[i][j] = p[i] * dp(i + 1, j + 1) + (1 - p[i]) * dp(i + 1, j);
  }

}