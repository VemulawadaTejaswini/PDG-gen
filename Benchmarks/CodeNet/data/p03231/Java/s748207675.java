import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    String s = sc.next();
    String t = sc.next();
    long L = (n * m) / gcd(n, m);
    long nn = L / n;
    long mm = L / m;
    int p = 0;
    long ans = L;
    for(long i = 0; i < n; i++) {
      long a = (i * nn);
      if((a % mm) == 0) {
        long j = a / mm;
        if(s.charAt(i) != t.charAt(j)) {
          p++;
          break;
        }
      }
    }
    if(p > 0) ans = -1;
    System.out.println(ans);
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}