import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();

    double[] p = new double[n];

    for (int i = 0; i < n; i++) {
      p[i] = nextDouble();
    }

    double[][] dp = new double[n][n + 1];

    dp[0][0] = 1 - p[0];
    dp[0][1] = p[0];

    for (int i = 1; i < n; i++) {
      for (int j = 0; j <= n; j++) {
        dp[i][j] = dp[i - 1][j] * (1 - p[i]) + (j == 0 ? 0 : (dp[i - 1][j - 1] * p[i]));
      }
    }

    double ans = 0;
    for (int i = n / 2 + 1; i <= n; i++) {
      ans += dp[n - 1][i];
    }

    System.out.println(ans);
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

  private static double nextDouble() {
    return Double.parseDouble(next());
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