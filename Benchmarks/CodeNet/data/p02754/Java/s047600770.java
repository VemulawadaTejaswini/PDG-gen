import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();

    long c = 0;
    long ans = 0;

    if (a == 0) {
      System.out.println(0);
      return;
    }

    while (true) {

      for (int i = 0; i < a; i++) {
        if (c == n) {
          System.out.println(ans);
          return;
        }
        c++;
        ans++;
      }

      for (int i = 0; i < b; i++) {
        c++;
      }
    }

  }
}
