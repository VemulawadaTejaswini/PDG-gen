import java.util.Scanner;

public class Main {
  private static final long mod = 1000_000_000 + 7;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    // #use-or-not - #empty - #a - #b
    // 2^n -1 - #a - #b
    long ans = pow(2, n);
    ans--;
    ans -= select(n, a);
    if (ans < 0) {
      ans += mod;
    }
    ans -= select(n, b);
    if (ans < 0) {
      ans += mod;
    }
    System.out.println(ans % mod);
  }
  // C(n,k)
  private static long select(int n, int k) {
    long nume = 1;
    for (int i = n; i >= n - k + 1; i--) {
      nume *= i;
      nume %= mod;
    }
    long factK = 1;
    for (int i = 1; i <= k; i++) {
      factK *= i;
      factK %= mod;
    }
    // fermat small theorem.
    return (nume* pow(factK, mod - 2)) % mod;
  }

  private static long pow(long base, long b) {
    long ans = 1;
    do {
      if (b % 2 == 1) {
        ans *= base;
        ans %= mod;
        b--;
        if (b == 0) break;
      }
      b /= 2;
      base *= base;
      base %= mod;
    } while (b > 0);
    return ans;
  }
}
