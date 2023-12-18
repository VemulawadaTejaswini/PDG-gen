import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    if (a + b > x) {
      System.out.println(0);
      System.exit(0);
    }
    if (a * 1000000000 + b * 10 <= x) {
      System.out.println(1000000000);
      System.exit(0);
    }

    for (int d = 9; d >= 1; --d) {
      long n = (long) ((double) (x - (b * d)) / a);

      if (n >= Math.pow(10, d - 1)) {
        if (n <= Math.pow(10, d) - 1)
          System.out.println(n);
        else
          System.out.println((long) Math.pow(10, d) - 1);
        System.exit(0);
      }
    }

    System.out.println(9);
  }
}