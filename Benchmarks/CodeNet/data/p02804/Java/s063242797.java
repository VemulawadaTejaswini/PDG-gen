import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextLong();
    sc.close();

    long mod = 1000000007L;
    long[] cmb = new long[N - K + 1];
    cmb[0] = 1;
    for (int i = 1; i <= N - K; i++) {
      cmb[i] = cmb[i - 1] * (K + i - 1);
      cmb[i] %= mod;
      cmb[i] = modDiv(cmb[i], i, mod);
    }

    Arrays.sort(A);
    long sumMin = 0;
    long sumMax = 0;
    for (int i = 0; i < N + 1 - K; i++) {
      sumMin += (A[i] * cmb[N - K - i]) % mod;
      sumMin %= mod;
      sumMax += (A[N - i - 1] * cmb[N - K - i]) % mod;
      sumMax %= mod;
    }

    long ans = sumMax - sumMin;
    if (ans < 0) ans += mod;
    System.out.println(ans);
  }

  private static long modDiv(long a, long b, long mod) {
    return (a % mod) * modInv(b, mod) % mod;
  }

  private static long modInv(long x, long mod) {
    return modPow(x, mod - 2, mod);
  }

  private static long modPow(long b, long e, long mod) {
    long ans = 1;
    long x = b % mod;
    for (long y = e; y != 0; y >>= 1) {
      if ((y & 1) == 1) ans = (ans * x) % mod;
      x = (x * x) % mod;
    }
    return ans;
  }
}