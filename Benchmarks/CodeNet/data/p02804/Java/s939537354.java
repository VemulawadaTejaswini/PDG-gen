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
    long ans = 0;
    Arrays.sort(A);
    long[] cmb = modCmb(N, K, mod);
    for (int i = 0; i < N - K + 1; i++) {
      ans = modAdd(ans, A[N - 1 - i] * cmb[N - K - i], mod);
      ans = modSub(ans, A[i] * cmb[N - K - i], mod);
    }

    System.out.println(ans);
  }

  private static long modAdd(long a, long b, long mod) {
    return ((a % mod) + (b % mod)) % mod;
  }

  private static long modSub(long a, long b, long mod) {
    long ans = ((a % mod) - (b % mod)) % mod;
    return ans < 0 ? ans + mod : ans;
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

  private static long[] modCmb(int n, int k, long mod) {
    long[] cmb = new long[n - k + 1];
    cmb[0] = 1;
    for (int i = 1; i <= n - k; i++)
      cmb[i] = modDiv(cmb[i - 1] * (k + i - 1), i, mod);
    return cmb;
  }
}