
public class Main {
  private static void solve() {
    int n = ni();
    int q = ni();
    char[] s = ns();
    
    int[][] query = new int[q][2];
    for (int i = 0; i < q; i ++) {
      query[i][0] = ns()[0];
      query[i][1] = next().equals("L") ? -1 : 1;
    }

    int[] ret = new int[2];
    for (int j = 0; j < 2; j ++) {
      int ok = j == 0 ? -1 : n;
      int ng = j == 0 ? n : -1;
      while (Math.abs(ng - ok) > 1) {
        int k = (ok + ng) / 2;
        
        int p = k;
        boolean flg = false;
        for (int i = 0; i < q; i ++) {
          if (query[i][0] == s[p]) {
            p += query[i][1];
          }
          if (j == 0 && p < 0 || j == 1 && p >= n) {
            flg = true;
            break;
          }
        }
        
        if (flg) {
          ok = k;
        } else {
          ng = k;
        }
      }
      ret[j] = j == 0 ? (ok + 1) : (n - ok);
    }

    System.out.println(Math.max(0, n - (ret[0] + ret[1])));
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
