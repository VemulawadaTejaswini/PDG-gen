import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }

    long[] sum = new long[n];

    sum[0] = a[0];
    for (int i = 1; i < n; i++) {
      sum[i] = sum[i - 1] + a[i];
    }

    long[][][] dp = new long[n][n][2];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        dp[i][j] = new long[] {Long.MIN_VALUE, Long.MIN_VALUE};
      }
    }

    for (int i = 0; i < n; i++) {
      dp[i][i] = new long[] {a[i], a[i]};
    }

    for (int len = 2; len <= n; len++) {
      for (int l = 0; l < n; l++) {
        int r = l + len - 1;
        if (r >= n) break;
        for (int p = 0; p < 2; p++) {
          long Y1 = dp[l + 1][r][1 - p];
          long X1 = a[l] + sum[r] - sum[l] - Y1;

          long Y2 = dp[l][r - 1][1 - p];
          long X2 = a[r] + sum[r - 1] - (l == 0L ? 0 : sum[l - 1]) - Y2;

          if (p == 0) {
            if (X1 - Y1 >= X2 - Y2) {
              dp[l][r][p] = X1;
            } else {
              dp[l][r][p] = X2;
            }
          } else {
            if (Y1 - X1 >= Y2 - X2) {
              dp[l][r][p] = X2;
            } else {
              dp[l][r][p] = X1;
            }
          }
        }
      }
    }

    out.println(2 * dp[0][n - 1][0] - sum[n - 1]);
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}