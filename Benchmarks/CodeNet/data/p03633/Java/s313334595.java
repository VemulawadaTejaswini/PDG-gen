import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long lcmValue = sc.nextLong();
    for (int i = 0; i < N-1; i++) {
      long t = sc.nextLong();
      lcmValue = lcm(t, lcmValue);
    }
    
    System.out.println(lcmValue);
  }
  
  private static long lcm(long a, long b) {
    long gcdValue = gcd(a, b);
    return a/gcdValue * b;
  }
  
  private static long gcd(long a, long b) {
    if (a < b) {
      long tmp = b;
      b = a;
      a = tmp;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}