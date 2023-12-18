import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Pair {
    long a;
    long f;
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    long k = sc.nextLong();
    Long[] a = new Long[n];
    Long[] f = new Long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for (int i = 0; i < n; i++) {
      f[i] = sc.nextLong();
    }
    Arrays.sort(a, Comparator.naturalOrder());
    Arrays.sort(f, Comparator.reverseOrder());

    if (canFinish(0, n, k , a, f)) {
      os.println(0);
      return;
    }

    int l = 0;
    int r = 1;

    do {
      l = r / 2;
      r = l + 1;
      while (!canFinish(r, n, k, a, f)) {
        r *= 2;
      }
    } while(r - l > 1);

    os.println(r);
  }

  private static boolean canFinish(long time, int n, long k, Long[] a, Long[] f) {

    for (int i = 0; i < n; i++) {
      long c = time / f[i];
      k -= a[i] - c;
    }
    return k >= 0;
  }
}
