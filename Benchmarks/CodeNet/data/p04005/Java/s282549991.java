import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();

    if (a * b * c % 2 == 0) {
      System.out.println(0);
    } else {
      System.out.println(Math.min(Math.min(a * b, b * c), c * a));
    }

  }
}