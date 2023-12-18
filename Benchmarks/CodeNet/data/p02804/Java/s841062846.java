import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int M = 1_000_000_007;
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);

    long[] chooseForK1 = new long[N + 1];
    chooseForK1[K - 1] = 1;
    for (int i = K; i <= N; i++) {
      chooseForK1[i] = chooseForK1[i - 1];
      chooseForK1[i] *= i;
      chooseForK1[i] %= M;
      chooseForK1[i] *= inverse(i - K + 1, M);
      chooseForK1[i] %= M;
    }

    long smax = 0;
    long smin = 0;
    for (int i = 0; i < N; i++) {
      long max = a[i] * chooseForK1[i];
      max %= M;
      smax += max;
      smax %= M;
      long min = a[i] * chooseForK1[N - i - 1];
      min %= M;
      smin += min;
      smin %= M;
    }
    long res = smax - smin;
    if (res >= M) res -= M;
    if (res < 0) res += M;
    System.out.println(res);
  }

  public static long choose(long n, long k, long mod) {
    if (k > n) return 0;
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
