
import java.util.Arrays;
import java.util.PriorityQueue;



public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    long[][] p = new long[m][3];
    for (int i = 0; i < m; i++) {
      p[i][0] = ni() - 1;
      p[i][1] = ni();
      p[i][2] = ni();
    }

    long[][] pl = Arrays.copyOf(p, m);
    long[][] pr = Arrays.copyOf(p, m);
    Arrays.sort(pl, (o1, o2) -> Long.signum(o1[0] - o2[0]));
    Arrays.sort(pr, (o1, o2) -> Long.signum(o1[1] - o2[1]));

    PriorityQueue<long[]> q = new PriorityQueue<>((o1, o2) -> Long.signum(o1[2] - o2[2]));

    long[] dp = new long[n + 1];
    long inf = Long.MAX_VALUE / 2;
    Arrays.fill(dp, inf);
    dp[0] = 0;


    int lp = 0;
    int rp = 0;
    for (int i = 0; i < n; i++) {
      while (rp < m && pr[rp][1] == i) {
        q.remove(pr[rp++]);
      }
      if (i > 0) {
        long[] u = q.peek();
        if (u == null) {
          System.out.println(-1);
          return;
        }
        dp[i] = u[2];
      }
      while (lp < m && pl[lp][0] == i) {
        pl[lp][2] += dp[i];
        q.add(pl[lp++]);
      }
    }

    System.out.println(dp[n - 1]);

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

