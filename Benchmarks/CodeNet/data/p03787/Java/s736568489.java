
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    DJSet ds = new DJSet(n);
    for (int i = 0; i < m; i++) {
      int u = ni() - 1;
      int v = ni() - 1;
      ds.union(u, v);
      from[i] = u;
      to[i] = v;
    }
    int[][] g = packU(n, from, to);

    long ret = 0;
    int[][] buc = ds.toBucket();
    long size = 0;
    boolean[] bi = new boolean[n];

    long bicnt = 0;

    int[] eo = new int[n];
    for (int i = 0; i < n; i++) {
      if (buc[i] != null && buc[i].length > 1) {
        size++;
        bi[i] = dfs(i, g, eo, true);
        if (bi[i]) {
          bicnt++;
        }
      }
    }

    long notbicnt = size - bicnt;

    for (int i = 0; i < n; i++) {
      if (buc[i] == null)
        continue;

      long x = buc[i].length;
      if (x == 1) {
        ret += n * 2 - 1;
      } else if (bi[i]) {
        ret += 2;

        ret += 2 * (bicnt - 1);
        ret += notbicnt;
      } else {
        ret += 1;

        ret += 2 * bicnt;
        ret += (notbicnt - 1);
      }
    }


    System.out.println(ret);
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

  private static boolean dfs(int now, int[][] g, int[] eo, boolean first) {
    if (first && eo[now] == 0) {
      eo[now] = 1;
    }

    for (int nex : g[now]) {
      if (eo[nex] != 0) {
        if (eo[nex] == eo[now]) {
          return false;
        }
      } else {
        eo[nex] = -eo[now];
        if (!dfs(nex, g, eo, false)) {
          return false;
        }
      }
    }
    return true;
  }


  public static class DJSet {
    public int[] upper;

    public DJSet(int n) {
      upper = new int[n];
      Arrays.fill(upper, -1);
    }

    public int root(int x) {
      return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    public boolean equiv(int x, int y) {
      return root(x) == root(y);
    }

    public boolean union(int x, int y) {
      x = root(x);
      y = root(y);
      if (x != y) {
        if (upper[y] < upper[x]) {
          int d = x;
          x = y;
          y = d;
        }
        upper[x] += upper[y];
        upper[y] = x;
      }
      return x == y;
    }

    public int[][] toBucket() {
      int n = upper.length;
      int[][] ret = new int[n][];
      int[] rp = new int[n];
      for (int i = 0; i < n; i++) {
        if (upper[i] < 0)
          ret[i] = new int[-upper[i]];
      }
      for (int i = 0; i < n; i++) {
        int r = root(i);
        ret[r][rp[r]++] = i;
      }
      return ret;
    }
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
