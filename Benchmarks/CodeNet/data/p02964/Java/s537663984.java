
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  private static void solve() {
    int n = ni();
    long k = nl();
    int[] a = na(n);
    int[] next = new int[n];
    int[] step = new int[n];

    Map<Integer, Integer> pre = new HashMap<>();

    for (int i = 0; i < n * 2; i++) {
      int v = a[i % n];
      if (!pre.containsKey(v)) {
        pre.put(v, i % n);
      } else {
        next[pre.get(v)] = i % n;
        pre.put(v, i % n);
      }
    }

    for (int i = 0; i < n; i++) {
      if (next[i] > i) {
        step[i] = next[i] - i + 1;
      } else {
        step[i] = (n - i) + next[i] + 1;
      }
      next[i] = (next[i] + 1) % n;
    }

    long cycle = 0;
    long cnt = n * k;

    int now = 0;
    while (true) {
      cycle += step[now];
      now = next[now];
      if (now == 0)
        break;
    }
    cnt %= cycle;

    while (step[now] <= cnt) {
      cnt -= step[now];
      now = next[now];
    }

    pre.clear();
    int[] ret = new int[n];
    int ptr = 0;
    for (int i = 0; i < cnt; i++) {
      int idx = (i + now) % n;

      if (pre.containsKey(a[idx])) {
        ptr = pre.get(a[idx]);
        pre.remove(a[idx]);
      } else {
        pre.put(a[idx], ptr);
        ret[ptr++] = a[idx];
      }
    }

    System.err.println(Arrays.toString(next));
    System.err.println(Arrays.toString(step));
    System.err.println(cycle);
    System.err.println(now);
    System.err.println(cnt);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < ptr; i++) {
      sb.append(ret[i] + " ");
    }
    System.out.println(sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
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

