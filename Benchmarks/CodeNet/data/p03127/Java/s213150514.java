import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int gcd;
	if (n == 1) {
      gcd = scanner.nextInt();
    } else {
      gcd = scanner.nextInt();
      for (int i = 2; i <= n; i++) {
        gcd = gcd(gcd, scanner.nextInt());
      }
    }

    System.out.println(gcd);
  }
  private static int gcd(final int a, final int b) {
    if (a == 0) {
      if (b == 0) {
        throw new ArithmeticException("greatest common divisor of 0 and 0 is undefined.");
      }
      return b;
    }
    if (b == 0) {
      return a;
    }
    int p = Math.abs(a);
    int q = Math.abs(b);
    int sign = (a < 0 && b < 0) ? -1 : 1;
	if (p < q) {
      p = Math.abs(b);
      q = Math.abs(a);
    }
    int r = p % q;
    while (r > 0) {
      p = q;
      q = r;
      r = p % q;
    }
    return sign * q;
  }
}