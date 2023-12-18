
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int n = ni();
    long[][] s = new long[1 << n][2];
    long[][] t = new long[1 << n][2];

    for (int i = 0; i < (1 << n); i++) {
      s[i][0] = nl();
      s[i][1] = i;
    }
    Arrays.sort(s, (o1, o2) -> Long.compare(o2[0], o1[0]));
    Comparator<long[]> comp = (o1, o2) -> {
      if (o1[0] == o2[0]) {
        return Long.compare(o1[1], o2[1]);
      } else {
        return Long.compare(o1[0], o2[0]);
      }
    };
    TreeSet<long[]> set1 = new TreeSet<>(comp);
    TreeSet<long[]> set2 = new TreeSet<>(comp);

    set1.add(s[0]);
    s = Arrays.copyOfRange(s, 1, 1 << n);

    int ptr = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (1 << n) - (1 << i); j++) {
        long[] v = set1.higher(new long[] {s[j][0], Long.MAX_VALUE});
        if (v == null) {
          t[ptr++] = s[j];
        } else {
          set1.remove(v);
          set2.add(v);
          set2.add(s[j]);
        }
      }

      if (set1.size() > 0) {
        System.out.println("No");
        return;
      }

      TreeSet<long[]> tmp = set1;
      set1 = set2;
      set2 = tmp;
      ptr = 0;

      long[][] tmp2 = t;
      t = s;
      s = tmp2;
    }
    System.out.println("Yes");

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

