import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();
    int k = ni();

    int sy = ni() - 1;
    int sx = ni() - 1;
    int gy = ni() - 1;
    int gx = ni() - 1;

    char[][] map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = ns();
    }

    int ret = dijk(map, sy, sx, gy, gx, h, w, k);
    System.out.println(ret >= Integer.MAX_VALUE ? -1 : ret);
  }

  public static int dijk(char[][] map, int sy, int sx, int gy, int gx, int h, int w, int k) {
    int n = h * w;
    int[][] d = new int[n][4];

    for (int[] v : d)
      Arrays.fill(v, Integer.MAX_VALUE);

    Queue<int[]> q = new PriorityQueue<int[]>(100000, new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        if (a[1] - b[1] != 0)
          return a[1] - b[1];
        return a[0] - b[0];
      }
    });

    int from = sy * w + sx;
    for (int i = 0; i < 4; i++) {
      q.add(new int[] { from, 0, i });
      d[from][i] = 0;
    }

    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    while (q.size() > 0) {
      int[] cur = q.poll();
      int y = cur[0] / w;
      int x = cur[0] % w;
      int cd = cur[2];

      for (int nd = 0; nd < 4; nd++) {
        int ny = y;
        int nx = x;
        for (int i = 0; i < k; i++) {
          ny += dir[nd][0];
          nx += dir[nd][1];

          if (ny < 0 || nx < 0 || ny >= h || nx >= w || map[ny][nx] == '@') {
            break;
          }

          int next = ny * w + nx;
          int ndist = d[cur[0]][cd] + 1;
          if (ndist < d[next][nd]) {
            d[next][nd] = ndist;
            q.add(new int[] { next, ndist, nd });
          } else {
            break;
          }
        }
      }
    }

    int ret = Integer.MAX_VALUE;
    for (int v : d[gy * w + gx]) {
      ret = Math.min(ret, v);
    }
    return ret;
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
