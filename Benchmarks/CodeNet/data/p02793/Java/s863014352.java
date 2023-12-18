import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    BigInteger lcm = BigInteger.valueOf(1);
    for (int i = 0; i < N; i++)
      lcm = lcm(lcm, BigInteger.valueOf(A[i]));

    long mod = 1000000007;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      ans = (ans + lcm.divide(BigInteger.valueOf(A[i])).longValue()) % mod;
    }
    System.out.println(ans);
  }

  private static BigInteger lcm(BigInteger a, BigInteger b) {
    return a.divide(gcd(a, b)).multiply(b);
  }

  private static BigInteger gcd(BigInteger a, BigInteger b) {
    BigInteger l = a.compareTo(b) < 0 ? a : b;
    BigInteger s = a.compareTo(b) < 0 ? b : a;
    for (BigInteger c = l.mod(s); !c.equals(BigInteger.ZERO); c = l.mod(s)) {
        l = s;
        s = c;
    };
    return s;
  }
}