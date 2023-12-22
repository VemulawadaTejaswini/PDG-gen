import java.util.*;

public class Main {
  static Scanner in = new Scanner(System.in);
  static List<Integer> list = new ArrayList<>();
  static int[] dp;
  static int[] sum;
  static int n;
  static int m;
  static int[] le;
  static int[] ri;
  static final int mod = 998244353;
  public static void main(String[] args) {
    n = in.nextInt();
    m = in.nextInt();
    le = new int[m];
    ri = new int[m];
    for (int i = 0; i < m; i++) {
      le[i] = in.nextInt();
      ri[i] = in.nextInt();
    }

    dp = new int[n + 1];
    Arrays.fill(dp, 0);
    sum = new int[n + 1];
    Arrays.fill(sum, 0);
    dp[1] = sum [1] = 1;
    for (int i = 2; i <=n; i++) {
      for (int k = 0; k < m; k++) {
        dp[i] = (dp[i] + get(i - ri[k], i - le[k])) % mod;
      }
      sum[i] = (sum[i-1] + dp[i]) % mod;
    }
    System.out.println(dp[n]);
  }

  private static int get(int x, int y) {
    if (y < 0) {
      y = 0;
    }
    if (x <= 0) {
      x = 1;
    }
    return ((sum[y] - sum[x - 1]) % mod + mod) % mod;
  }
}
