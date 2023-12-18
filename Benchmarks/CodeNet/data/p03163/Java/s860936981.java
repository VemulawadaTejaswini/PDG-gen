import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    
    long[][] dp = new long[N][W+1];
    dp[0][w[0]] = v[0];
    for (int i = 0; i < N-1; i++) {
      for (int j = 0; j <= W; j++) {
        // not use
        dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
        // use
        if (j+w[i+1] > W) continue;
        dp[i+1][j+w[i+1]] = Math.max(dp[i+1][j+w[i+1]], dp[i][j]+v[i+1]);
      }
    }
    
    long ans = 0;
    for (int j = 0; j <= W; j++) {
      ans = Math.max(ans, dp[N-1][j]);
    }
    System.out.println(ans);
  }
}