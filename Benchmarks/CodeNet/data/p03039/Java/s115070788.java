import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long MOD = 1_000_000_007;
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int K = scanner.nextInt();

    long sum = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        long a = N - i;
        a *= M - j;
        a %= MOD;
        a *= i + j;
        a %= MOD;
        if (i > 0 && j > 0) {
          a *= 2;
          a %= MOD;
        }
        sum += a;
        sum %= MOD;
      }
    }
    sum *= choose((long) N * M - 2, K - 2, MOD);
    sum %= MOD;
    System.out.println(sum);
  }

  private static long choose(long n, long k, long mod) {
    if (k > n - k) return choose(n, n - k, mod);
    long res = 1;
    for (int i = 0; i < k; i++) {
      res = (res * (n - i)) % mod;
    }
    for (int i = 1; i <= k; i++) {
      res = (res * inverse(i, mod)) % mod;
    }
    return res % mod;
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
