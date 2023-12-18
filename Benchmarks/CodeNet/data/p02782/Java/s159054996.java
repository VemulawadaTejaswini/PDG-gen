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

    int dp[][] = new int[r2 + 1][c2 + 1];
    dp[0][0] = 1;
    for (int r = 0; r < r2 + 1; r++) {
      for (int c = 0; c < c2 + 1; c++) {
        if (r < r2) {
          dp[r + 1][c] += dp[r][c];
          dp[r + 1][c] %= MOD;
        }
        if (c < c2) {
          dp[r][c + 1] += dp[r][c];
          dp[r][c + 1] %= MOD;
        }
      }
    }

    int ans = 0;
    for (int r = r1; r < r2 + 1; r++) {
      for (int c = c1; c < c2 + 1; c++) {
        ans += dp[r][c];
        ans %= MOD;
      }
    }
    System.out.println(ans);
  }
}
