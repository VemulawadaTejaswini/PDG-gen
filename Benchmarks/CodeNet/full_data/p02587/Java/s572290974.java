import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int n = ni();
    String[] s = new String[n];
    long[] c = new long[n];

    for (int i = 0; i < n; i++) {
      s[i] = next();
      c[i] = ni();
    }

    System.out.println(dijk(s, c));
  }

  public static long dijk(String[] s, long[] c) {
    int n = s.length;
    Map<String, Long> d = new HashMap<>();

    TreeSet<String[]> q = new TreeSet<>((o1, o2) -> {
      String key1 = o1[0] + "$" + o1[1];
      String key2 = o2[0] + "$" + o2[1];
      long d1 = d.getOrDefault(key1, Long.MAX_VALUE);
      long d2 = d.getOrDefault(key2, Long.MAX_VALUE);

      if (d1 == d2) {
        return key1.compareTo(key2);
      } else {
        return Long.compare(d1, d2);
      }
    });

    for (int i = 0; i < n; i++) {
      int m = s[i].length();
      for (int j = 0; j <= m; j++) {
        String[] t1 = trim(s[i].substring(0, j), s[i].substring(j));
        if (c[i] < d.getOrDefault(t1, Long.MAX_VALUE)) {
          d.put(t1[0] + "$" + t1[1], c[i]);
          q.add(t1);
        }

        if (j < m) {
          String[] t2 = trim(s[i].substring(0, j), s[i].substring(j + 1));
          if (c[i] < d.getOrDefault(t2, Long.MAX_VALUE)) {
            d.put(t2[0] + "$" + t2[1], c[i]);
            q.add(t2);
          }
        }
      }
    }

    int max = 0;
    for (String t : s) {
      max = Math.max(max, t.length());
    }

    while (q.size() > 0) {
      String[] cur = q.pollFirst();

      for (int i = 0; i < n; i++) {
        for (String[] next : nex(cur, s[i])) {
          if (!check(next, max))
            continue;
          String key = next[0] + "$" + next[1];
          long nd = d.get(cur[0] + "$" + cur[1]) + c[i];
          if (nd < d.getOrDefault(key, Long.MAX_VALUE)) {
            q.remove(next);
            d.put(key, nd);
            q.add(next);
          }
        }
      }
    }

    return d.getOrDefault("$", -1L);
  }

  private static boolean check(String[] cur, int n) {
    return cur[0].length() <= n && cur[1].length() <= n;
  }

  private static String[][] nex(String[] cur, String s) {
    return new String[][] { trim(s + cur[0], cur[1]), trim(cur[0], cur[1] + s) };
  }

  private static String[] trim(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) {
      return new String[] { s1, s2 };
    }

    int i = 0;
    for (; i < Math.min(s1.length(), s2.length()); i++) {
      if (s1.charAt(s1.length() - i - 1) != s2.charAt(i)) {
        break;
      }
    }
    return new String[] { s1.substring(0, s1.length() - i), s2.substring(i) };
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
