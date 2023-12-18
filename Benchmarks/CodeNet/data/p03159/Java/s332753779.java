
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    long[] a = nal(n);
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    for (int i = 0; i < n - 1; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    long[][] dp = dfs(0, -1, g, a);
    
    for (int i = 0; i < dp[0].length; i ++) {
      if (dp[0][i] < 0 || dp[1][i] < Long.MAX_VALUE / 3) {
        System.out.println(i);
        return;
      }
    }
  }
  
  private static long[][] dfs(int now, int pre, int[][] g, long[] a) {
    long[][] dp = new long[2][1];
    dp[0][0] = a[now];
    dp[1][0] = a[now] < 0 ? Long.MAX_VALUE / 2 : a[now];

    for (int next : g[now]) {
      if (next == pre) continue;
      
      long[][] cdp = dfs(next, now, g, a);
      
      int n = dp[0].length;
      int m = cdp[0].length;
      long[][] ndp = new long[2][n + m];
      for (long[] v : ndp) Arrays.fill(v, Long.MAX_VALUE / 2);
      for (int i = 0; i < n; i ++) {
        for (int j = 0; j < m; j ++) {
          ndp[0][i + j] = Math.min(ndp[0][i + j], dp[0][i] + cdp[0][j]);
          ndp[1][i + j] = Math.min(ndp[1][i + j], dp[1][i] + cdp[1][j]);
          
          if (cdp[0][j] < 0 || cdp[1][j] < Long.MAX_VALUE / 3) {
            ndp[0][i + j + 1] = Math.min(ndp[0][i + j + 1], dp[0][i]);
            ndp[1][i + j + 1] = Math.min(ndp[1][i + j + 1], dp[1][i]);
          }
        }
      }
      dp = ndp;
    }
    return dp;
  }
  
  static int[][] packU(int n, int[] from, int[] to) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
        p[f]++;
    for (int t : to)
        p[t]++;
    for (int i = 0; i < n; i++)
        g[i] = new int[p[i]];
    for (int i = 0; i < from.length; i++) {
        g[from[i]][--p[from[i]]] = to[i];
        g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
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
