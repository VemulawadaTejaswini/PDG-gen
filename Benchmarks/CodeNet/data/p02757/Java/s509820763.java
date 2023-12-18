
public class Main {

  private static void solve() {
    int n = ni();
    int p = ni();
    char[] s = ns();
    for (int i = 0; i < n; i++) {
      s[i] -= '0';
    }

    int[][] to = new int[10][p];
    for (int i = 0; i < p; i++) {
      for (int d = 0; d < 10; d++) {
        to[d][i] = (i * 10 + d) % p;
      }
    }

    long[] dp = new long[p];

    int[] di = new int[10];
    for (int i = 0; i < 10; i++) {
      di[i] = i;
    }
    long ret = 0;
    for (int i = 0; i < n; i++) {
      int d = s[i] % p;
      dp[di[d]]++;
      ret += dp[di[0]];
      // System.out.println(di[0] + " " + Arrays.toString(dp) + " " + Arrays.toString(di));
      for (int j = 0; j < 10; j++) {
        di[j] = to[d][di[j] % p];
      }
    }
    // System.out.println(Arrays.toString(dp));
    System.out.println(ret);


    // long ret2 = 0;
    // long[][] dp2 = new long[n + 1][p];
    // for (int i = 0; i < n; i++) {
    // int d = s[i];
    // for (int j = 0; j < p; j++) {
    // dp2[i + 1][to[d][j]] += dp2[i][j];
    // // System.out.println(to[d][j] + " " + j);
    // }
    // dp2[i + 1][d % p]++;
    // ret2 += dp2[i + 1][0];
    // }
    //
    // System.out.println(Arrays.deepToString(dp2));
    // System.out.println(ret2);
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

