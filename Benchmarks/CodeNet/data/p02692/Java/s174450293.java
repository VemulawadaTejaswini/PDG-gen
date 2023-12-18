
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static void solve() {
    int n = ni();
    int[] a = na(3);

    int[][] p = new int[n][2];
    for (int i = 0; i < n; i++) {
      char[] s = ns();
      p[i][0] = s[0] - 'A';
      p[i][1] = s[1] - 'A';
    }

    List<Character> ret = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int x = p[i][0];
      int y = p[i][1];
      if (a[x] == 0 && a[y] == 0) {
        ret = null;
        break;
      } else if (a[x] < a[y]) {
        ret.add((char) ('A' + x));
        a[x]++;
        a[y]--;
      } else if (a[x] > a[y]) {
        ret.add((char) ('A' + y));
        a[x]--;
        a[y]++;
      } else {
        if (a[x] == 1 && a[y] == 1 && i < n - 1) {
          if (x == p[i + 1][0] || x == p[i + 1][1]) {
            ret.add((char) ('A' + x));
            a[x]++;
            a[y]--;
          } else {
            ret.add((char) ('A' + y));
            a[x]--;
            a[y]++;
          }
        } else {
          ret.add((char) ('A' + x));
          a[x]++;
          a[y]--;
        }
      }
    }

    if (ret == null) {
      out.println("No");
    } else {
      out.println("Yes");
      for (char c : ret) {
        out.println(c);
      }
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

