import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static long[] kai;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;
    
    kai = new long[200001];
    kai[0] = 1;
    for(long i = 1; i < 200001; i++) {
      kai[(int)i] = (kai[(int)i - 1] * i) % MOD;
    }
    
    for(long i = 1; i < n; i++) {
      long kosuu = ((n - i) * m) % MOD;
      kosuu = (kosuu * m) % MOD;
      kosuu = (kosuu * i) % MOD;
      kosuu = (kosuu * com((n * m - 2), k - 2)) % MOD;
      ans = (ans + kosuu) % MOD;
    }

    for(long i = 1; i < m; i++) {
      long kosuu = ((m - i) * n) % MOD;
      kosuu = (kosuu * n) % MOD;
      kosuu = (kosuu * i) % MOD;
      kosuu = (kosuu * com((n * m - 2), k - 2)) % MOD;
      ans = (ans + kosuu) % MOD;
    }

    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) {
      return 1;
    } else if(x == 1) {
      return a % MOD;
    } else {
      if(x % 2 == 0) {
        long q = func(a, x / 2);
        return (q * q) % MOD;
      } else {
        return (a * func(a, x - 1)) % MOD;
      }
    }
  }

  public static long com(long s, long t) {
    if(s >= t) {
      long t1 = func(kai[(int)t], MOD - 2);
      long t2 = func(kai[(int)(s - t)], MOD - 2);
      long t3 = (kai[(int)s] * t1) % MOD;
      return (t3 * t2) % MOD;
    } else {
      return 0;
    }
  }
}