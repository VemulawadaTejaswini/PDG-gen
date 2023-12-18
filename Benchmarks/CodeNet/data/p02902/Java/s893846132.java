
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];

    Set<Long> set = new HashSet<>();
    long inf = 100000000L;
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;

      set.add(from[i] * inf + to[i]);
    }

    int[][] g = packD(n, from, to);
    List<int[]> loops = new ArrayList<>();
    int[] hist = new int[n];
    for (int i = 0; i < n; i++) {
      int[] flag = new int[n];
      enumLoops(g, i, flag, hist, 0, loops);
    }
    outer: for (int[] v : loops) {
      int k = v.length;
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
          if (v[j] == v[(i + 1) % k])
            continue;

          if (set.contains(inf * v[i] + v[j])) {
            continue outer;
          }
        }
      }
      out.println(k);
      for (int u : v) {
        out.println(u + 1);
      }
      return;
      // out.println();
    }
    System.out.println(-1);
  }

  public static void enumLoops(int[][] g, int cur, int[] flag, int[] hist, int dep,
      List<int[]> loops) {
    flag[cur] = dep + 1;
    hist[dep] = cur;
    for (int e : g[cur]) {

      if (flag[e] != -1) {
        if (flag[e] >= 1) {
          loops.add(Arrays.copyOfRange(hist, flag[e] - 1, dep + 1));
        } else {
          enumLoops(g, e, flag, hist, dep + 1, loops);
        }
      }
    }
    flag[cur] = -1;
  }

  static int[][] packD(int n, int[] from, int[] to) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < from.length; i++) {
      g[from[i]][--p[from[i]]] = to[i];
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

