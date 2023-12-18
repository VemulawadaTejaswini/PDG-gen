import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final long MOD = 998244353;
    long n = sc.nextInt();
    long m = sc.nextInt();
    long k = sc.nextInt();
    long res = 0;
    long split = 1;
    for (long i = 1; i < n-k; i++) {
      split *= (n-i)*reverseMod(i, MOD)%MOD;
    }
    for (long i = n-k; i <= n; i++) {
      split *= (n-i)*reverseMod(i, MOD)%MOD;
      long color = m*modpow(m-1, i-1, MOD)%MOD;
      res += split*color%MOD;
      res %= MOD;
    }
    System.out.println(res);
    sc.close();
  }

  static long reverseMod(long n, long mod) { // nのmodにおける逆元、すなわち1/nを求めるメソッド
    return modpow(n, mod-2, mod);
  }

  static long modpow(long a, long b, long mod) { // a*b(mod)を求めるメソッド
    long res = 1;
    while (b > 0) {
      if ((b & 1) == 1) {
        res = res * a;
      }
      a = a*a;
      b >>= 1;
    }
    return res;
  }
}