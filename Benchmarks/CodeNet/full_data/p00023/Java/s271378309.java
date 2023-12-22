import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String dataCount = input.readLine();
    while (input.ready()) {
      String[] dataStrArray = input.readLine().split(" ");
      final Circle circleA = new Circle(Double.parseDouble(dataStrArray[0]), Double.parseDouble(dataStrArray[1]),
          Double.parseDouble(dataStrArray[2]));
      final Circle circleB = new Circle(Double.parseDouble(dataStrArray[3]), Double.parseDouble(dataStrArray[4]),
          Double.parseDouble(dataStrArray[5]));

      System.out.println(solver(circleA, circleB));
    }
  }

  private static int solver(Circle circleA, Circle circleB) {

    final double circleDistance = getDistance(circleA.get_x(), circleA.get_y(), circleB.get_x(), circleB.get_y());

    if (circleDistance > (circleA.get_r() + circleB.get_r())) {
      return 0;
    }

    if (circleDistance > (Math.max(circleA.get_r(), circleB.get_r()) - Math.min(circleA.get_r(), circleB.get_r()))) {
      return 1;
    }

    if (circleA.get_r() > circleB.get_r()) {
      return 2;
    }

    return -2;
  }

  private static double getDistance(Double x1, Double y1, Double x2, Double y2) {
    final double diff_X = x1 - x2;
    final double diff_Y = y1 - y2;
    final double distance = Math.sqrt(diff_X * diff_X + diff_Y * diff_Y);
    return distance;
  }

  static class Circle {
    private double x;
    private double y;
    private double r;

    private Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
    }

    public double get_x() {
      return this.x;
    }

    public double get_y() {
      return this.y;
    }

    public double get_r() {
      return this.r;
    }
  }
}