import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007L;
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    Wall[] w = new Wall[N + 2];
    w[0] = new Wall(1, 1);
    for (int i = 1; i <= N; i++) {
      w[i] = new Wall(scanner.nextInt(), scanner.nextInt());
    }
    N++;
    w[N] = new Wall(H, W);

    try {
      Arrays.sort(w, (w1, w2) -> {
        if (w1.r <= w2.r && w1.c <= w2.c) return -1;
        if (w1.r >= w2.r && w1.c >= w2.c) return 1;
        return 0;
      });
    } catch (IllegalArgumentException e) {
      // do nothing;
    }

    //long[] fact = new long[H + W + 1];
    //long[] factinv = new long[H + W + 1];
    //fact[0] = 1;
    //for (int i = 0; i < H + W; i++) fact[i + 1] = fact[i] * (i + 1) % M;
    //factinv[0] = 1;
    //for (int i = 1; i <= H + W; i++) factinv[i] = factinv[i - 1] * inverse(i, M) % M;

    //long[][] dp = new long[N + 1][2];
    //dp[0][0] = 1;
    //for (int i = 1; i <= N; i++) {
    //  for (int j1 = 0; j1 < 2; j1++) {
    //    int j2 = 1 - j1;
    //    for (int k = 0; k < i; k++) {
    //      int dr = w[i].r - w[k].r;
    //      int dc = w[i].c - w[k].c;
    //      dp[i][j1] += dp[k][j2] * comb(fact, factinv, dr + dc, dr, M) % M;
    //      if (dp[i][j1] >= M) dp[i][j1] -= M;
    //    }
    //  }
    //}

    //long res = dp[N][1] - dp[N][0];
    //if (res < 0) res += M;
    //System.out.println(res);

    System.out.println(0);
  }

  private static long comb(long[] fact, long[] factinv, int n, int k, long M) {
    if (k < 0) return 0;
    if (n < k) return 0;
    long res = fact[n] * factinv[n - k] % M;
    res *= factinv[k];
    res %= M;
    return res;
  }

  public static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }

  public static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }

  private static class Wall {
    public final int r;
    public final int c;

    private Wall(int r, int c) {
      this.r = r;
      this.c = c;
    }
  }
}
