import java.util.*;

/**
 * C Main
 *
 * @date 2020.09.19
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {

  long MOD = 1000000007;

  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = ((modpow(10, n, MOD) + modpow(8, n, MOD)) % MOD) - 2 * modpow(9, n, MOD);
    while (ans < 0) {
      ans += MOD;
    }
    System.out.println(ans);
  }

  public long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if ((n & 1) != 0) {
        res = res * a % mod;
      }
      a = a * a % mod;
      n >>= 1;
    }
    return res;
  }
}
