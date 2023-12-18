
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);

    System.out.println(solve(p));
    // int n = 5;
    // Random gen = new Random();
    // while (true) {
    // int[][] p = new int[n][2];
    // for (int i = 0; i < n; i++) {
    // p[i][0] = gen.nextInt(10) + 1;
    // p[i][1] = gen.nextInt(10) + p[i][0];
    // }
    //
    // p = new int[][] {{1, 2}, {4, 8}, {4, 4}};
    // long ret1 = solve(p);
    // long ret2 = solve2(p);
    //
    // if (ret1 != ret2) {
    // System.out.println(Arrays.deepToString(p));
    // System.out.println(ret1);
    // System.out.println(ret2);
    // return;
    // }
    //
    // }
  }


  private static long solve2(int[][] p) {
    int n = p.length;
    long ret = 0;
    for (int i = 1; i < ((1 << n) - 1); i++) {
      long l1 = 0;
      long r1 = Integer.MAX_VALUE;
      long l2 = 0;
      long r2 = Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        if (((i >> j) & 1) == 0) {
          l1 = Math.max(l1, p[j][0]);
          r1 = Math.min(r1, p[j][1]);
        } else {
          l2 = Math.max(l2, p[j][0]);
          r2 = Math.min(r2, p[j][1]);
        }
      }
      long cnt = Math.max(0, (r1 - l1 + 1)) + Math.max(0, (r2 - l2 + 1));
      ret = Math.max(ret, cnt);
    }
    return ret;
  }

  private static long solve(int[][] p) {
    int n = p.length;
    Arrays.sort(p, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

    long[] l2 = new long[n + 1];
    long[] r2 = new long[n + 1];

    l2[n] = 0;
    r2[n] = Integer.MAX_VALUE;
    for (int i = n - 1; i >= 1; i--) {
      l2[i] = Math.max(l2[i + 1], p[i][0]);
      r2[i] = Math.min(r2[i + 1], p[i][1]);
    }


    long ret = 0;
    long l1 = 0;
    long r1 = Integer.MAX_VALUE;
    for (int i = 1; i <= n - 1; i++) {
      l1 = Math.max(l1, p[i - 1][0]);
      r1 = Math.min(r1, p[i - 1][1]);

      long cnt = Math.max(0, (r1 - l1 + 1)) + Math.max(0, (r2[i] - l2[i] + 1));
      ret = Math.max(ret, cnt);
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

