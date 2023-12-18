
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    int[] becc = decomposeToBECC(g);

    System.out.println(Arrays.stream(becc).max().getAsInt());
  }

  public static int[][] packU(int n, int[] from, int[] to) {
    return packU(n, from, to, from.length);
  }

  public static int[][] packU(int n, int[] from, int[] to, int sup) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
      p[from[i]]++;
    for (int i = 0; i < sup; i++)
      p[to[i]]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < sup; i++) {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
  }

  public static int[] decomposeToBECC(int[][] g) {
    int n = g.length;
    boolean[] visited = new boolean[n];
    int[] ord = new int[n];
    int[] low = new int[n];

    int[] ids = new int[n];
    int[] inds = new int[n];
    int[] parct = new int[n];
    int pos = 0;
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        ids[0] = i;
        inds[0] = 0;
        int sp = 1;
        while (sp > 0) {
          int cur = ids[sp - 1];
          if (inds[sp - 1] == 0) {
            visited[cur] = true;
            ord[cur] = low[cur] = pos++;
            parct[sp - 1] = 0;
          }
          if (inds[sp - 1] == g[cur].length) {
            if (sp - 2 >= 0)
              low[ids[sp - 2]] = Math.min(low[ids[sp - 2]], low[cur]);
            sp--;
            continue;
          }
          int next = g[cur][inds[sp - 1]];
          if (!visited[next]) {
            ids[sp] = next;
            inds[sp] = 0;
            inds[sp - 1]++;
            sp++;
            continue;
          } else if (sp - 2 >= 0 && (next != ids[sp - 2] || ++parct[sp - 1] >= 2)) {
            low[cur] = Math.min(low[cur], ord[next]);
          }
          inds[sp - 1]++;
        }
      }
    }

    int[] clus = new int[n];
    Arrays.fill(clus, -1);
    int[] q = new int[n];
    int cnum = 0;
    for (int i = 0; i < n; i++) {
      if (clus[i] == -1) {
        int p = 0;
        q[p++] = i;
        clus[i] = cnum++;
        for (int r = 0; r < p; r++) {
          int cur = q[r];
          for (int next : g[cur]) {
            if (clus[next] == -1) {
              clus[next] = ord[cur] < low[next] ? cnum++ : clus[cur];
              q[p++] = next;
            }
          }
        }
      }
    }
    return clus;
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


