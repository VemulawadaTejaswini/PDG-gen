
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

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
    long ret = dijk(g);
    System.out.println(ret);
  }

  public static long dijk(int[][][] g) {

    Map<Long, Long> td = new HashMap<>();
    
    //[v, color, len]
    TreeSet<long[]> q = new TreeSet<>((a, b) -> {
      if (a[2] - b[2] != 0)
        return Long.compare(a[2], b[2]);
      if (a[1] - b[1] != 0)
        return Long.compare(a[1], b[1]);
      return Long.compare(a[0], b[0]);
    });

    long inf = 10000000;
    int target = g.length - 1;
    long[] start = new long[] {0, 0, 0};
    q.add(start);
    td.put(0L, 0L);

    long ret = -1;
    while (q.size() > 0) {
      long[] v = q.pollFirst();
      int cur = (int)v[0];
      int color = (int)v[1];

      for (int i = 0; i < g[cur].length; i++) {
        int nv = g[cur][i][0];
        int nc = g[cur][i][1];

        long[] next = new long[] {nv, nc, v[2]};
        if (color == 0) {
          next[2] ++;
        } else if (color == nc) {
        } else {
          next[0] = cur;
          next[1] = 0;
        }

        long hash = next[1] * inf + next[0];
        if (!td.containsKey(hash) || next[2] < td.get(hash)) {
          q.remove(next);
          td.put(hash, next[2]);
          q.add(next);

          if (next[0] == target) {
            ret = ret < 0 ? next[2] : Math.min(ret, next[2]);
          }
        }
      }
    }

    return ret;
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
