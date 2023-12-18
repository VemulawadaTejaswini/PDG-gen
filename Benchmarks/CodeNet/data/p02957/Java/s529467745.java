import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if ((Math.abs(b - a) % 2) == 0) {
      System.out.println((Math.abs(b - a) / 2) + Math.min(a, b));
    } else {
      System.out.println("IMPOSSIBLE");
    }

  }
}