import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long s = sc.nextLong();
    long ans = -1;
    if(s < n + 1) {
      for(long i = 1; i * i < n; i++) {
        if((n - s) % i == 0) {
          long b = i + 1;
          if(func(b, n) == s) {
            if(ans > -1) {
              ans = Math.min(b, ans);
            } else {
              ans = b;
            }
          }
          b = (n - s) / i + 1;
          if(func(b, n) == s) {
            if(ans > -1) {
              ans = Math.min(b, ans);
            } else {
              ans = b;
            }
          }
        }
      }
      if(ans == -1 && s == n) ans = n + 1;
    }
    System.out.println(ans);
  }

  public static long func(long b, long n) {
    if(b > n) return n;
    return func(b, n / b) + (n % b);
  }
}