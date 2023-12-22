import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String  out = "";
    while (scanner.hasNext()) {
      int a1 = scanner.nextInt();
      int m1 = scanner.nextInt();
      int a2 = scanner.nextInt();
      int m2 = scanner.nextInt();
      int a3 = scanner.nextInt();
      int m3 = scanner.nextInt();
      if (a1 == 0 && m1 == 0 && a2 == 0 && m2 == 0 && a3 == 0 && m3 == 0) {
        break;
      }
      long xc = aaaa(a1, m1);
      long yc = aaaa(a2, m2);
      long zc = aaaa(a3, m3);
      long xl = lcm(xc, yc);
      long yl = lcm(yc, zc);
      long zl = lcm(xc, zc);
      for (;;) {
        if (xl == yl && yl == zl && xl == zl) {
          out += xl + "\n";
          break;
        }
        long xw = lcm(xl, yl);
        long yw = lcm(yl, zl);
        long zw = lcm(xl, zl);
        xl = xw;
        yl = yw;
        zl = zw;
      }
    }
    System.out.print(out);
  }

  private static long aaaa (int a, int m) {
    int x = 1;
    for (int c = 0; ; c++) {
      if (c != 0 && x == 1) {
        return c;
      }
      x = a * x % m;
    }
  }

  private static long lcm (long aa, long bb) {
    BigInteger a = new BigInteger(String.format("%d", aa));
    BigInteger b = new BigInteger(String.format("%d", bb));
    long gcd = a.gcd(b).intValue();
    return aa * bb / gcd;
  }

}