
import java.util.Arrays;

public class Main {


  private static void solve() {
    int n = ni();
    
    int[][] c = new int[n * 2][2];
    for (int i = 0; i < n * 2; i ++) {
      String s = next();
      c[i][0] = s.equals("B") ? 0 : 1;
      c[i][1] = ni();
    }
    
    int[][] inv = new int[2][n + 1];
    int[][][] sum = new int[2][n * 2 + 1][n + 1];
    for (int i = 0; i < n * 2; i ++) {
      inv[c[i][0]][c[i][1]] = i;
      
      for (int j = 0; j < n; j ++) {
        sum[0][i + 1][j] = sum[0][i][j] + (c[i][0] == 0 && c[i][1] > j ? 1: 0);
        sum[1][i + 1][j] = sum[1][i][j] + (c[i][0] == 1 && c[i][1] > j ? 1: 0);
      }
    }
    
    int[][] dp = new int[n + 1][n + 1];
    for (int[] v :dp) Arrays.fill(v, Integer.MAX_VALUE / 2);
    dp[0][0] = 0;
    
    for (int i = 0; i <= n; i ++) {
      for (int j = 0; j <= n; j ++) {
        if (i < n) {
          int pi = inv[0][i + 1];
          int ci = sum[0][pi][i] + sum[1][pi][j];
          dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + ci);
        }
        if (j < n) {
          int pj = inv[1][j + 1];
          int cj = sum[0][pj][i] + sum[1][pj][j];
          dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + cj);
        }
      }
    }
    System.out.println(dp[n][n]);
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
