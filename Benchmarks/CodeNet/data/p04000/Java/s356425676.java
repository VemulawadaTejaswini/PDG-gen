import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    HashSet<Point> colored = new HashSet<>();
    HashSet<Point> points = new HashSet<>();
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      colored.add(new Point(x, y));
      for (int j = -1; j <= 1; j++) {
        for (int k = -1; k <= 1; k++) {
          int x2 = x + j;
          int y2 = y + k;
          if (x2 > 1 && x2 < H && y2 > 1 && y2 < W) {
            points.add(new Point(x2, y2));
          }
        }
      }
    }

    for (Point p : points) {
      for (int i = -1; i <= 1; i++) {
        for (int j = -1; j <= 1; j++) {
          int x = p.x + i;
          int y = p.y + j;
          if (colored.contains(new Point(x, y))) {
            p.freq++;
          }
        }
      }
    }

    long[] total = new long[10];
    total[0] = (long) (H - 2) * (W - 2) - points.size();
    for (Point p : points) total[p.freq]++;
    for (long t : total) {
      System.out.println(t);
    }
  }

  private static class Point {
    public final int x;
    public final int y;
    int freq;

    private Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Point point = (Point) o;
      return x == point.x &&
          y == point.y;
    }

    @Override public int hashCode() {
      return Objects.hash(x, y);
    }
  }
}
