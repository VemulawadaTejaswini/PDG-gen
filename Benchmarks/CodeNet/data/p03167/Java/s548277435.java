import java.util.*;
import java.math.*;

public class Main {
  private static final int MOD = 1000000007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[] a = new String[H];
    for (int i = 0; i < H; i++)
      a[i] = sc.next();
    sc.close();

    int[][] dp = new int[H][W];
    dp[0][0] = 1;
    for (int y = 0; y < H; y++) {
      for (int x = 0; x < W; x++) {
        if (dp[y][x] != 0 || a[y].charAt(x) == '#') continue;
        dp[y][x] = (
            (0 < y ? dp[y - 1][x] : 0)
            + (0 < x ? dp[y][x - 1] : 0)
            ) % MOD;
      }
    }

    long ans = dp[H - 1][W - 1];
    System.out.println(ans);
  }
}