
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    int q = ni();


    int[][] range = ntable(m, 2);

    int[][] query = new int[q][4];
    for (int i = 0; i < q; i++) {
      query[i][0] = ni();
      query[i][1] = ni();
      query[i][2] = i;
    }

    int[] cnt = new int[n + 1];
    Arrays.sort(range, (o1, o2) -> o1[1] - o2[1]);
    Arrays.sort(query, (o1, o2) -> o1[1] - o2[1]);

    int rp = 0;
    int qp = 0;
    for (int r = 1; r <= n; r++) {
      while (rp < m && range[rp][1] <= r) {
        cnt[range[rp][0]]++;
        rp++;
      }

      while (qp < q && query[qp][1] <= r) {
        for (int i = query[qp][0]; i <= query[qp][1]; i++) {
          query[qp][3] += cnt[i];
        }
        qp++;
      }
    }

    Arrays.sort(query, (o1, o2) -> o1[2] - o2[2]);
    for (int[] v : query) {
      out.println(v[3]);
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

