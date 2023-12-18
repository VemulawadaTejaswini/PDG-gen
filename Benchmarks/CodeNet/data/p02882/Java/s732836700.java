import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    sc.close();
    double fullV = a * a * b;
    if (x < fullV / 2) {
      double theta = Math.toDegrees(Math.atan(a * a * b / x));
      System.out.println(theta);
    } else {
      double theta = Math.toDegrees(Math.atan(2.0 * (a * a * b - x) / Math.pow(a, 3.0)));
      System.out.println(theta);
    }
  }
}