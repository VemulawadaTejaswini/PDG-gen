
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w[i] = ni();
    }
    int[][][] g = packWU(n, from, to, w);
    int[] bi = new int[n];
    int[] hist = new int[n];
    long[] whist = new long[n];
    long[] ans = new long[n];

    long[][] ret = dfs(0, g, hist, whist, ans, 0, bi, 1);
    if (ret == null) {
      System.out.println(0);
    } else if (ret.length > 0) {
      // not bipartite
      long x = 0;
      for (long[] v : ret) {
        x += v[1];
      }
      if (x % 2 != 0) {
        System.out.println(0);
      }
      x /= 2;
      for (int i = 1; i < ret.length; i += 2) {
        x -= ret[i][1];
      }
      Arrays.fill(ans, 0);
      int v = (int) ret[ret.length - 1][0];
      ans[v] = (int) x;

      if (dfs2(v, g, ans)) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    } else {
      // bipartite

      long min = Long.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        if (bi[i] == 1) {
          min = Math.min(min, ans[i]);
        }
      }
      long y = Long.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        if (bi[i] == -1) {
          ans[i] += min - 1;
          y = Math.min(y, ans[i]);
        } else {
          ans[i] -= min - 1;
        }
      }
      System.out.println(Math.max(0, y));
    }
  }



  private static boolean dfs2(int cur, int[][][] g, long[] ans) {
    if (ans[cur] <= 0) {
      return false;
    }

    for (int[] v : g[cur]) {
      int nex = v[0];
      int s = v[1];

      if (ans[nex] != 0) {
        if (ans[nex] + ans[cur] != s) {
          return false;
        }
      } else {
        ans[nex] = s - ans[cur];
        boolean ret = dfs2(nex, g, ans);
        if (!ret) {
          return false;
        }
      }
    }
    return true;
  }

  private static long[][] dfs(int cur, int[][][] g, int[] hist, long[] whist, long[] ans, int dep,
      int[] bi, int b) {
    bi[cur] = b;
    hist[dep] = cur;

    for (int[] v : g[cur]) {
      int nex = v[0];
      int s = v[1];

      if (bi[nex] != 0) {
        if (bi[cur] == bi[nex]) {
          // not bipartite
          int n = g.length;
          long[][] oddLoop = new long[n][2];
          int p = 0;
          whist[dep] = s;
          for (int i = dep; i >= 0; i--) {
            oddLoop[p][0] = hist[i];
            oddLoop[p][1] = whist[i];
            p++;
            if (hist[i] == nex)
              break;
          }
          return Arrays.copyOf(oddLoop, p);
        }
        if (ans[cur] + ans[nex] != s) {
          return null;
        }
      } else {
        ans[nex] = s - ans[cur];
        whist[dep] = s;
        long[][] ret = dfs(nex, g, hist, whist, ans, dep + 1, bi, -b);
        if (ret != null && ret.length > 0) {
          return ret;
        }
      }
    }

    return new long[0][];
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] w) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][2];
    for (int i = 0; i < from.length; i++) {
      --p[from[i]];
      g[from[i]][p[from[i]]][0] = to[i];
      g[from[i]][p[from[i]]][1] = w[i];
      --p[to[i]];
      g[to[i]][p[to[i]]][0] = from[i];
      g[to[i]][p[to[i]]][1] = w[i];
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

