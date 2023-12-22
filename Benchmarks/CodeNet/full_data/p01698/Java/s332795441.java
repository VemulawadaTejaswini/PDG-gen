import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  final static int INF = 1 << 28;
  final static long LNF = 1L << 60;
  final static long MOD = 1_000_000_007;
  final static double EPS = 1e-11;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  double goldenSectionSearch2(double left, double right, Function<Double, Boolean> f, Comparator<Double> comp) {
    double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
    double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
    boolean d1 = f.apply(c1);
    boolean d2 = f.apply(c2);
    while (right - left > EPS) {
      if (d1) {
        right = c2;
        c2 = c1;
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
    return right;
  }

  double dist(double[] p1, double[] v1, double[] p2, double[] v2, double t) {
    double sum = 0;
    for (int i = 0; i < 3; ++i) {
      sum += Math.pow(p1[i] - p2[i] + (v1[i] - v2[i]) * t, 2.0);
    }
    return Math.sqrt(sum);
  }

  boolean hantei(double d, double r1, double r2, double rv1, double rv2, double t) {
    return d < r1 - rv1 * t + r2 - rv2 * t - EPS;
  }

  class Node {
    double t;
    int index;

    Node(double a, int b) {
      t = a;
      index = b;
    }
  }

  List<List<Node>> pick;

  double solve(int index, int to) {
    for (Node node : pick.get(index)) {
      if (node.t == Double.MAX_VALUE) {
        return Double.MAX_VALUE;
      }
      if (node.index == to) {
        return node.t;
      }
      double t = solve(node.index, index);
      if (t < node.t) {
        continue;
      }
      return t;
    }
    return Double.MAX_VALUE;
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      double[][] p = new double[n][3];
      double[][] v = new double[n][3];
      double[] r = new double[n];
      double[] rv = new double[n];
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < 3; ++j) {
          p[i][j] = nd();
        }
        for (int j = 0; j < 3; ++j) {
          v[i][j] = nd();
        }
        r[i] = nd();
        rv[i] = nd();
      }
      double[][] kouho = new double[n][n];
      for (int i = 0; i < n; ++i) {
        double right = r[i] / rv[i];
        for (int j = 0; j < n; ++j) {
          kouho[i][j] = Double.MAX_VALUE;
          if (i == j) {
            continue;
          }
          double right2 = r[j] / rv[j];
          final double[] a = p[i];
          final double[] b = v[i];
          final double[] c = p[j];
          final double[] d = v[j];
          final double e = r[i];
          final double f = r[j];
          final double g = rv[i];
          final double h = rv[j];
          double sub = goldenSectionSearch2(0, Math.min(right, right2), t -> {
            return hantei(dist(a, b, c, d, t), e, f, g, h, t);
          }, Comparator.comparingDouble(Double::doubleValue).reversed());
          if (hantei(dist(a, b, c, d, sub), e, f, g, h, sub)) {
            kouho[i][j] = sub;
          }
        }
      }
      pick = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        List<Node> list = new ArrayList<>();
        for (int j = 0; j < n; ++j) {
          list.add(new Node(kouho[i][j], j));
        }
        list.sort(Comparator.comparingDouble(a -> a.t));
        pick.add(list);
      }
      for (int i = 0; i < n; ++i) {
        double ans = Math.min(solve(i, n), r[i] / rv[i]);
        System.out.printf("%.10f\n", ans);
      }
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  double nd() {
    return Double.parseDouble(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
  /**
   * [a,b]???m:n???????????????????????????
   */
  double divideInternally(double a, double b, double m, double n) {
    return (n * a + m * b) / (m + n);
  }
}