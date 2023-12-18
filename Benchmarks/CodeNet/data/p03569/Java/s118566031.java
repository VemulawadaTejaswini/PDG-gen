
public class Main {
  private static void solve() {
    char[] s = ns();
    int n = s.length;
    int[][] v = new int[n][2];
    int ptr = 0;

    for (int i = 0; i < n; i ++) {
      if (s[i] != 'x') {
        v[ptr][1] = i;
        v[ptr ++][0] = s[i];
      }
    }
    if (ptr == 0) {
      System.out.println(0);
      return;
    }

    int ret = 0;
    for (int i = 0; i <= (ptr - 1) / 2; i ++) {
      if (v[i][0] != v[ptr - i - 1][0]) {
        System.out.println(-1);
        return;
      }
      
      int p = v[i][1] - 1;
      int q = v[ptr - i - 1][1] + 1;
      
      int count1 = 0, count2 = 0;;
      while (p >= 0 && s[p] == 'x') {
        count1 ++;
        p --;
      }

      while (q < n && s[q] == 'x') {
        count2 ++;
        q ++;
      }
      
      ret += Math.abs(count1 - count2);
    }
    System.out.println(ret);

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


