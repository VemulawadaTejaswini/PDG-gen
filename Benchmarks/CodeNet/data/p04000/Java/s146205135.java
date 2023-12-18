import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    HashMap<Point, Integer> freq = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      for (int j = -1; j <= 1; j++) {
        for (int k = -1; k <= 1; k++) {
          int sx = x + j;
          int sy = y + k;
          if (sx > 1 && sx < H && sy > 1 && sy < W) {
            Point p = new Point(sx, sy);
            freq.put(p, freq.getOrDefault(p, 0) + 1);
          }
        }
      }
    }

    long[] total = new long[10];
    total[0] = (long) (H - 2) * (W - 2) - freq.size();
    for (int f : freq.values()) total[f]++;
    for (long t : total) {
      System.out.println(t);
    }
  }

  private static class Point {
    public final int x;
    public final int y;

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
