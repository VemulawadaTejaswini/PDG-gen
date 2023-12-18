import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long g = gcd(n, k);
    n = n / g;
    k = k / g;
    n = (n % k);
    System.out.println(Math.min(g * n, g * (k - n)));
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}