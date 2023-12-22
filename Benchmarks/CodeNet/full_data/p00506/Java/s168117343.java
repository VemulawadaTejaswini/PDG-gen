import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int until = 0;
    if (n == 2) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      until = gcd(a, b);
    } else {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      until = gcd(gcd(a, b), c);
    }
    for (int i = 1; i <= until; i++) {
      if (until % i == 0) {
        System.out.println(i);
      }
    }
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
