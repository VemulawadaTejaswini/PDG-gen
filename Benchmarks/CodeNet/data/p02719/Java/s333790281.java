import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();

    long ans = (long)Math.pow(10,18);

    while (n > 0) {
      n = Math.abs(n-k);

      if (n <= ans) {
        ans = n;
      } else {
        break;
      }
    }

    System.out.println(ans);

  }

}
