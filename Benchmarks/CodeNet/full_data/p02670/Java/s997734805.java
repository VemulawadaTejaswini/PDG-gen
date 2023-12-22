
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int n = ni();
    int[] p = na(n * n);

    int[][] map = new int[n][n];
    int ptr = 0;
    for (int i = 0; i < n * n; i++) {
      p[i]--;
      int x = p[i] / n;
      int y = p[i] % n;

      map[x][y] = ptr++;
    }

    long ret = 0;
    final int[][] td = new int[n][n];
    int[] from = new int[2];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        from[0] = i;
        from[1] = j;
        int now = dijk(map, from, td);
        ret += now;
      }
    }
    System.out.println(ret);
  }

  static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  public static int dijk(int[][] map, int[] from, final int[][] td) {
    int n = map.length;
    for (int[] v : td)
      Arrays.fill(v, Integer.MAX_VALUE / 4);
    TreeSet<int[]> q = new TreeSet<>((o1, o2) -> {
      if (td[o1[0]][o1[1]] != td[o2[0]][o2[1]]) {
        return td[o1[0]][o1[1]] - td[o2[0]][o2[1]];
      } else {
        return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
      }
    });
    q.add(from);
    td[from[0]][from[1]] = 0;

    int v = map[from[0]][from[1]];

    while (q.size() > 0) {
      int[] cur = q.pollFirst();
      int cx = cur[0];
      int cy = cur[1];

      for (int[] d : dir) {
        int nx = cx + d[0];
        int ny = cy + d[1];
        if (nx < 0 || nx >= n || ny < 0 || ny >= n)
          return td[cx][cy];

        int nd = td[cx][cy] + (v < map[nx][ny] ? 1 : 0);
        if (nd < td[nx][ny]) {
          int[] next = {nx, ny};
          q.remove(next);
          td[nx][ny] = nd;
          q.add(next);
        }
      }
    }
    return -1;
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

