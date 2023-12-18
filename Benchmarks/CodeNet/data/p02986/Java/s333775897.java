
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  private static void solve() {
    int n = ni();
    int q = ni();
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    int[] c = new int[n - 1];
    int[] w = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      c[i] = ni() - 1;
      w[i] = ni();
    }
    int[][][] g = packWU(n, from, to, c, w);

    int[][] p3 = parents3(g, 0);
    int[] par = p3[0];
    int[] dep = p3[2];

    int[][] spar = logstepParents(par);

    int[][] p = new int[q][];
    Map<Integer, Map<Integer, Long>> dMap = new HashMap<>();
    Map<Integer, Map<Integer, Long>> cntMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      dMap.put(i, new HashMap<>());
      cntMap.put(i, new HashMap<>());
    }

    for (int i = 0; i < q; i++) {
      int col = ni() - 1;
      int nw = ni();
      int u = ni() - 1;
      int v = ni() - 1;
      int lca = lca(u, v, spar, dep);
      p[i] = new int[] {col, nw, u, v, lca};

      dMap.get(u).put(col, 0L);
      dMap.get(v).put(col, 0L);
      dMap.get(lca).put(col, 0L);
      cntMap.get(u).put(col, 0L);
      cntMap.get(v).put(col, 0L);
      cntMap.get(lca).put(col, 0L);
    }


    long[] d = new long[n];
    long[] cnt = new long[n];
    long[] len = new long[n];
    dfs(0, -1, g, len, d, cnt, dMap, cntMap);

    for (int i = 0; i < q; i++) {
      int col = p[i][0];
      int nw = p[i][1];
      int u = p[i][2];
      int v = p[i][3];
      int lca = p[i][4];

      long x = len[u] + len[v] - len[lca] * 2;
      long y = cntMap.get(u).get(col) + cntMap.get(v).get(col) - cntMap.get(lca).get(col) * 2;
      long z = dMap.get(u).get(col) + dMap.get(v).get(col) - dMap.get(lca).get(col) * 2;

      out.println(x - z + y * nw);
    }
  }

  private static void dfs(int now, int pre, int[][][] g, long[] len, long[] d, long[] cnt,
      Map<Integer, Map<Integer, Long>> dMap, Map<Integer, Map<Integer, Long>> cntMap) {

    for (Map.Entry<Integer, Long> entry : dMap.get(now).entrySet()) {
      entry.setValue(d[entry.getKey()]);
    }
    for (Map.Entry<Integer, Long> entry : cntMap.get(now).entrySet()) {
      entry.setValue(cnt[entry.getKey()]);
    }

    for (int[] v : g[now]) {
      int next = v[0];
      int c = v[1];
      int w = v[2];
      if (next == pre)
        continue;

      cnt[c]++;
      d[c] += w;
      len[next] = len[now] + w;
      dfs(next, now, g, len, d, cnt, dMap, cntMap);
      cnt[c]--;
      d[c] -= w;
    }
  }

  public static int lca(int a, int b, int[][] spar, int[] depth) {
    if (depth[a] < depth[b]) {
      b = ancestor(b, depth[b] - depth[a], spar);
    } else if (depth[a] > depth[b]) {
      a = ancestor(a, depth[a] - depth[b], spar);
    }

    if (a == b)
      return a;
    for (int d = 31 - Integer.numberOfLeadingZeros(depth[a]); d >= 0; d--) {
      if (spar[d][a] != spar[d][b]) {
        a = spar[d][a];
        b = spar[d][b];
      }
    }
    return spar[0][a];
  }

  protected static int ancestor(int a, int m, int[][] spar) {
    for (; m > 0 && a != -1; m &= m - 1)
      a = spar[Integer.numberOfTrailingZeros(m)][a];
    return a;
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

  public static int[][] parents3(int[][][] g, int root) {
    int n = g.length;
    int[] par = new int[n];
    Arrays.fill(par, -1);

    int[] depth = new int[n];
    depth[0] = 0;

    int[] q = new int[n];
    q[0] = root;
    for (int p = 0, r = 1; p < r; p++) {
      int cur = q[p];
      for (int[] v : g[cur]) {
        int nex = v[0];
        if (par[cur] != nex) {
          q[r++] = nex;
          par[nex] = cur;
          depth[nex] = depth[cur] + 1;
        }
      }
    }
    return new int[][] {par, q, depth};
  }

  public static int[][] logstepParents(int[] par) {
    int n = par.length;
    int m = Integer.numberOfTrailingZeros(Integer.highestOneBit(n - 1)) + 1;
    int[][] pars = new int[m][n];
    pars[0] = par;
    for (int j = 1; j < m; j++) {
      for (int i = 0; i < n; i++) {
        pars[j][i] = pars[j - 1][i] == -1 ? -1 : pars[j - 1][pars[j - 1][i]];
      }
    }
    return pars;
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] c, int[] w) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][3];
    for (int i = 0; i < from.length; i++) {
      --p[from[i]];
      g[from[i]][p[from[i]]][0] = to[i];
      g[from[i]][p[from[i]]][1] = c[i];
      g[from[i]][p[from[i]]][2] = w[i];
      --p[to[i]];
      g[to[i]][p[to[i]]][0] = from[i];
      g[to[i]][p[to[i]]][1] = c[i];
      g[to[i]][p[to[i]]][2] = w[i];
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

