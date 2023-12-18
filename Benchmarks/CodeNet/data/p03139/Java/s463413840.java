import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.print(Math.abs(a - b) + " ");

    if ((a + b) >= n) {
      System.out.println(Math.min(a, b));
    } else {
      System.out.println(0);
    }

  }
}