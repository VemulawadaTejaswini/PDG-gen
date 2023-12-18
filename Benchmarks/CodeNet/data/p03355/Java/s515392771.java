import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class SuffixArray {
    private final String str;
    public final Integer[] array;

    public SuffixArray(final String str) {
        final int n = str.length();
        this.array = new Integer[n];
        this.str = str;

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i1 = o1;
                int i2 = o2;
                int N = Math.min(n - i1, n - i2);
                for (int i = 0; i < N; i++) {
                    if (str.charAt(i1 + i) < str.charAt(i2 + i))
                        return -1;
                    if (str.charAt(i1 + i) > str.charAt(i2 + i))
                        return +1;
                }
                return i2 - i1;
            }
        });
    }

    public int[] lcp() {
        int n = str.length();
        int[] inv = new int[n];
        int[] lcp = new int[n];
        for (int i = 0; i < n; i++) {
            inv[array[i]] = i;
        }
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (inv[i] == n - 1) {
                continue;
            }
            h = Math.max(h - 1, 0);
            int j = array[inv[i] + 1];
            while (i + h < n && j + h < n && str.charAt(i + h) == str.charAt(j + h)) {
                h++;
            }
            lcp[inv[i]] = h;
        }
        return lcp;
    }

    public String search(String word) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            String suffix = str.substring(array[mid]);
            int cmp = word.compareTo(suffix);
            if (cmp == 0) {
                break;
            } else if (cmp > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return str.substring(array[right]);
    }
}

public class Main {
  private static void solve() {

    String s = next();
    int k = ni();
    
    SuffixArray sa = new SuffixArray(s);

    Set<String> set = new HashSet<>();
    outer: for (int i : sa.array) {
      for (int j = i + 1; j <= s.length(); j ++) {
        String t = s.substring(i, j);
        set.add(t);
        if (set.size() >= k) break outer;
      }
    }
    
    String max = null;
    for (String t : set) {
      if (max == null || max.compareTo(t) < 0) {
        max = t;
      }
    }
    System.out.println(max);
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


