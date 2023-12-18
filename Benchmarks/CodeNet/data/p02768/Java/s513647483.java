import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = func(2, n);
    ans = (ans + MOD - 1) % MOD;
    long[] kai = new long[1000001];
    kai[0] = 1;
    for(int i = 1; i <= 1000000; i++) {
      kai[i] = (kai[i - 1] * (long)i) % MOD;
    }
    long t1 = 1;
    for(long i = n; i > n - a; i--) {
      t1 = (t1 * i) % MOD;
    }
    long t2 = 1;
    for(long i = n; i > n - b; i--) {
      t2 = (t2 * i) % MOD;
    }
    long aa = func(kai[(int)a], MOD - 2);
    long bb = func(kai[(int)b], MOD - 2);
    t1 = (t1 * aa) % MOD;
    t2 = (t2 * bb) % MOD;
    ans = (ans + MOD - t1) % MOD;
    ans = (ans + MOD - t2) % MOD;
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    long t = func(a, x / 2);
    if((x % 2) == 0) {
      return (t * t) % MOD;
    } else {
      return (a * func(a, x - 1)) % MOD;
    }
  }
}