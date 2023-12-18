
public class Main {

  private static void solve() {
    long t1 = nl();
    long t2 = nl();

    long a1 = nl();
    long a2 = nl();

    long b1 = nl();
    long b2 = nl();
    long ret = solve1(t1, t2, a1, a2, b1, b2);
    if (ret < 0) {
      System.out.println("infinity");
    } else {
      System.out.println(ret);
    }

    // long t1 = 3;
    // long t2 = 5;
    //
    // for (long a1 = 1; a1 < 15; a1++) {
    // for (long a2 = 1; a2 < 15; a2++) {
    // for (long b1 = 1; b1 < 15; b1++) {
    // for (long b2 = 1; b2 < 15; b2++) {
    // long ret1 = solve1(t1, t2, a1, a2, b1, b2);
    // long ret2 = solve2(t1, t2, a1, a2, b1, b2);
    //
    // if (ret1 != ret2) {
    // System.out.printf("%d %d (%d %d %d %d)", ret1, ret2, a1, a2, b1, b2);
    // if (ret1 != ret2) {
    // System.out.println("NG");
    // } else {
    // System.out.println();
    // }
    // }
    // }
    // }
    // }
    // }
  }

  private static long solve1(long t1, long t2, long a1, long a2, long b1, long b2) {
    if (a1 > b1) {
      long tmp = a1;
      a1 = b1;
      b1 = tmp;

      tmp = a2;
      a2 = b2;
      b2 = tmp;
    }

    // a1 < b1

    long sa = t1 * a1 + t2 * a2;
    long sb = t1 * b1 + t2 * b2;
    if (sa == sb) {
      return -1;
    }

    if (a1 == b1) {
      return 1;
    }

    if (sa < sb) {
      return 0;
    }

    // a1 < b1 && a2 > b2, sa > sb
    long n = (b1 - a1) * t1 / (sa - sb);
    return n * 2 + 1;
  }

  private static long solve2(long t1, long t2, long a1, long a2, long b1, long b2) {
    long sa = t1 * a1 + t2 * a2;
    long sb = t1 * b1 + t2 * b2;
    if (sa == sb) {
      return -1;
    }

    long inf = 1000000;
    long a = 0;
    long b = 0;
    long ret = 0;
    for (int i = 0; i < inf; i++) {
      long na, nb;
      if (i % 2 == 0) {
        na = a + a1 * t1;
        nb = b + b1 * t1;
      } else {
        na = a + a2 * t2;
        nb = b + b2 * t2;
      }
      if (i > 0 && Long.signum(na - nb) != Long.signum(a - b)) {
        ret++;
      }
      a = na;
      b = nb;
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

