import java.util.*;
 
public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] count = new long[1000001];
    for(int i = 0; i < n; i++) {
      long t = sc.nextLong();
      a[i] = t;
      for(long j = 2; (j * j) <= t; j++) {
        long k = 0;
        while((t % j) == 0) {
          k++;
          t /= j;         
        }
        count[(int)j] = Math.max(count[(int)j], k);
      }
      if(t > 1) count[(int)t] = Math.max(count[(int)t], 1);
    }
 
    long ans = 0; 
 
    long lcm = 1;

    for(int i = 1; i < 1000001; i++) {
      long c = (long)Math.pow(i, count[i]);
      lcm = (lcm * c) % MOD;
    }
 
    for(int i = 0; i < n; i++) {
      long b = lcm;
      b = (b * func(a[i], MOD - 2)) % MOD;
      ans = (ans + b) % MOD;
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