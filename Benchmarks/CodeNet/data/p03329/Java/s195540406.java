import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] dp = new int[N+1];

    dp[0] = 0;
    for (int n = 1; n <= N; n++) {
      dp[n] = 1 + dp[n-1];
      int power6 = 6;
      while (n >= power6) {
        dp[n] = Math.min(dp[n], 1 + dp[n-power6]);
        power6 *= 6;
      }
      int power9 = 9;
      while (n >= power9) {
        dp[n] = Math.min(dp[n], 1 + dp[n-power9]);
        power9 *= 9;
      }
    }
    System.out.println(dp[N]);
  }
}