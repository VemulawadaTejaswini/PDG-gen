import java.util.Arrays;
import java.util.Scanner;

public class Main {
  final static long MOD = 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    sc.close();
    System.out.println(solve(s));
  }
  static long solve(int s){
    if(s < 3) {
      return 0;
    } else if(s < 6){
      return 1;
    }

    long[] dp = new long[s + 1];
    Arrays.fill(dp, 0);
    dp[3] = dp[4] = dp[5] = 1;
    for(int i = 6; i <= s; i++){
      dp[i] = dp[i - 1] + dp[i - 3];
      dp[i] %= MOD;
    }
    return dp[s];
  }
}
