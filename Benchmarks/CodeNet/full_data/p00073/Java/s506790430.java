import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        double x = scanner.nextDouble();
        double h = scanner.nextDouble();
        if (x == 0 && h == 0) {
          return;
        }
        SquarePyramid squarePyramid = new SquarePyramidImpl(x, h);
        System.out.println(squarePyramid.calcSurfaceArea());
      }
    }
  }
}

interface SquarePyramid {
  double calcSurfaceArea();
}

final class SquarePyramidImpl implements SquarePyramid {

  private final double x;
  private final double h;

  SquarePyramidImpl(double x, double h) {
    this.x = x;
    this.h = h;
  }

  private double getTriangleHeight() {
    return Math.sqrt(Math.pow(x / 2, 2) + Math.pow(h, 2));
  }

  @Override
  public double calcSurfaceArea() {
    return Math.pow(x, 2) + getTriangleHeight() * x * 2.0;
  }
}