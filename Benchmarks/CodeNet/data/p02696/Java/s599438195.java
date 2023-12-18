
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    if ( b == 1) {
      System.out.println(0);
    } else {
      long x = 0;
      if (n > b) {
        x = b-1;
      } else {
        x = n;
      }
        long ans = (int)((double)a * x / b);
        System.out.println(ans);
    }
  }
}
