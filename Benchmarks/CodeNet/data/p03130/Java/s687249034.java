import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    boolean[][] m = new boolean[4][4];

    for (int i = 0; i < 3; i++) {
      int a = nextInt() - 1;
      int b = nextInt() - 1;

      m[a][b] = m[b][a] = true;
    }

    int[] a = {0, 1, 2, 3};
    Set<int[]> perms = new HashSet<>();
    perms(a, new int[4], new boolean[4], 0, perms);

    boolean found = false;
    for (int[] perm : perms) {
      boolean[] touched = new boolean[4];
      for (int i = 0; i < perm.length - 1; i++) {
        if (m[perm[i]][perm[i + 1]]) {
          touched[perm[i]] = true;
          touched[perm[i + 1]] = true;
        } else {
          break;
        }
      }

      boolean temp = true;
      for (boolean b : touched) {
        temp &= b;
      }

      if (temp) {
        found = true;
        break;
      }
    }

    System.out.println(found ? "YES" : "NO");
  }

  private static void perms(int[] a, int[] x, boolean[] used, int i, Set<int[]> set) {
    if (i == x.length) {
      int[] copy = Arrays.copyOf(x, x.length);
      set.add(copy);
    } else {
      for (int j = 0; j < used.length; j++) {
        if (!used[j]) {
          used[j] = true;
          x[i] = a[j];
          perms(a, x, used, i + 1, set);
          used[j] = false;
        }
      }
    }
  }


    private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}