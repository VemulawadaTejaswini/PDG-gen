import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Triangle triangle = new Triangle();

            final int SIZE = 3;
            for (int j = 0; j < SIZE; j++) {
                final double x = scanner.nextDouble();
                final double y = scanner.nextDouble();

                triangle.addPoint(new Point2D.Double(x, y));
            }

            final Circle circumcircle = triangle.getCircumcircle();
            final Point2D circumcenter = circumcircle.getCenter();
            final double radius = circumcircle.getRadius();

            System.out.printf("%.3f ", circumcenter.getX());
            System.out.printf("%.3f ", circumcenter.getY());
            System.out.printf("%.3f\n", radius);
        }
    }

}

// ax + by = c
class Equation {

    public double a;
    public double b;
    public double c;

    Equation() {
        this(0, 0, 0);
    }

    Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static List<Double> solve(Equation left, Equation right) {
        double determinant = left.a * right.b - right.a * left.b;
        double x = (right.b * left.c - left.b * right.c) / determinant;
        double y = (-right.a * left.c + left.a * right.c) / determinant;

        return Arrays.asList(x, y);
    }

}

class Triangle {

    private List<Point2D.Double> points;

    public Triangle() {
        this.points = new ArrayList<>();
    }

    public Point2D.Double getPoint(final int index) {
        assert(index < 3 && index < this.points.size());

        return this.points.get(index);
    }

    public void addPoint(final Point2D.Double point) {
        assert (this.points.size() < 3);

        this.points.add(point);
    }

    public Circle getCircumcircle() {
        List<Double> value = new ArrayList<>();
        value.add(getPoint(0).getX());
        value.add(getPoint(0).getY());
        value.add(getPoint(1).getX());
        value.add(getPoint(1).getY());
        value.add(getPoint(2).getX());
        value.add(getPoint(2).getY());

        Equation equation1 = new Equation();
        equation1.a = 2 * (value.get(0) - value.get(2));
        equation1.b = 2 * (value.get(1) - value.get(3));
        equation1.c = Math.pow(value.get(0), 2) + Math.pow(value.get(1), 2) - Math.pow(value.get(2), 2) - Math.pow(value.get(3), 2);
        Equation equation2 = new Equation();
        equation2.a = 2 * (value.get(0) - value.get(4));
        equation2.b = 2 * (value.get(1) - value.get(5));
        equation2.c = Math.pow(value.get(0), 2) + Math.pow(value.get(1), 2) - Math.pow(value.get(4), 2) - Math.pow(value.get(5), 2);

        final List<Double> solution = Equation.solve(equation1, equation2);
        final Point2D circumcenter = new Point2D.Double(solution.get(0), solution.get(1));
        final Point2D point = getPoint(0);
        final double radius = circumcenter.distance(point);

        return new Circle(circumcenter, radius);
    }

}

class Circle {

    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

}