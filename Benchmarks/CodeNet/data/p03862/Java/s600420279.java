import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private void solve(Scanner sc, PrintWriter out) {
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    int[] sum = new int[N - 1];
    for (int i = 0; i < N; ++i) {
      a[i] = sc.nextInt();
      if (i > 0) {
        sum[i - 1] = a[i - 1] + a[i];
      }
    }

    int count = 0;
    for (int i = 0; i < sum.length; ++i) {
      if (sum[i] > x) {
        count += sum[i] - x;
        if (i < sum.length - 1) {
          /*
           * a[i] = sum[i] - a[i + 1];
           * a[i + 1] = sum[i] - a[i];
           */
          int t = a[i + 1];
          a[i + 1] = 0;
          a[i] -= sum[i] - t;
          sum[i] = a[i] + a[i + 1];
          sum[i + 1] = a[i + 1] + a[i + 2];
        }
      }
    }

    out.println(count);
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}