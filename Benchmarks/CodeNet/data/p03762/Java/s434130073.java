import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long M = 1_000_000_007;
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] x = new int[n];
    int[] y = new int[m];
    for (int i = 0; i < n; i++) x[i] = scanner.nextInt();
    for (int i = 0; i < m; i++) y[i] = scanner.nextInt();

    System.out.println(compute(x, M) * compute(y, M) % M);
  }

  private static long compute(int[] a, long mod) {
    long ans = 0;
    int n = a.length;
    for (int i = 1; i < n; i++) {
      long d = a[i] - a[i - 1];
      long c = nc2(n, mod);
      c -= nc2(i, mod);
      if (c < 0) c += mod;
      c -= nc2(n - i, mod);
      if (c < 0) c += mod;
      ans += (c * d) % mod;
      ans %= mod;
    }
    return ans;
  }
  private static long nc2(long n, long mod) {
    if (n < 2) return 0;
    return (n * (n - 1) / 2) % mod;
  }
}
