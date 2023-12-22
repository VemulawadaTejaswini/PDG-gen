import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    if (S <= 2) {
      System.out.println(0);
      return;
    }
    if (S <= 5) {
      System.out.println(1);
      return;
    }
    int[] dp = new int[S + 1];
    dp[0] = 0;
    dp[1] = 0;
    dp[2] = 0;
    dp[3] = 1;
    dp[4] = 1;
    dp[5] = 1;
    int mod = 1000000007;
    for (int i = 6; i <= S; i++) {
      int sum = 1;
      for (int j = i - 3; j >= 3; j--) {
        sum += dp[j];
        sum %= mod;
      }
      dp[i] = sum;
    }
    System.out.println(dp[S]);
  }
}
