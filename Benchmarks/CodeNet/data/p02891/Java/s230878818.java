
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  private static void solve() {
    char[] s = ns();
    int n = s.length;
    long k = ni();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = 10000 + s[i];
    }


    Set<Integer> set = new HashSet<>();
    for (int v : a) {
      set.add(v);
    }
    if (set.size() == 1) {
      System.out.println(n * k / 2);
      return;
    }


    long ret = 0;

    int cnt = 1;
    int v = a[0];
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < n; i++) {
      if (v == a[i]) {
        cnt++;
      } else {
        list.add(cnt);
        cnt = 1;
        v = a[i];
      }
    }
    list.add(cnt);

    if (a[0] == a[n - 1]) {
      for (int i = 1; i < list.size() - 1; i++) {
        ret += list.get(i) / 2 * k;
      }
      ret += (list.get(0) + list.get(list.size() - 1)) / 2 * (k - 1);
      ret += list.get(0) / 2;
      ret += list.get(list.size() - 1) / 2;
    } else {
      for (int i = 0; i < list.size(); i++) {
        ret += list.get(i) / 2 * k;
      }

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
