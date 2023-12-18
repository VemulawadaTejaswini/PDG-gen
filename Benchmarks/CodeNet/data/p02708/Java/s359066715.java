import java.util.Scanner;

/**
 * Main
 */
public class Main {

  int MOD = 1000000007;
  int MAX = 200002;
  long fact[] = new long[MAX];
  long inv[] = new long[MAX];
  long factInv[] = new long[MAX];

  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    // init
    fact[0] = fact[1] = 1;
    factInv[0] = factInv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < MAX; i++) {
      fact[i] = fact[i - 1] * i % MOD;
      inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
      factInv[i] = factInv[i - 1] * inv[i] % MOD;
    }

    long result = 0;
    for (int i = 1; i <= k; i++) {
      long c = combination(n + 1, i);
      result = (result + c) % MOD;
    }
    System.out.println(result % MOD);
  }

  public long combination(int n, int r) {
    if (n - r < r) {
      return combination(n, n - r);
    }
    return (fact[n] * ((factInv[r] * factInv[n - r]) % MOD)) % MOD;
  }
}