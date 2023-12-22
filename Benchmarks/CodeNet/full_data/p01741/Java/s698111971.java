import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;


public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        double d = sc.nextDouble();
        double max = d * Math.sqrt(2);
        for (int i = 1; i <= 10; ++i) {
            if (d < i) {
                break;
            }
            // (0, i) <-> (10, i)
            double left = 0;
            double right = 10;
            for (int j = 0; j < 1000000; ++j) {
                double mid = (left + right) / 2;
                double dist = Math.sqrt(i * i + mid * mid);
                if (d <= dist) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            final double dx = left;
            final double y = i;
            // (0, 0) <-> (1, 0)
            double x = goldenSectionSearch(0, 1, a -> {
                if (Math.abs(Math.floor(a) - Math.floor(dx)) < 1e-6) {
                    double sx1 = Math.floor(a);
                    double sx2 = sx1 + 1;
                    double rx1 = Math.floor(dx);
                    double rx2 = rx1 + 1;
                    double dist = Math.min(a - sx1 + dx - rx1, sx2 - a + rx2 - dx);
                    return y + dist;
                } else {
                    return dx - a;
                }
            }, Comparator.comparingDouble(Double::doubleValue));
            double sx1 = Math.floor(x);
            double sx2 = sx1 + 1;
            double rx1 = Math.floor(dx);
            double rx2 = rx1 + 1;
            double dist = Math.min(x - sx1 + dx - rx1, sx2 - x + rx2 - dx);
            max = Math.max(max, y + dist);
        }
        System.out.println(max);
    }

    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
        double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        double d1 = f.apply(c1);
        double d2 = f.apply(c2);
        for (int i = 0; i < 1000000; ++i) {
            if (comp.compare(d1, d2) > 0) {
                right = c2;
                d2 = d1;
                c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
                d1 = f.apply(c1);
            } else {
                left = c1;
                c1 = c2;
                d1 = d2;
                c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
                d2 = f.apply(c2);
            }
        }
        return left;
    }

    double divideInternally(double a, double b, double m, double n) {
        return (n * a + m * b) / (m + n);
    }

    int ni() {
        return sc.nextInt();
    }

    static public void main(String[] args) {
        new Main().run();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
}