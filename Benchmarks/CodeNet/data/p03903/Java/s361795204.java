
import java.util.Arrays;

class DisjointSet {
  public int[] upper;

  public DisjointSet(int n) {
    upper = new int[n];
    Arrays.fill(upper, -1);
  }

  public DisjointSet(DisjointSet ds) {
    this.upper = Arrays.copyOf(ds.upper, ds.upper.length);
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

  public int count() {
    int ct = 0;
    for (int u : upper) {
      if (u < 0)
        ct++;
    }
    return ct;
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
    int[][] k = kruskal(from, to, w, n);
    from = k[0];
    to = k[1];
    w = k[2];
    m = k[0].length;
    long total = 0;
    for (int i = 0; i < m; i ++) {
      total += w[i];
    }

    int[][][] g = packWU(n, from, to, w);
    int[][] max = new int[n][n];
    for (int i = 0; i < n; i ++) {
      dfs(i, -1, g, max, i);
    }
    
    int q = ni();
    for (int i = 0; i < q; i ++) {
      int s = ni() - 1;
      int t = ni() - 1;
      
      out.println(total - max[s][t]);
    }
  }



  private static void dfs(int v, int pre, int[][][] g, int[][] max, int start) {
    for (int[] u : g[v]) {
      if (u[0] == pre) {
        continue;
      }
      max[start][u[0]] = Math.max(max[start][v], u[1]);
      dfs(u[0], v, g, max, start);
    }
  }


  public static int[][][] packWU(int n, int[] from, int[] to, int[] w){ return packWU(n, from, to, w, from.length); }
  public static int[][][] packWU(int n, int[] from, int[] to, int[] w, int sup)
  {
      int[][][] g = new int[n][][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < sup;i++)p[to[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
      for(int i = 0;i < sup;i++){
          --p[from[i]];
          g[from[i]][p[from[i]]][0] = to[i];
          g[from[i]][p[from[i]]][1] = w[i];
          --p[to[i]];
          g[to[i]][p[to[i]]][0] = from[i];
          g[to[i]][p[to[i]]][1] = w[i];
      }
      return g;
  }

  public static int[][] kruskal(int[] one, int[] other, int[] w, int n) {
    DisjointSet ds = new DisjointSet(n);
    int p = one.length;
    long[] ord = new long[p];
    for (int i = 0; i < p; i++)
      ord[i] = (long) w[i] << 32 | i;
    Arrays.sort(ord);

    int[] none = new int[p];
    int[] nother = new int[p];
    int[] nw = new int[p];
    int q = 0;
    for (int i = 0; i < ord.length; i++) {
      int cur = (int) ord[i];
      if (!ds.equiv(one[cur], other[cur])) {
        ds.union(one[cur], other[cur]);

        none[q] = one[cur];
        nother[q] = other[cur];
        nw[q] = w[cur];
        q ++;
      }
    }
    none = Arrays.copyOf(none, q);
    nother = Arrays.copyOf(nother, q);
    nw = Arrays.copyOf(nw, q);

    return new int[][] {none, nother, nw};
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
