import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[n];
    BigInteger lcm = BigInteger.valueOf(1);
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
      lcm = lcm(lcm, BigInteger.valueOf(a[i]));
    }
    BigInteger minX = lcm.divide(BigInteger.valueOf(2));
    int ans = 0;
    if (minX.compareTo(BigInteger.valueOf(m)) >= 0) {
      pw.println(0);
      return;
    }
    long lMinX = minX.longValue();
    long lX = minX.longValue();
    long lLcm = lcm.longValue();
    for (int i = 1; lX <= m; i++) {
      lX = lLcm * i + lMinX;
      ans++;
    }
    pw.println(ans);
  }

  static BigInteger lcm(BigInteger a, BigInteger b) {
    return a.multiply(b).divide(a.gcd(b));
  }
}
