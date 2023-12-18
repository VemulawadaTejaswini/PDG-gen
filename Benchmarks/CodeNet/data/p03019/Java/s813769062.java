
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


  private static void solve() {
    int n = ni();
    long x = ni();
    long[][] p = new long[n][3];

    for (int i = 0; i < n; i++) {
      p[i][0] = ni(); // b
      p[i][1] = ni(); // l
      p[i][2] = ni(); // u
    }


    Arrays.sort(p, (o1, o2) -> {
      long v1 = (x - o1[0]) * o1[2];
      long v2 = (x - o2[0]) * o2[2];
      return Long.compare(v2, v1);
    });


//    long ok = 2542;// Long.MAX_VALUE / 20;
//    long ng = 2538;// -1;
     long ok = Long.MAX_VALUE / 20;
     long ng = -1;

    while (ok - ng > 1) {
      long k = (ok + ng) / 2;

      if (ok(k, x, p)) {
        ok = k;
      } else {
        ng = k;
      }
    }
    System.out.println(ok);
  }

  private static boolean ok(long y, long x, long[][] p) {
    int n = p.length;

    // boolean[] high = new boolean[n];
    // for (int i = 0; i < (1 << n); i++) {
    // long last = y;
    //
    // List<Long> listH = new ArrayList<>();
    // List<Long> listL = new ArrayList<>();
    // long score = 0;
    // for (int j = 0; j < n; j++) {
    // if (((i >> j) & 1) == 1) {
    // high[j] = true;
    // score -= p[j][0] * p[j][2];
    // listH.add(p[j][2]);
    // } else {
    // score -= p[j][0] * p[j][1];
    // listL.add(p[j][1]);
    // }
    // }
    //
    // Collections.sort(listH);
    // Collections.sort(listL);
    // Collections.reverse(listL);
    // Collections.reverse(listH);
    //
    // for (long h : listH) {
    // long v = Math.min(x, last);
    // score += h * v;
    // last -= v;
    // }
    // for (long h : listL) {
    // long v = Math.min(x, last);
    // score += h * v;
    // last -= v;
    // }
    // if (score >= 0) {
    // return true;
    // }
    //
    // }
    // return false;

    long maxL = 0;
    int maxLArg = -1;
    long score = 0;
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (y >= x) {
        score += (x - p[i][0]) * p[i][2];
        y -= x;
      } else {
        score += -p[i][0] * p[i][1];

        long nowL = (y - p[i][0]) * (y < p[i][0] ? p[i][1] : p[i][2]) + (p[i][0] * p[i][1]);
        if (maxL < nowL) {
          maxLArg = i;
          maxL = nowL;
        }
      }

    }
    score += maxL;
    return score >= 0;
    
  }

  private static boolean ok2(long y, long x, long[][] p) {
    int n = p.length;

 
    long score = 0;
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (y >= x) {
        score += (x - p[i][0]) * p[i][2];
        y -= x;
      } else {
        score += -p[i][0] * p[i][1];
        list.add(p[i][1]);
      }
 
    }
    Collections.sort(list);
    Collections.reverse(list);
    for (long h : list) {
      long v = Math.min(x, y);
      long z = h * v;
      score += z;
      y -= v;
    }
 
    return score >= 0;
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
