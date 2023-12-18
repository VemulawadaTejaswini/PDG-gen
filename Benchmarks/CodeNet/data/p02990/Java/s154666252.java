import java.util.*;
public class Main {
  static int mod = 1_000_000_007;
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int redCnt = n - k;
      long[] res = new long[k+1];
      long sum = 0L;
      for(int i = 1; i <= k; i++) {
        res[i] = comb(k-1, i-1) * (comb(i + redCnt, i) - sum) % mod;
        sum += res[i] % mod;
        System.out.println(res[i]);
      }
  }

  private static long comb(int a, int b) {
    if(a == 0 || b == 0) return 1;
    long factA = 1L;
    for(int i = (a - b + 1); i <= a; i++)
      factA = factA * i % mod;

    long factB = 1L;
    for(int i = 1; i <= b; i++)
      factB = factB * i % mod;

    long res = factA * modPow(factB, mod - 2) % mod;
    return res; 
  }

  private static long modPow(long a, int b) {
    if(b == 0) return 1L;
    if(b == 1) return a % mod;
    long res = modPow(a, b / 2) % mod;
    if(b % 2 == 1)
      return ((res * res % mod) * a) % mod;
    return (res * res % mod);
  }
}