
import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] kai = new long[n + 1];
    kai[0] = 1;
    for(int i = 1; i <= n; i++) {
      kai[i] = (kai[i - 1] * (long)i) % MOD;
    }
    long[] inv = new long[n + 1];
    inv[1] = 1;
    for(int i = 2; i <= n; i++) {
      inv[i] = func((long)i, MOD - 2);
    }
    long[] rui = new long[n + 1];
    rui[1] = kai[n];
    for(int i = 2; i <= n; i++) {
      rui[i] = (rui[i - 1] + (kai[n] * inv[i]) % MOD) % MOD;
    }
    long ans = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long c = rui[i + 1];
      c = (c + rui[n - i] + MOD - rui[1]) % MOD;
      c = (a * c) % MOD;
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