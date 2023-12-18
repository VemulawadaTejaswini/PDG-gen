import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double x = sc.nextInt();
    double result;
    if (x > a * a * b / 2)
      result = Math.toDegrees(Math.atan(2 * (b - x / a / a) / a));
    else
      result = Math.toDegrees(Math.atan(b * b * a / x / 2));
    System.out.println(result);
  }
}