
import java.util.Arrays;

public class Main {


  private static void solve() {
    int l = ni();
    int[] a = na(l);
     
    //0:2way  1:1way
    long[][] dp = new long[l][2];
    for (long[] v : dp) Arrays.fill(v, Long.MAX_VALUE / 2);

    long sum = 0;
    for (int i = 0; i < l; i ++) {
      long v0 = i == 0 ? 0 : dp[i - 1][0];
      long v1 = i == 0 ? 0 : dp[i - 1][1];

      if (a[i] == 0) {
        dp[i][0] = Math.min(dp[i][0], v0 + 2);
        dp[i][0] = Math.min(dp[i][0], v1 + 1);
        dp[i][1] = Math.min(dp[i][1], v1 + 1);
        dp[i][1] = Math.min(dp[i][1], v0 + 1);
        
        dp[i][0] = Math.min(dp[i][0], sum);
        dp[i][1] = Math.min(dp[i][1], sum);
      } else if (a[i] % 2 == 1) {
        dp[i][0] = Math.min(dp[i][0], v0 + 1);
        dp[i][0] = Math.min(dp[i][0], v1);
        dp[i][1] = Math.min(dp[i][1], v1);

        dp[i][0] = Math.min(dp[i][0], sum);
        dp[i][1] = Math.min(dp[i][1], sum);
      } else {
        dp[i][0] = Math.min(dp[i][0], v0);
        dp[i][0] = Math.min(dp[i][0], v1);
        dp[i][1] = Math.min(dp[i][1], v1 + 1);

        dp[i][0] = Math.min(dp[i][0], sum);
        dp[i][1] = Math.min(dp[i][1], sum);
      }
      sum += a[i];
    }
    long ret = Long.MAX_VALUE;
    sum = 0;
    for (int i = l - 1; i >= 0; i --) {
      ret = Math.min(ret, dp[i][0] + sum);
      ret = Math.min(ret, dp[i][1] + sum);
      sum += a[i];
    }
    System.out.println(ret);
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
