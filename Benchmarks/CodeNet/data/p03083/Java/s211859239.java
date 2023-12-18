import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int B = scanner.nextInt();
    int W = scanner.nextInt();
    int N = B + W + 1;

    long[] fact = new long[N];
    long[] factinv = new long[N];
    fact[0] = 1;
    for (int i = 1; i < N; i++) fact[i] = fact[i - 1] * i % M;
    factinv[0] = 1;
    for (int i = 1; i < N; i++) factinv[i] = factinv[i - 1] * inverse(i, M) % M;

    long[] w = new long[N];
    for (int i = W; i < N; i++) {
      w[i] = w[i - 1] + choose(i - 1, W - 1, fact, factinv, M) * modpow(2, i * (M - 2), M) % M;
      w[i] %= M;
    }
    long[] b = new long[N];
    for (int i = B; i < N; i++) {
      b[i] = b[i - 1] + choose(i - 1, B - 1, fact, factinv, M) * modpow(2, i * (M - 2), M) % M;
      b[i] %= M;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < N; i++) {
      long p = w[i - 1];
      long r = 1 - b[i - 1];
      if (r < 0) r += M;
      r -= w[i - 1];
      if (r < 0) r += M;
      r *= inverse(2, M);
      r %= M;
      p += r;
      p %= M;
      sb.append(p).append('\n');
    }
    System.out.println(sb.toString());
  }

  private static long choose(int n, int k, long[] fact, long[] factinv, long mod) {
    if (n < k) return 0;
    long res = fact[n];
    res *= factinv[k];
    res %= mod;
    res *= factinv[n - k];
    res %= mod;
    return res;
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
