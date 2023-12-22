import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] dp = new long[2001];
    dp[0] = 1;
    for(int i = 3; i < 2001; i++) {
      dp[i] = (dp[i - 3] + dp[i - 1]) % MOD;
    }
    System.out.println(dp[s]);
  }
}