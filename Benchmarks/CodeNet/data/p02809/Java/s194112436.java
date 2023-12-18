
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int n = ni();
    int[] a = new int[n];
    TreeSet<Integer> q = new TreeSet<>();
    int[] cnt = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = ni() - 1;
      cnt[a[i]]++;
      q.add(i);
    }

    TreeSet<Integer> q2 = new TreeSet<>((o1, o2) -> {
      if (cnt[o2] == cnt[o1]) {
        return o1 - o2;
      } else {
        return cnt[o2] - cnt[o1];
      }
    });
    for (int i = 0; i < n; i++) {
      q2.add(i);
    }

    StringBuilder sb = new StringBuilder();
    int pre = -1;
    Deque<Integer> deq = new ArrayDeque<>();
    boolean[] used = new boolean[n];
    while (q.size() > 0) {
      if (cnt[q2.first()] >= q.size() - 1 && !used[q2.first()]) {
        int v = q2.first();
        if (pre >= 0 && a[pre] == v) {
          System.out.println(-1);
          return;
        }
        q.remove(v);
        q2.remove(v);
        cnt[v]--;
        q2.add(v);
        sb.append(v + 1 + " ");
        used[v] = true;
        pre = v;
      } else {
        while (q.size() > 0 && pre >= 0 && a[pre] == q.first()) {
          deq.add(q.pollFirst());
        }

        if (q.size() == 0) {
          System.out.println(-1);
          return;
        }
        pre = q.pollFirst();
        sb.append(pre + 1 + " ");
        used[pre] = true;

        for (int v : deq) {
          q.add(v);
        }
        deq.clear();

        q2.remove(pre);
        cnt[pre]--;
        q2.add(pre);
      }
    }
    System.out.println(sb);

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

