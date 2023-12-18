
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  private static void solve() {
    long n = ni();
    long x = ni();
    long d = ni();

    if (d == 0 && x != 0) {
      System.out.println(n + 1);
      return;
    } else if (d != 0 && x == 0) {
      System.out.println(n * (n - 1) / 2 + 1);
    } else if (d == 0 && x == 0) {
      System.out.println(1);
    }

    if (d < 0) {
      d = -d;
      x = -x;
    }

    Map<Long, List<long[]>> map = new HashMap<>();
    for (long k = 0; k <= n; k++) {
      long min = k * x + k * (k - 1) / 2 * d;
      long max = k * x + k * (2 * n - k - 1) / 2 * d;

      long key = min % d;
      if (key < 0) {
        key += d;
      }

      map.putIfAbsent(key, new ArrayList<>());
      map.get(key).add(new long[] {(min - key) / d, (max - key) / d});
    }

    long ret = 0;
    for (List<long[]> list : map.values()) {
      long left = 0;
      long right = 0;

      boolean first = true;
      Collections.sort(list, (o1, o2) -> Long.signum(o1[0] - o2[0]));
      for (long[] v : list) {
        if (first) {
          left = v[0];
          right = v[1];
          first = false;
        } else if (v[0] <= right) {
          right = v[1];
        } else {
          ret += right - left + 1;
          left = v[0];
          right = v[1];
        }
      }
      ret += right - left + 1;
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

