import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    long lcm = (c * d) / gcd(a, b);

    System.out.println(count(b, c, d, lcm) - count(a-1, c, d, lcm));
  }

  private static long gcd(long a, long b) {
    if(b == 0) {
      return a;
    } 
    return gcd(b, a%b);
  }

  private static long count(long target, long c, long d, long lcm) {
    return target - target/c - target/d + target/lcm;
  }
}
