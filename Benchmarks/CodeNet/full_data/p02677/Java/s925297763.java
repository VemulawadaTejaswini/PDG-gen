import java.util.*;

class Point {
  double x;
  double y;

  public Point(double deg, double r) {
    double rad = deg * Math.PI / 180.0;
    x = Math.cos(rad) * r;
    y = Math.sin(rad) * r;
    // System.out.printf("[%f, %f]\n", x, y);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distance(Point b) {
    double c = Math.pow(x - b.getX(), 2);
    double d = Math.pow(y - b.getY(), 2);
    return Math.sqrt(c + d);
  }

  public void show() {
    System.out.printf("[%f, %f]\n", x, y);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double h = scanner.nextDouble();
      double m = scanner.nextDouble();

      // 長針
      Point bigHand = new Point(m * 6.0, b);

      // 短針
      Point smallHand = new Point(h * 30.0 + m * 0.5, a);

      double ans = bigHand.distance(smallHand);
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}