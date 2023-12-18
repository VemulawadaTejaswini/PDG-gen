import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  long f(long b, long n) {
    if (n < b) {
      return n;
    } else {
      return f(b, n / b) + n % b;
    }
  }

  void run() {
    long n = sc.nextLong();
    long s = sc.nextLong();
    if (n == s) {
      System.out.println(n + 1);
      return;
    }
    long b = 2;
    boolean flag = false;
    for (; b * b <= n; ++b) {
      if (f(b, n) == s) {
        flag = true;
        break;
      }
    }
    if (flag) {
      System.out.println(b);
      return;
    }
    for (long p = 1; p * p < n; ++p) {
      b = (n - s) / p + 1;
      if (b < 2) {
        continue;
      }
      if (f(b, n) == s) {
        flag = true;
        break;
      }
    }
    if (flag) {
      System.out.println(b);
    } else {
      System.out.println(-1);
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}