
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int[] x = na(n);

    int[][] b = new int[n][2];
    for (int i = 0; i < n; i++) {
      b[i][0] = i + 1;
      b[i][1] = x[i] - 1;
    }
    Arrays.sort(b, (o1, o2) -> o1[1] - o2[1]);
    int bp = 0;

    ArrayDeque<Integer> q2 = new ArrayDeque<>();

    int sp = 0;
    int[] ret = new int[n * n];
    for (int i = 0; i < n * n; i++) {
      if (bp < n && b[bp][1] == i) {
        int v = b[bp][0];
        int last = n - v;

        for (int j = 0; j < v - 1; j++) {
          while (sp < n * n && ret[sp] != 0) {
            sp++;
          }
          if (sp >= i) {
            System.out.println("No");
            return;
          }
          ret[sp++] = v;
        }
        ret[i] = v;

        for (int j = 0; j < last; j++) {
          q2.add(b[bp][0]);
        }
        bp++;
      } else if (q2.size() > 0) {
        ret[i] = q2.poll();
      }
    }


    out.println("Yes");
    for (int i = 0; i < n * n; i++) {
      out.print(ret[i] + " ");
    }
    out.println();
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

