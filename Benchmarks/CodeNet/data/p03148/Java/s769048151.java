
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
  private static void solve() {
    int n = ni();
    int k = ni();
    int[][] p = ntable(n, 2);
    
    Arrays.sort(p, (o1, o2) -> o2[1] - o1[1]);
    Map<Integer, Deque<int[]>> map = new HashMap<>();
    long ret = 0;
    for (int i = 0; i < k; i ++) {
      int c = p[i][0];
      map.putIfAbsent(c, new ArrayDeque<>());
      map.get(c).add(p[i]);
      
      ret += p[i][1];
    }
    long sum = ret;
    long x = map.size();
    ret += x * x;
    
    PriorityQueue<Deque<int[]>> q = new PriorityQueue<>((o1, o2) -> o1.peekLast()[1] - o2.peekLast()[1]);
    for (Deque<int[]> dq : map.values()) {
      if (dq.size() > 1) {
        q.add(dq);
      }
    }
    
    
    for (int i = k; i < n && q.size() > 0; i ++) {
      int c = p[i][0];
      if (map.containsKey(c)) {
        continue;
      }
      Deque<int[]> dq = q.poll();
      sum += p[i][1] - dq.pollLast()[1];

      map.putIfAbsent(c, new ArrayDeque<>());
      map.get(c).add(p[i]);
      
      long y = map.size();
      long now = sum + y * y;
      ret = Math.max(now, ret);
      
      if (dq.size() > 1) {
        q.add(dq);
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
