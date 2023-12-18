
import java.util.ArrayList;
import java.util.List;

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
      w[i] = i;
    }
    int[][][] g = packWU(n, from, to, w);
    int[] d = new int[m];
    boolean ret = dfs(0, g, new boolean[n], d, from);

    if (!ret) {
      out.println("No");
    } else {
      out.println("Yes");
      for (int i = 0; i < m; i++) {
        if (d[i] == 1) {
          out.println((from[i] + 1) + " " + (to[i] + 1));
        } else {
          out.println((to[i] + 1) + " " + (from[i] + 1));

        }
      }
    }
  }

  private static boolean dfs(int now, int[][][] g, boolean[] ved, int[] d, int[] from) {
    ved[now] = true;

    int out = 0;
    int in = 0;
    List<Integer> list = new ArrayList<>();
    for (int[] e : g[now]) {
      int nex = e[0];

      if (ved[nex])
        continue;

      if (!dfs(nex, g, ved, d, from)) {
        return false;
      }

    }

    for (int[] e : g[now]) {
      int k = e[1];

      if (d[k] != 0) {
        if (d[k] == 1 && from[k] == now || d[k] == 2 && from[k] != now) {
          out++;
        } else {
          in++;
        }
      } else {
        list.add(k);
      }
    }

    int cnt = list.size() + out;
    boolean flg = cnt % 2 == 1;

    for (int k : list) {
      if (from[k] == now) {
        d[k] = flg ? 2 : 1;
      } else {
        d[k] = flg ? 1 : 2;
      }
      flg = false;
    }
    if (flg) {
      return false;
    }
    return true;
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

