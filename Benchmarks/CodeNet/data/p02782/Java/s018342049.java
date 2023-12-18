import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    sc.close();

    long MOD = 1000000007L;
    int ans = 0;

    int dp[] = new int[c2 + 1];
    dp[0] = 1;
    for (int r = 0; r < r2 + 1; r++) {
      for (int c = 1; c < c2 + 1; c++) {
        dp[c] += dp[c - 1];
        dp[c] %= MOD;
        if (r1 <= r && c1 <= c) {
          ans += dp[c];
          ans %= MOD;
        }
      }
    }
    System.out.println(ans);
  }
}
