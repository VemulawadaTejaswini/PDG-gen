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
    int aHalf[] = new int[n];
    int kMin[] = new int[n];
    int max = 0;
    long lcm = 1;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
      lcm = lcm(lcm, a[i]);
      aHalf[i] = a[i] / 2;
      kMin[i] = 1;
      max = Math.max(a[i], max);
    }
    long minX = lcm / 2;
    int ans = 0;
    long x = minX;
    for (int i = 1; x <= m; i++) {
      x = lcm * i + minX;
      ans++;
    }
    pw.println(ans);
  }

  static long lcm(long a, long b) {
    long gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    return a * b / gcd;
  }
}
