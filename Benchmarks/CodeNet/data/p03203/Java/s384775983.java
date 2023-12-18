
import java.util.Arrays;

public class Main {
  private static void solve() {
    int h = ni();
    int w = ni();
    int n = ni();

    int[][] p = ntable(n, 2);
    Arrays.sort(p, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
    int[] hp = new int[h + 2];
    int[][] q = new int[h + 2][];
    for (int[] v : p) {
      hp[v[1]]++;
    }
    int ptr = 0;
    for (int i = 1; i <= h + 1; i++) {
      q[i] = new int[hp[i] + 1];
      for (int j = 0; j < hp[i]; j++) {
        q[i][j] = p[ptr++][0];
      }
      q[i][hp[i]] = w + 1;
    }
    int ret = w;
    int y = 1;
    for (int x = 1; x <= w; x++) {
      int leftX = lowerBound(q[y], x + 1);
      int topX = lowerBound(q[y + 1], x + 1);
      ret = Math.min(q[y][leftX] - 1, ret);
      // dump(p, h, w, y, x);
      if (q[y + 1][topX] > x + 1) {
        y++;
      }
    }
    System.out.println(ret);
  }

  public static void dump(int[][] p, int h, int w, int y, int x) {
    char[][] map = new char[h][w];
    for (char[] v : map)
      Arrays.fill(v, '.');
    for (int[] v : p) {
      map[v[1] - 1][v[0] - 1] = '*';
    }
    map[y - 1][x - 1] = '@';
    for (char[] v : map) {
      System.out.println(v);
    }
    System.out.println();
  }

  public static int lowerBound(int[] a, int v) {
    int low = -1, high = a.length;
    while (high - low > 1) {
      int h = high + low >>> 1;
      if (a[h] >= v) {
        high = h;
      } else {
        low = h;
      }
    }
    return high;
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
