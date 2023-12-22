import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  class Point {
    int x, y;
  }

  int[][] ofs = {
      {-1, 0},
      {0, 1},
      {1, 0},
      {0, -1}
  };
  int INF = 1 << 28;

  void run() {
    for (; ; ) {
      int N = ni();
      if (N == 0) {
        break;
      }

      ArrayList<Point> list = new ArrayList<>();
      Point zero = new Point();
      zero.x = 0;
      zero.y = 0;
      list.add(zero);
      for (int i = 0; i < N - 1; ++i) {
        int n = ni();
        int d = ni();
        Point atom = list.get(n);
        Point next = new Point();
        next.x = atom.x + ofs[d][0];
        next.y = atom.y + ofs[d][1];
        list.add(next);
      }

      int minx = INF;
      int maxx = -INF;
      int miny = INF;
      int maxy = -INF;
//      debug();
      for (Point p : list) {
//        debug(p.x, p.y);
        minx = Math.min(minx, p.x);
        maxx = Math.max(maxx, p.x);
        miny = Math.min(miny, p.y);
        maxy = Math.max(maxy, p.y);
      }
      System.out.println((maxx - minx + 1) + " " + (maxy - miny + 1));
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}