
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int[] p = na(n * n);

    int[][] map = new int[n][n];
    int[][] pos = new int[n * n][2];
    int ptr = 0;
    for (int i = 0; i < n * n; i++) {
      p[i]--;
      int y = p[i] / n;
      int x = p[i] % n;

      pos[ptr][0] = y;
      pos[ptr][1] = x;

      map[y][x] = ptr++;
    }

    long ret = 0;

    int[] ved = new int[n * n];
    for (int i = 0; i < n * n; i++) {
      int now = bfs(map, i, ved);
      ret += now;
    }
    System.out.println(ret);
  }

  static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  public static int bfs(int[][] map, int from, int[] ved) {
    int n = map.length;
    int v = map[from / n][from % n];

    ArrayDeque<int[]> q = new ArrayDeque<>();
    q.add(new int[] {from, 0});
    ved[from] = v;

    while (q.size() > 0) {
      int[] x = q.pollFirst();

      int cur = x[0];
      int cd = x[1];
      int cy = cur / n;
      int cx = cur % n;

      for (int[] d : dir) {
        int ny = cy + d[0];
        int nx = cx + d[1];
        if (ny < 0 || nx < 0 || ny >= n || nx >= n) {
          return cd;
        }
        int nex = ny * n + nx;

        if (ved[nex] != v) {
          ved[nex] = v;
          if (map[ny][nx] < v) {
            q.addFirst(new int[] {nex, cd});
          } else {
            q.addLast(new int[] {nex, cd + 1});
          }
        }
      }
    }
    return -1;
  }



  public static class MinHeap {
    public int[] a;
    public int[] map;
    public int[] imap;
    public int n;
    public int pos;
    public static int INF = Integer.MAX_VALUE;

    public MinHeap(int m) {
      n = m + 2;
      a = new int[n];
      map = new int[n];
      imap = new int[n];
      Arrays.fill(a, INF);
      Arrays.fill(map, -1);
      Arrays.fill(imap, -1);
      pos = 1;
    }

    public int add(int ind, int x) {
      int ret = imap[ind];
      if (imap[ind] < 0) {
        a[pos] = x;
        map[pos] = ind;
        imap[ind] = pos;
        pos++;
        up(pos - 1);
      }
      return ret != -1 ? a[ret] : x;
    }

    public int update(int ind, int x) {
      int ret = imap[ind];
      if (imap[ind] < 0) {
        a[pos] = x;
        map[pos] = ind;
        imap[ind] = pos;
        pos++;
        up(pos - 1);
      } else {
        int o = a[ret];
        a[ret] = x;
        up(ret);
        down(ret);
        // if(a[ret] > o){
        // up(ret);
        // }else{
        // down(ret);
        // }
      }
      return x;
    }

    public int remove(int ind) {
      if (pos == 1)
        return INF;
      if (imap[ind] == -1)
        return INF;

      pos--;
      int rem = imap[ind];
      int ret = a[rem];
      map[rem] = map[pos];
      imap[map[pos]] = rem;
      imap[ind] = -1;
      a[rem] = a[pos];
      a[pos] = INF;
      map[pos] = -1;

      up(rem);
      down(rem);
      return ret;
    }

    public int min() {
      return a[1];
    }

    public int argmin() {
      return map[1];
    }

    public int size() {
      return pos - 1;
    }

    private void up(int cur) {
      for (int c = cur, p = c >>> 1; p >= 1 && a[p] > a[c]; c >>>= 1, p >>>= 1) {
        int d = a[p];
        a[p] = a[c];
        a[c] = d;
        int e = imap[map[p]];
        imap[map[p]] = imap[map[c]];
        imap[map[c]] = e;
        e = map[p];
        map[p] = map[c];
        map[c] = e;
      }
    }

    private void down(int cur) {
      for (int c = cur; 2 * c < pos;) {
        int b = a[2 * c] < a[2 * c + 1] ? 2 * c : 2 * c + 1;
        if (a[b] < a[c]) {
          int d = a[c];
          a[c] = a[b];
          a[b] = d;
          int e = imap[map[c]];
          imap[map[c]] = imap[map[b]];
          imap[map[b]] = e;
          e = map[c];
          map[c] = map[b];
          map[b] = e;
          c = b;
        } else {
          break;
        }
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

