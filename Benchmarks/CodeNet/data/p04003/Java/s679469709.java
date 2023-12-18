
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {

  static int INF = Integer.MAX_VALUE / 3;
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    int[] c = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      c[i] = ni();
    }
    int[][][] g = packWU(n, from, to, c);

    int ret = dijk(g);
    out.println(ret >= INF ? -1 : ret);
  } 

  public static int dijk(int[][][] g) {
    int n = g.length;
    Map<int[], Integer> td = new HashMap<>();

    TreeSet<int[]> q = new TreeSet<>((a, b) -> {
      int x = td.containsKey(a) ? td.get(a) : INF;
      int y = td.containsKey(b) ? td.get(b) : INF;
      if (x == y) {
        return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
      } else {
        return x - y;
      }
    });

    int[] start = {0, -1};
    td.put(start, 0);
    q.add(start);

    while (q.size() > 0) {
      int[] cur = q.pollFirst();

      if (cur[1] < 0) {
        int nd = td.get(cur) + 1;
        for (int[] next : g[cur[0]]) {
          int ncd = td.containsKey(next) ? td.get(next) : INF;
          if (nd < ncd) {
            q.remove(next);
            td.put(next, nd);
            q.add(next);
          }
        }
      } else {
        int nd = td.get(cur);

        int[] ex = {cur[0], -1};
        td.put(ex, nd);
        q.add(ex);

        for (int[] next : g[cur[0]]) {
          if (cur[1] != next[1]) continue;
          int ncd = td.containsKey(next) ? td.get(next) : INF;
          if (nd < ncd) {
            q.remove(next);
            td.put(next, nd);
            q.add(next);
          }
        }
      }
    }
    int min = INF;
    for (Map.Entry<int[], Integer> entry : td.entrySet()) {
      if (entry.getKey()[0] == n - 1) {
        min = Math.min(min, entry.getValue());
      }
    }
    return min;
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] w) {
    return packWU(n, from, to, w, from.length);
  }

  public static int[][][] packWU(int n, int[] from, int[] to, int[] w, int sup) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
      p[from[i]]++;
    for (int i = 0; i < sup; i++)
      p[to[i]]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][2];
    for (int i = 0; i < sup; i++) {
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
      a[i] = ni();
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
