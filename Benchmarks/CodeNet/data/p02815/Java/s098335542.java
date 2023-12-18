import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int M = 1_000_000_007;
    int N = scanner.nextInt();
    int[] c = new int[N];
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();
    Arrays.sort(c);

    long res = 0;
    for (int i = 0; i < N; i++) {
      res += (long) (N - i + 1) * c[i];
      if (res >= M) res -= M;
    }
    res *= modpow(2, 2 * N - 2, M);
    res %= M;
    System.out.println(res);
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
