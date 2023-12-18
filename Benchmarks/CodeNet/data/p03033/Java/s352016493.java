
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
  private static void solve() {
    int n = ni();
    int q = ni();
    int[][] p = new int[n][4];

    for (int i = 0; i < n; i++) {
      int s = ni();
      int t = ni();
      int x = ni();
      p[i][0] = s - x;
      p[i][1] = t - x;
      p[i][2] = x;
      p[i][3] = i;
    }
    Arrays.sort(p, (o1, o2) -> o1[0] == o2[0] ? o1[3] - o2[3] : o1[0] - o2[0]);

    PriorityQueue<int[]> q1 =
        new PriorityQueue<>((o1, o2) -> o1[1] == o2[1] ? o1[3] - o2[3] : o1[1] - o2[1]);
    PriorityQueue<int[]> q2 =
        new PriorityQueue<>((o1, o2) -> o1[2] == o2[2] ? o1[3] - o2[3] : o1[2] - o2[2]);

    int ptr = 0;
    for (int i = 0; i < q; i++) {
      int d = ni();

      while (ptr < n && p[ptr][0] <= d) {
        q1.add(p[ptr]);
        q2.add(p[ptr]);
        ptr++;
      }

      while (q1.size() > 0 && q1.peek()[1] <= d) {
        int[] v = q1.poll();
        q2.remove(v);
      }

      if (q2.size() > 0) {
        out.println(q2.peek()[2]);
      } else {
        out.println(-1);
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
