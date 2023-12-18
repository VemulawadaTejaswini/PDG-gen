import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();

    long ans = 0;
    // 
    long lcmCD = (C * D) / gcd(D, C);
    if (B / lcmCD - A / lcmCD <= 1) {
      for (long i = A; i <= B; i++) {
        if (i%C != 0 && i%D != 0) {
          ans++;
        }
      }
    } else {
      for (long i = A; i < (A/lcmCD + 1) * lcmCD; i++) {
        if (i%C != 0 && i%D != 0) {
          ans++;
        }
      }
      for (long i = B/lcmCD * lcmCD; i <= B; i++) {
        if (i%C != 0 && i%D != 0) {
          ans++;
        }
      }
      long unit = 0;
      for (long i = 1; i <= lcmCD; i++) {
        if (i%C != 0 && i%D != 0) {
          unit++;
        }
      }
      long count = B/lcmCD - A/lcmCD - 1;
      ans += unit*count;
    }
    
//    System.out.println(lcmCD);
//    System.out.println(C*D);
    System.out.println(ans);
  }
  
  private static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
}
