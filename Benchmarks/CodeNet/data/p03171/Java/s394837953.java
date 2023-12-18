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

    long[][] dp = new long[n][n];

    for (int i = 0; i < n; i++) {
      dp[i][i] = a[i];
    }


    for (int len = 2; len <= n; len++) {
      for (int l = 0; l < n; l++) {
        int r = l + len - 1;
        if (r >= n) break;

        dp[l][r] = Math.max(a[l] + (sum[r] - sum[l] - dp[l + 1][r]),
                            a[r] + (sum[r - 1] - (l == 0 ? 0 : sum[l - 1]) - dp[l][r - 1]));
      }
    }

    out.println(2 * dp[0][n - 1] - sum[n - 1]);
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