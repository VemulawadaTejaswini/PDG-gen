import java.util.*;
import java.math.*;

public class Main {
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
    long ans = count(dp, a, H - 1, W - 1);
    System.out.println(ans);
  }

  private static final int MOD = 1000000007;

  private static int count(int[][] dp, String[] a, int y, int x) {
    if (x < 0 || y < 0 || a[y].charAt(x) == '#') return 0;
    if (dp[y][x] != 0) return dp[y][x];
    dp[y][x] = (count(dp, a, y - 1, x) + count(dp, a, y, x - 1)) % MOD;
    return dp[y][x];
  }
}