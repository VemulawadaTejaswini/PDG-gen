
public class Main {

  private static void solve() {
    int n = ni();
    int a = ni();
    int b = ni();

    if (Integer.bitCount(a) % 2 == Integer.bitCount(b) % 2) {
      System.out.println("NO");
      return;
    }

    int[] ret = dfs(a, b, n, 0, new boolean[n]);

    System.out.println("YES");
    for (int v : ret) {
      System.out.print(v + " ");
    }
    System.out.println();
  }


  private static int[] dfs(int a, int b, int n, int k, boolean[] skip) {
    if (k == n - 1) {
      return new int[] {a, b};
    }
    int diff = -1;
    int same = -1;
    boolean aOne = false;
    for (int i = 0; i < n; i++) {
      if (skip[i])
        continue;
      int ba = (a >> i) & 1;
      int bb = (b >> i) & 1;

      if (ba != bb) {
        diff = i;
        if (ba == 1) {
          aOne = true;
        }
      } else {
        same = i;
      }
    }

    skip[diff] = true;
    int c = a ^ (1 << same);

    int[] l = dfs(a, c, n, k + 1, skip);
    int[] r = dfs(c ^ (1 << diff), b, n, k + 1, skip);
    int m = l.length;
    int[] ret = new int[m * 2];
    int p = 0;
    for (int i = 0; i < m; i++) {
      if (aOne) {
        l[i] |= 1 << diff;
      }
      ret[p++] = l[i];
    }
    for (int i = 0; i < m; i++) {
      if (!aOne) {
        r[i] |= 1 << diff;
      }
      ret[p++] = r[i];
    }
    skip[diff] = false;
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

