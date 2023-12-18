import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long s = sc.nextLong();
    long ans = -1;
    if(s < n + 1) {
      ArrayList<Long> divisor = new ArrayList<Long>();
      for(long i = 1; i * i < n; i++) {
        if((n - s) % i == 0) {
          divisor.add(i);
          divisor.add((n - s) / i);
        }
      }
      Collections.sort(divisor);
      for(int i = 0; i < divisor.size(); i++) {
        long b = divisor.get(i) + 1;
        if(func(b, n) == s) {
          ans = b;
          break;
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
