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

  static class Point {
    int x, y;

    Point(int a, int b) {
      x = a;
      y = b;
    }

    static Point p(int x, int y) {
      return new Point(x, y);
    }
  }

  double kaku(Point p1, Point p2, Point p3) {
    int dx1 = p2.x - p1.x;
    int dy1 = p2.y - p1.y;
    int dx2 = p3.x - p2.x;
    int dy2 = p3.y - p2.y;

    int naiseki = dx1 * dx2 + dy1 * dy2;
    double z1 = Math.sqrt(dx1 * dx1 + dy1 * dy1);
    double z2 = Math.sqrt(dx2 * dx2 + dy2 * dy2);

    return Math.acos(naiseki / (z1 * z2)) * 180 / Math.PI;
  }

  double dist(Point p1, Point p2) {
    double dx = p1.x - p2.x;
    double dy = p1.y - p2.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  class Node {
    int now;
    int prev;
    int cnt;
    double r;
  }

  void run() {
    int n = ni();
    double r = sc.nextDouble();
    double theta = sc.nextDouble();
    Point[] p = new Point[n];
    for (int i = 0; i < n; ++i) {
      int x = ni();
      int y = ni();
      p[i] = new Point(x, y);
    }
    Node atom = new Node();
    atom.cnt = 0;
    atom.r = 0;
    atom.now = 0;
    atom.prev = -1;
    PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingDouble(a -> a.r));
    queue.add(atom);
    double[][][] dp = new double[10000 + 1][n][n + 1];
    for (double[][] t : dp) for (double[] a : t) Arrays.fill(a, Double.MAX_VALUE);
    while (queue.size() > 0) {
      Node node = queue.poll();
      if (dp[node.cnt][node.now][node.prev + 1] <= node.r) {
        continue;
      }
      dp[node.cnt][node.now][node.prev + 1] = node.r;
      for (int i = 0; i < n; ++i) {
        if (node.now == i) {
          continue;
        }
        if (node.prev == -1 || kaku(p[node.prev], p[node.now], p[i]) <= theta + 1e-3) {
          Node next = new Node();
          next.now = i;
          next.cnt = node.cnt + 1;
          next.r = node.r + dist(p[node.now], p[i]);
          if (next.r > r + 1e-3) {
            continue;
          }
          next.prev = node.now;
          queue.add(next);
        }
      }
    }
    int max = 0;
    for (int i = 0; i <= 10000; ++i) {
      for (double[] a : dp[i]) {
        for (double v : a) {
          if (v <= r + 1e-3) {
            max = Math.max(max, i);
          }
        }
      }
    }
    System.out.println(max);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}