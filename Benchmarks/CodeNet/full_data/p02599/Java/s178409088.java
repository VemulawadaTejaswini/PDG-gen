import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int q = ni();
    int[] a = na(n);
    int[][] qs = new int[n][3];
    for (int i = 0; i < q; i++) {
      qs[i][0] = i;
      qs[i][1] = ni() - 1;
      qs[i][2] = ni() - 1;
    }
    int s = (int) Math.sqrt(n);
    Arrays.sort(qs, (o1, o2) -> {
      int key1 = o1[1] / s - o2[1] / s;
      int key2 = o1[2] - o2[2];
      if (key1 == 0) {
        return (key1 & 1) == 1 ? -key2 : key2;
      } else {
        return key1;
      }
    });

    moTemplate(qs, n, q, a);
  }

  public static void moTemplate(int[][] qs, int n, int Q, int[] a) {
    int L = 0, R = -1;

    int[] cnt = new int[n + 1];
    int[] ret = new int[Q];
    int ans = 0;
    for (int[] q : qs) {
      int ql = q[1], qr = q[2];
      while (R < qr) {
        R++;
        cnt[a[R]]++;
        if (cnt[a[R]] == 1) {
          ans++;
        }
      }
      while (L > ql) {
        L--;
        cnt[a[L]]++;
        if (cnt[a[L]] == 1) {
          ans++;
        }
      }
      while (R > qr) {
        cnt[a[R]]--;
        if (cnt[a[R]] == 0) {
          ans--;
        }
        R--;
      }
      while (L < ql) {
        cnt[a[L]]--;
        if (cnt[a[L]] == 0) {
          ans--;
        }
        L++;
      }
      ret[q[0]] = ans;
    }

    for (int v : ret) {
      out.println(v);
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
