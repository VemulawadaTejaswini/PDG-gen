import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  // a^n
  static long pow(long a, long n) {
    long s = 1;
    while (n > 0) {
      if ((n & 1) == 1) {
        s *= a;
        s %= MOD;
      }
      n >>= 1L;
      a *= a;
      a %= MOD;
    }
    return s;
  }

  static final long[] x;
  static final long[] y;
  static final long MOD = 1_000_000_007L;

  static {
    long[] a = new long[200001];
    a[0] = 1;
    for (int i = 1; i <= 200000; ++i) {
      a[i] = a[i - 1] * i % MOD;
    }
    x = a;

    long[] b = new long[200001];
    for (int i = 0; i <= 200000; ++i) {
      b[i] = pow(a[i], MOD - 2L);
    }
    y = b;
  }

  long convi(int n, int r) {
    long ret = 1L;
    ret *= x[n];
    ret *= y[r];
    ret %= MOD;
    ret *= y[n - r];
    ret %= MOD;
    return ret;
  }

  void run() {
    int h = ni();
    int w = ni();
    int a = ni();
    int b = ni();

    long sum = 0;
    for (int i = b; i < w; ++i) {
      // nCr = n! * (r!)^-1 * ((n-r)!)^-1
      // iC(h-a-1) * (w-i)C
      sum += (convi(i + h - a - 1, i) * convi(w - 1 - i + a - 1, a - 1)) % MOD;
      sum %= MOD;
    }
    System.out.println(sum);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}