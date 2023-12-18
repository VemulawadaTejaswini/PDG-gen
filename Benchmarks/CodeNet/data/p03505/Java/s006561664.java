import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = -1;
    if(a > b) {
      if(a >= k) {
        ans = 1;
      } else {
        long s = 0;
        if((k - a) % (a - b) == 0) {
          s = (k - a) / (a - b);
        } else {
          s = (k - a) / (a - b) + 1;
        }
        ans = 2 * s + 1;
      }
    } else {
      if(a >= k) ans = 1;
    }
    System.out.println(ans);
  }
}