
import java.util.Arrays;

public class Main {
  private static void solve() {
    int h = ni();
    int w = ni();
    int k = ni();

    char[][] s = new char[h][w];
    for (int i = 0; i < h; i++) {
      s[i] = ns();
    }

    int ret = Integer.MAX_VALUE;
    int m = 1 << (h - 1);
    for (int i = 0; i < m; i++) {
      int[] cnt = new int[10];
      int[] idx = new int[h];
      int p = 0;
      for (int j = 0; j < h; j++) {
        if (j == 0) {
          idx[j] = 0;
        } else {
          if (((i >> (j - 1)) & 1) == 1) {
            p++;
          }
          idx[j] = p;
        }
      }
      int now = Integer.bitCount(i);

      outer: for (int j = 0; j < w; j++) {
        for (int t = 0; t < h; t++) {
          if (s[t][j] == '1') {
            if (cnt[idx[t]] == k) {
              now++;
              Arrays.fill(cnt, 0);
              j--;
              continue outer;
            }
            cnt[idx[t]]++;
          }
        }
      }
      ret = Math.min(ret, now);
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
