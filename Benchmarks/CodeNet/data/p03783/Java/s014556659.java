
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);
    
    int[][] dp = new int[n][401];
    for (int[] v : dp) Arrays.fill(v, Integer.MAX_VALUE / 2);

    for (int x = 1; x <= 400; x ++) {
      dp[0][x] = Math.abs(p[0][1] - x);
    }
    for (int i = 1; i < n; i ++) {
      for (int x1 = 1; x1 <= 400; x1 ++) {
        for (int x2 = 1; x2 <= 400; x2 ++) {
          if (x2 - x1 <= p[i][1] - p[i][0] && x1 - x2 <= p[i - 1][1] - p[i - 1][0]) {
            dp[i][x2] = Math.min(dp[i][x2], Math.abs(p[i - 1][1] - x2) + dp[i - 1][x1]);
          }
        }
      }
    }
    int ret = Integer.MAX_VALUE;
    for (int x = 1; x <= 400; x ++) {
      ret = Math.min(ret, dp[n - 1][x]);
    }
    System.out.println(ret);
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
