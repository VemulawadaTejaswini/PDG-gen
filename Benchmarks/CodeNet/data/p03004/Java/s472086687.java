import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Point[] xPoints = new Point[N];
    Point[] yPoints = new Point[N];
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt() * 2;
      int y = scanner.nextInt() * 2;
      char d = scanner.next().charAt(0);
      xPoints[i] = new Point(x, d == 'R' ? Dir.POS : d == 'L' ? Dir.NEG : Dir.ZERO);
      yPoints[i] = new Point(y, d == 'U' ? Dir.POS : d == 'D' ? Dir.NEG : Dir.ZERO);
    }

    List<Integer> intersects = new ArrayList<>();
    intersects.add(0);
    Arrays.sort(xPoints, Comparator.comparingInt(p -> p.pos));
    PolyLine left = polyline(xPoints);
    intersects.addAll(left.intersects());
    Arrays.sort(xPoints, Comparator.comparingInt(p -> -p.pos));
    PolyLine right = polyline(xPoints);
    intersects.addAll(right.intersects());
    Arrays.sort(yPoints, Comparator.comparingInt(p -> p.pos));
    PolyLine bottom = polyline(yPoints);
    intersects.addAll(bottom.intersects());
    Arrays.sort(yPoints, Comparator.comparingInt(p -> -p.pos));
    PolyLine top = polyline(yPoints);
    intersects.addAll(top.intersects());

    long min = -1;
    for (int i : intersects) {
      long area = (right.maxAt(i) - left.minAt(i)) * (top.maxAt(i) - bottom.minAt(i));
      if (min < 0 || area < min) min = area;
    }
    System.out.println(min / 4.d);
  }

  private static PolyLine polyline(Point[] points) {
    PolyLine res = new PolyLine();
    boolean pos = false, zero = false, neg = false;
    for (Point p : points) {
      if (!pos && p.direction == Dir.POS) {
        res.lines.add(new Line(1, p.pos));
        pos = true;
      }
      if (!zero && p.direction == Dir.ZERO) {
        res.lines.add(new Line(0, p.pos));
        zero = true;
      }
      if (!neg && p.direction == Dir.NEG) {
        res.lines.add(new Line(-1, p.pos));
        neg = true;
      }
    }
    return res;
  }

  private enum Dir {
    POS, NEG, ZERO
  }

  private static class Point {
    final int pos;
    final Dir direction;

    private Point(int pos, Dir direction) {
      this.pos = pos;
      this.direction = direction;
    }
  }

  private static class PolyLine {
    List<Line> lines = new ArrayList<>();

    public long maxAt(int x) {
      long max = lines.get(0).valueAt(x);
      for (Line l : lines) {
        max = Math.max(max, l.valueAt(x));
      }
      return max;
    }

    public long minAt(int x) {
      long min = lines.get(0).valueAt(x);
      for (Line l : lines) {
        min = Math.min(min, l.valueAt(x));
      }
      return min;
    }

    public List<Integer> intersects() {
      List<Integer> res = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        for (int j = i + 1; j < lines.size(); j++) {
          int x = lines.get(i).intersectWith(lines.get(j));
          if (x >= 0) res.add(x);
        }
      }
      return res;
    }
  }

  private static class Line {
    private final int slope;
    private final int intercept;

    private Line(int slope, int intercept) {
      this.slope = slope;
      this.intercept = intercept;
    }

    public int valueAt(int x) {
      return intercept + slope * x;
    }

    public int intersectWith(Line line) {
      if (slope == line.slope) return -1;
      return (intercept - line.intercept) / (line.slope - slope);
    }
  }
}
