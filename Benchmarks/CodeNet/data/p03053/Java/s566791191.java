import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] masu = new char[h][w];

    Deque<XY> q = new ArrayDeque<>();
    for (int i = 0; i < h; i++) {
      masu[i] = sc.next().toCharArray();
      for (int j = 0; j < w; j++) {
        if ('#' == masu[i][j]) {
          q.add(new XY(i, j, 0));
        }
      }
    }

    int max_depth = 0;

    while (true) {
      if (q.size() < 1) {
        break;
      }
      XY xy = q.poll();
      int x = xy.x;
      int y = xy.y;
      int depth = xy.depth;
      max_depth = Math.max(max_depth, depth);

      if (x+1 < w && masu[y][x+1] == '.') {
        masu[y][x+1] = '#';
        q.add(new XY(y, x+1, depth+1));
      }
      if (x - 1 >= 0 && masu[y][x - 1] == '.') {
        masu[y][x - 1] = '#';
        q.add(new XY(y, x - 1, depth + 1));
      }
      if (y + 1 < h && masu[y + 1][x] == '.') {
        masu[y + 1][x] = '#';
        q.add(new XY(y + 1, x, depth + 1));
      }
      if (y - 1 >= 0 && masu[y - 1][x] == '.') {
        masu[y - 1][x] = '#';
        q.add(new XY(y - 1, x, depth + 1));
      }

    }
    System.out.println(max_depth);
  }
}

class XY {
  int y;
  int x;
  int depth;

  XY(int y, int x, int d) {
    this.x = x;
    this.y = y;
    this.depth = d;
  }
}
