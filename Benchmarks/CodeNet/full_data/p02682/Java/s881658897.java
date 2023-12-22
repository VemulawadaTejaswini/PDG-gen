import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    long a = input.nextLong();
    long b = input.nextLong();
    long c = input.nextLong();
    long k = input.nextLong();
    
    int ans = 0;
    if (k <= a) {
      System.out.println(k);
      return;
    }
    
    ans += a;
    k -= a;
    if (k <= b) {
      System.out.println(ans);
      return;
    }
    k -= b;
    ans -= k;
    
    System.out.println(ans);
  }
}
