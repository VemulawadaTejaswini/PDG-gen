
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {


  private static void solve() {
    int n = ni();
    int[] v = na(n);
    Map<Integer, Integer> cnt1 = new HashMap<>();
    Map<Integer, Integer> cnt2 = new HashMap<>();
    for (int i = 0; i < n; i ++) {
      if (i % 2 == 0) {
        if (cnt1.containsKey(v[i])) {
          cnt1.put(v[i], cnt1.get(v[i]) + 1);
        } else {
          cnt1.put(v[i], 1);
        }
      } else {
        if (cnt2.containsKey(v[i])) {
          cnt2.put(v[i], cnt2.get(v[i]) + 1);
        } else {
          cnt2.put(v[i], 1);
        }
      }
    }
    List<int[]> list1 = new ArrayList<>();
    List<int[]> list2 = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : cnt1.entrySet()) {
      list1.add(new int[] {entry.getKey(), entry.getValue()});
    }
    for (Map.Entry<Integer, Integer> entry : cnt2.entrySet()) {
      list2.add(new int[] {entry.getKey(), entry.getValue()});
    }
    
    Collections.sort(list1, (o1, o2) -> o2[1] - o1[1]);
    Collections.sort(list2, (o1, o2) -> o2[1] - o1[1]);

    int all1 = n / 2;
    int all2 = n / 2;
    long ret = Long.MAX_VALUE;
    for (int i = 0; i < Math.min(20, list1.size()); i ++) {
      for (int j = 0; j < Math.min(20, list2.size()); j ++) {
        int[] a = list1.get(i);
        int[] b = list2.get(j);
        
        if (a[0] == b[0]) continue;
        
        long now = (all1 - a[1]) + (all2 - b[1]);
        ret = Math.min(now, ret);
      }
    }
    if (ret == Long.MAX_VALUE) {
      System.out.println(Math.min(list1.get(0)[1], list2.get(0)[1]));
    } else {
      System.out.println(ret);
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
