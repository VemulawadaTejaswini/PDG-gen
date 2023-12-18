import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 998244353;
    int N = scanner.nextInt();
    int[] D = new int[N];
    for (int i = 0; i < N; i++) D[i] = scanner.nextInt();
    if (D[0] != 0) {
      System.out.println(0);
      return;
    }
    int[] freq = new int[N];
    for (int i = 0; i < N; i++) freq[D[i]]++;
    if (freq[0] != 1) {
      System.out.println(0);
      return;
    }
    long res = 1;
    for (int i = 1; i < N; i++) {
      res *= modpow(freq[i - 1], freq[i], M);
      res %= M;
    }
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
