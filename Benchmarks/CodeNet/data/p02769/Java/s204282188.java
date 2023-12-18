import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int n = scanner.nextInt();
    int k = scanner.nextInt();

    long[] chooseN = chooseForN(n, M);
    long[] chooseN1 = chooseForN(n - 1, M);
    long res = 0;
    for (int i = Math.max(n - k, 1); i <= n; i++) {
      long c = chooseN[i];
      c *= chooseN1[i - 1];
      c %= M;
      res += c;
      if (res >= M) res -= M;
    }
    System.out.println(res);
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

  public static long[] chooseForN(int n, long mod) {
    long[] C = new long[n + 1];
    long[] fact = new long[n + 1];
    long[] factinv = new long[n + 1];

    fact[0] = 1;
    for (int i = 0; i < n; i++) fact[i + 1] = fact[i] * (n - i) % mod;
    factinv[0] = 1;
    for (int i = 1; i <= n; i++) factinv[i] = factinv[i - 1] * inverse(i, mod) % mod;

    for (int i = 0; i <= n; i++) C[i] = fact[i] * factinv[i] % mod;

    return C;
  }
}
