import java.util.*;
import java.lang.Math;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();

    double s = x / a;

    if (s > a * b / 2) {
      double bp = 2 * (b - x / a / a);
      System.out.println(Math.toDegrees(Math.atan2(bp, a)));
    } else {
      double hp = x / b / a * 2;
      System.out.println(90 - Math.atan2(hp, b) / Math.PI * 180);
    }
  }
}