import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "3\n" +
            "0 0 3 0 0 2 3 2\n" +
            "0 0 3 0 1 1 1 4\n" +
            "0 0 3 0 1 1 2 2\n";
}

class Solver {
    private static final double EPS = 1e-10;

    void solve(Scanner scanner) {
        int q = scanner.nextInt();
        for (int i = 0; i < q; i ++) {
            Vector u = new Vector(
                    new Point(scanner.nextInt(), scanner.nextInt()),
                    new Point(scanner.nextInt(), scanner.nextInt())
            );
            Vector v = new Vector(
                    new Point(scanner.nextInt(), scanner.nextInt()),
                    new Point(scanner.nextInt(), scanner.nextInt())
            );

            if (Math.abs(u.innerProduct(v)) < EPS) {
                System.out.println(1);
            } else if (Math.abs(u.outerProduct(v)) < EPS) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }

    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Vector extends Point {
    Vector(double x, double y) {
        super(x, y);
    }

    Vector (Point from, Point to) {
        this(to.x - from.x, to.y - from.y);
    }

    double innerProduct(Vector v) {
        return this.x * v.x + this.y * v.y;
    }

    double outerProduct(Vector v) {
        return this.x * v.y - this.y * v.x;
    }

    double abs() {
        return Math.sqrt(x * x + y * y);
    }
}