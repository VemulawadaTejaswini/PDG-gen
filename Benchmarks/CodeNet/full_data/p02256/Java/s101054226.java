import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();
    long y = sc.nextLong();

    System.out.println(gcd(x, y));
  }

  public static long gcd(long x, long y) {
    while (x != y) {
        if (x > y) {
            x -= y;
        } else {
            y -= x;
        }
    }
    return x;
  }
}
