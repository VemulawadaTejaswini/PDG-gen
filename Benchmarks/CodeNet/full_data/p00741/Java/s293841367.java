import java.util.*;

class Main {

  static class Point {
    int x, y;
    Point(int a, int b) {
      this.x = a;
      this.y = b;
    }
  }

  static int W, H;
  static int map[][];
  static ArrayDeque<Point> stack;
  static int x8[] = {0, 1, 1, 1, 0, -1, -1, -1};
  static int y8[] = {1, 1, 0, -1, -1, -1, 0, 1};

  static void bfs() {
    while (!stack.isEmpty()) {
      Point p = stack.removeFirst();
      for (int i = 0; i < 8; i++) {
        int nx = p.x + x8[i];
        int ny = p.y + y8[i];
        if (nx < W && ny < H && nx >= 0 && ny >= 0) {
          if (map[ny][nx] == 1) {
            stack.addLast(new Point(nx, ny));
            map[ny][nx]++;
          }
        }
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      W = sc.nextInt();
      H = sc.nextInt();
      if (W == 0 && H == 0) return;
      map = new int[H][W];
      stack = new ArrayDeque<>();
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          map[i][j] = sc.nextInt();
        }
      }
      int count = 0;

      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (map[i][j] == 1) {
            count++;
            stack.addFirst(new Point(j, i));
            map[i][j]++;
            bfs();
          }
        }
      }
      /*
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          System.out.print(map[i][j] + " ");
        }
        System.out.println();
      }
      */

      System.out.println(count);
    }
  }
}

