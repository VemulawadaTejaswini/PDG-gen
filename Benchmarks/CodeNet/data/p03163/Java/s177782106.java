import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[n];
    long[] v = new long[n];
    for(int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextLong();
    }
    long[][] dp = new long[n][W + 1];
    dp[0][w[0]] = v[0];
    for(int i = 1; i < n; i++) {
      for(int j = 1; j <= W; j++) {
        if(j >= w[i]) {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    long ans = 0; 
    for(int j = 1; j <= W; j++) {
      ans = Math.max(ans, dp[n - 1][j]);
    }
    System.out.println(ans);
  }
}