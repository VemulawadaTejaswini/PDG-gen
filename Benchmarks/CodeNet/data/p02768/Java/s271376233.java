import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = modPow(2, n) - 1;
    ans = minus(ans,cmb(n,a));
    ans = minus(ans,cmb(n,b));

    System.out.println(ans);
  }
  private static final long MOD = 1000000007;
  private static final long MOD5 = 1000000005;

  private static long modPow(long a, long n) {
    if (n == 1) return a % MOD;
    if (n % 2 == 1) return (a * modPow(a, n - 1)) % MOD;
    long t = modPow(a, n / 2);
    return (t * t) % MOD;
  }

	private static long minus(long a, long b) {
      while (a<b) {
        a+=MOD;
      }
      return (a-b) % MOD;
    }
    private static long cmb(long n, long r) {
        if (n-r<r) {
            r = n - r;
        }
        long x = 1;
        long y = 1;
        for (long i=0;i<r;i++) {
            x = x * (n - i) % MOD;
            y = y * (i + 1) % MOD;            
        }
        return x * modPow(y, MOD5);
    }

}

