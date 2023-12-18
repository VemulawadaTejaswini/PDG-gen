
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    char[] s = ns();
    int m = s.length;
    
    //dp[キーを叩いた回数][m文字目まで一致][現在の文字数]
    long[][][] dp = new long[2][m + 1][n + 1];
    dp[0][0][0] = 1;
    int mod = 1000000000 + 7;
    for (int i = 0; i < n; i ++) {
      int from = i % 2;
      int to = (i + 1) % 2;
      
      for (int j = 0; j <= m; j ++) {
        for (int k = j; k <= n; k ++) {
          if (j == k && j <= m) {
            if (j > 0) {
              dp[to][j][k] += dp[from][j - 1][k - 1];
            }
            if (k < n) {
              dp[to][j][k] += dp[from][j][k + 1];
              if (j < m) {
                dp[to][j][k] += dp[from][j + 1][k + 1];
              }
            }
            if (k == 0) {
              dp[to][j][k] += dp[from][j][k];
            }
          } else {
            if (k == j + 1 && j < m) {
              dp[to][j][k] += dp[from][j][k - 1];
            } else {
              dp[to][j][k] += dp[from][j][k - 1] * 2;
            }
            if (k < n) {
              dp[to][j][k] += dp[from][j][k + 1];
            }
            if (k == 0) {
              dp[to][j][k] += dp[from][j][k];
            }
          }
          dp[to][j][k] %= mod;
        }
      }
      for (long[] v: dp[from]) Arrays.fill(v, 0);
    }
    
    System.out.println(dp[n % 2][m][m]);
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
