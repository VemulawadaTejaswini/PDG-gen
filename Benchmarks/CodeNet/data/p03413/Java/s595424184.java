
import java.util.ArrayList;
import java.util.List;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    
    int[] p = new int[n / 2 + (n % 2 == 1 ? 1 : 0)];
    int[] q = new int[n / 2];
    
    for (int i = 0; i < n; i ++) {
      if (i % 2 == 0) {
        p[i / 2] = a[i];
      } else {
        q[i / 2] = a[i];
      }
    }
    long[] ret1 = f(p);
    long[] ret2 = f(q);

    List<Long> list = new ArrayList<>();
    long x = 0, y = 0;
    long max = 0;
    if (ret1[0] > ret2[0]) {
      x = ret1[1] * 2;
      y = n - ret1[2] * 2;
      max = ret1[0];
    } else {
      x = ret2[1] * 2 + 1;
      y = n - ret2[2] * 2;
      max = ret2[0];
    }
    
    for (int i = 0; i < x; i ++) {
      list.add(1L);
    }
    for (int i = 0; i < y; i ++) {
      list.add(n - x - i);
    }
    for (int i = 0; i < (n - (x + y)) / 2; i ++) {
      list.add(2L);
    }

    System.out.println(max);
    System.out.println(list.size());
    for (long v : list) {
      System.out.println(v);
    }
  }
  
  private static long[] f(int[] a) {
    int n = a.length;
    long[] sum = new long[n + 1];
    for (int i = 0; i < n; i ++) {
      sum[i + 1] = sum[i] + a[i];
    }
    
    long max = 0;
    int mi = 0, mj = 0;
    for (int i = 0; i < n; i ++) {
      for (int j = i + 1; j <= n; j ++) {
        long now = sum[j] - sum[i];
        if (now > max) {
          max = now;
          mi = i;
          mj = j;
        }
      }
    }
    return new long[] {max, mi, mj};
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


