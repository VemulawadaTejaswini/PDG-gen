
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    int[] b = na(n);

    long cost = 0;
    int now = 50;
    int[] c = Arrays.copyOf(a, n);
    boolean cf = false;
    for (int k = 0; k < 100; k ++) {
      cf = false;
      for (int i = 0; i < n; i ++) {
        if (c[i] != b[i]) {
          cf = true;
          break;
        }
      }
      if (!cf) { break; }

      loop: for (int i = 1; i <= now; i ++) {
        
        for (int j = 0; j < n; j ++) {
          if (b[j] >= i) {
            continue loop;
          }
  
          boolean flg = false;
          for (int p = i; p >= 1; p --) {
            if (c[j] % p == b[j]) {
              flg = true;
              break;
            }
          }
          if (!flg) {
            continue loop;
          }
        }
        
        for (int j = 0; j < n; j ++) {
          if (c[j] % i >= b[j]) 
            c[j] %= i;
        }
        cost += 1L << i;
        now = i - 1;
        break;
      }
    }
    System.out.println(cf ? -1 : cost);
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


