import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  static int gcd(int a, int b) {
    if (a == 0)
      return b;
    else
      return gcd(b % a, a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = 360;
    System.out.println(360 / gcd(x, y));
  }
}
