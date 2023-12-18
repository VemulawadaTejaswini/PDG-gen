import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    long ans = modPow(2, n) - 1;
    ans -= cmb(n,a);
    ans -= cmb(n,b);
    System.out.println(ans);
  }
  private static final long MOD = 1000000007;
  private static long modPow(long a, long n) {
    if (n == 1) return a % MOD;
    if (n % 2 == 1) return (a * modPow(a, n - 1)) % MOD;
    long t = modPow(a, n / 2);
    return (t * t) % MOD;
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
        return x * modPow(y, MOD-2);
    }

}

