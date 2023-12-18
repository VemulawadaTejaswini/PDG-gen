
public class Main {


  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);
    int f = (Math.abs(p[0][0]) + Math.abs(p[0][1])) % 2;
    for (int i = 1; i < n; i ++) {
      if ((Math.abs(p[i][0]) + Math.abs(p[i][1])) % 2 != f) {
        System.out.println(-1);
        return;
      }
    }
    

    int m = (f == 0 ? 40 : 39);
    out.println(m);
    for (int i = 0; i < m; i ++) {
      out.print(1 + " ");
    }
    out.println();
    for (int[] v : p) {
      int ptr = 0;
      long x = Math.abs(v[0]);
      long y = Math.abs(v[1]);
      while (x != 0) {
        x -= 1;
        out.print(v[0] < 0 ? "L" : "R");
        ptr ++;
      }
      while (y != 0) {
        y -= 1;
        out.print(v[1] < 0 ? "D" : "U");
        ptr ++;
      }
      for (int i = 0; i < m - ptr; i ++) {
        out.print(i % 2 == 0 ? "D" : "U");
      }
      out.println();
    }
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
