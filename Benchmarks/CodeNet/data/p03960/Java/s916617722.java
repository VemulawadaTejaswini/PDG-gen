
import java.util.Arrays;

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();
    char[][] cols = new char[w][h];
    for (int i = 0; i < h; i++) {
      char[] line = ns();
      for (int j = 0; j < w; j++) {
        cols[j][i] = line[j];
      }
    }

    long ret = 0;
    long[][] dp = new long[h + 1][h + 1];
    long[][] table = new long[h + 1][h + 1];
    for (int i = 0; i < w - 1; i++) {
      long cur = dfs(cols[i], cols[i + 1], dp, table);
      ret += cur;
    }
    System.out.println(ret);
  }

  private static long dfs(char[] a, char[] b, long[][] dp, long[][] table) {
    int n = a.length;
    for (long[] v : dp)
      Arrays.fill(v, Long.MAX_VALUE / 10);
    for (long[] v : table)
      Arrays.fill(v, 0);
    dp[0][0] = 0;

    for (int i = n - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        table[i][j] = table[i + 1][j + 1] + (a[n - i - 1] == b[n - j - 1] ? 1 : 0);
      }
    }

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        if (i > 0)
          dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + table[i - 1][j]);
        if (j > 0)
          dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + table[i][j - 1]);
      }
    }
    return dp[n][n];
  }



  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
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

