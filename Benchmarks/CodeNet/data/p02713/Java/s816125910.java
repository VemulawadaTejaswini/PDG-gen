import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    long ans = 0;
    for(long a = 1; a <= k; a++) {
      for(long b = 1; b <= k; b++) {
        for(long c = 1; c <= k; c++) {
          long t = gcd(a, b);
          t = gcd(t, c);
          ans += t;
        }
      }
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, (a % b));
  }
}