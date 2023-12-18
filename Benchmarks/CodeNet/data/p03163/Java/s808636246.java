import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int w = nextInt();

    int[] value = new int[n];
    int[] weight = new int[n];

    for (int i = 0; i < n; i++) {
      weight[i] = nextInt();
      value[i] = nextInt();
    }

    long[][] dp = new long[n][w + 1];

    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], -1);
    }

    dp[0][0] = 0;
    dp[0][weight[0]] = value[0];

    for (int i = 1; i < n; i++) {
      for (int j = 0; j <= w; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j - weight[i] >= 0 && dp[i - 1][j - weight[i]] != -1) {
          dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weight[i]] + value[i]);
        }
      }
    }

    long max = 0;
    for (int i = 0; i <= w; i++) {
      max = Math.max(max, dp[n - 1][i]);
    }

    System.out.println(max);
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