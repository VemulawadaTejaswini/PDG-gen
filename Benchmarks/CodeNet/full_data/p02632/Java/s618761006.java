import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    String s = sc.next();
    long n = s.length();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] rui26 = new long[1000001];
    long[] rui25 = new long[1000001];
    rui26[0] = 1;
    rui25[0] = 1;
    long[] kai = new long[2000001];
    kai[0] = 1;
    for(long i = 1; i < 2000001; i++) {
      kai[(int)i] = (kai[(int)(i - 1)] * i) % MOD;
    }
    for(int i = 1; i < 1000001; i++) {
      rui26[i] = (rui26[(int)(i - 1)] * (long)26) % MOD;
    }
    for(int i = 1; i < 1000001; i++) {
      rui25[i] = (rui25[(int)(i - 1)] * (long)25) % MOD;
    }
    long ans = 0;
    for(long t = 0; t <= k; t++) {
      long c = (rui26[(int)t] * rui25[(int)(k - t - 1)]) % MOD;
      c = (c * kai[(int)(n + k - t - 1)]) % MOD;
      long d = kai[(int)(n - 1)];
      long e = kai[(int)(k - t)];
      c = (c * func(d, MOD - 2)) % MOD;
      c = (c * func(e, MOD - 2)) % MOD;
      ans = (ans + c) % MOD;
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      return (a * func(a, x - 1)) % MOD;
    }
  }
}
