import java.util.*;

public class Main {
  public static void main(String[] argv){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    if (n % 2 == 1){
      System.out.println(0);
      return;
    }

    long ans = 0;
    long x = 10;
    while (x <= n) {
      ans += (long)Math.floor(n / x);
      x *= 5;
    }

    System.out.println(ans);
    return;
  }
}