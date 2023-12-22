import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    double c = 1.0 * a/b;

    System.out.println((int) a / b + " " + a % b + " " + String.format("%.8f", c));

  }
}
