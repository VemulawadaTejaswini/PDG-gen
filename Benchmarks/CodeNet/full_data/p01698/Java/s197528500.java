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
  final static double EPS = 1e-9;
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
        System.out.println(ans);
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
   * ??????????????????????????????
   *
   * @return a ??¨ b ????????§??¬?´???°
   */
  long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  /**
   * ????????????????????????????????????
   *
   * @return mx + ny = gcd(m, n)??¨???????????????(x, y)?????????
   */
  Pair<Long, Long> gcd_ex(long m, long n) {
    long[][] mat = _gcd_ex(m, n);
    return new Pair<>(mat[0][0], mat[0][1]);
  }

  long[][] _gcd_ex(long m, long n) {
    if (n == 0) {
      return new long[][]{{1, 0}, {0, 1}};
    }
    long k = m / n;
    long[][] K = new long[][]{{0, 1}, {1, -k}};
    long[][] r = _gcd_ex(n, m % n);
    long[][] dst = new long[2][2];
    for (int y = 0; y < 2; ++y)
      for (int x = 0; x < 2; ++x)
        for (int i = 0; i < 2; ++i)
          dst[y][x] += r[y][i] * K[i][x];
    return dst;
  }

  /**
   * ??°?????????2???????????¨??????????????????????£?
   *
   * @return a^r (mod 1,000,000,007)
   */
  long pow(long a, long r) {
    long sum = 1;
    while (r > 0) {
      if ((r & 1) == 1) {
        sum *= a;
        sum %= MOD;
      }
      a *= a;
      a %= MOD;
      r >>= 1;
    }
    return sum;
  }

  /**
   * ???????????????
   * O(n)
   *
   * @return {}_nC_r
   */
  long C(int n, int r) {
    long sum = 1;
    for (int i = n; 0 < i; --i) {
      sum *= i;
      sum %= MOD;
    }
    long s = 1;
    for (int i = r; 0 < i; --i) {
      s *= i;
      s %= MOD;
    }
    sum *= pow(s, MOD - 2);
    sum %= MOD;

    long t = 1;
    for (int i = n - r; 0 < i; --i) {
      t *= i;
      t %= MOD;
    }
    sum *= pow(t, MOD - 2);
    sum %= MOD;

    return sum;
  }

  /**
   * ??????????????¢?´¢
   *
   * @param left  ??????
   * @param right ??????
   * @param f     ??¢?´¢????????¢??°
   * @param comp  ??????????????¢??°?????¢?´¢????????¨?????????Comparator.comparingDouble(Double::doubleValue)
   *              ??????????????¢??°?????¢?´¢????????¨?????????Comparator.comparingDouble(Double::doubleValue).reversed()
   * @return ?\?????????§?¨?x
   */
  double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
    double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
    double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
    double d1 = f.apply(c1);
    double d2 = f.apply(c2);
    while (right - left > 1e-9) {
      if (comp.compare(d1, d2) > 0) {
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

  /**
   * [a,b]???m:n???????????????????????????
   */
  double divideInternally(double a, double b, double m, double n) {
    return (n * a + m * b) / (m + n);
  }

}