import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[] A = new int[N];
    BigInteger lcm = BigInteger.ONE;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      lcm = lcm(lcm, BigInteger.valueOf(A[i]));
    }
    lcm = lcm.mod(BigInteger.valueOf(M));
    long res = 0;
    for (int i = 0; i < N; i++) {
      res += lcm.longValue() * inverse(A[i], M) % M;
      res %= M;
    }
    System.out.println(res);
  }

  private static BigInteger gcd(BigInteger i, BigInteger j) {
    if (i.compareTo(j) > 0) return gcd(j, i);
    while (i.compareTo(BigInteger.ZERO) > 0) {
      BigInteger r = j.mod(i);
      j = i;
      i = r;
    }
    return j;
  }

  private static BigInteger lcm(BigInteger i, BigInteger j) {
    return i.divide(gcd(i, j)).multiply(j);
  }

  private static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }

  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}
