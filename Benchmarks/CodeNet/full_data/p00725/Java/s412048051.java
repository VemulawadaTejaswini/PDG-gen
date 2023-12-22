import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Node {
  public int x, y;
  public int c;
  public int[] d = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
}


class Main {
  static int w, h;
  static int sx, sy;
  static int gx, gy;
  static int[][] map;

  static boolean isIn(int x, int y) {
    return 0 <= x && x < w && 0 <= y && y < h;
  }

  static boolean ableToMove(int x, int y, int dx, int dy, int[] d) {
    int c = 0;
    int[][] _map = new int[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        _map[i][j] = map[i][j];
      }
    }
    for(int i = 0; i < 10; i++) {
      if(d[i] == -1) continue;
      int _x = d[i] % w;
      int _y = d[i] / w;
      _map[_y][_x] = 0;
    }
    while(true) {
      x += dx;
      y += dy;
      if(!isIn(x, y)) {
        return false;
      }
      if(_map[y][x] == 3) {
        return true;
      }
      if(_map[y][x] == 1) break;
      c++;
    }
    return c > 0;
  }

  static Node move(int x, int y, int dx, int dy, int c, int[] d) {
    int[][] _map = new int[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        _map[i][j] = map[i][j];
      }
    }
    for(int i = 0; i < 10; i++) {
      if(d[i] == -1) continue;
      int _x = d[i] % w;
      int _y = d[i] / w;
      _map[_y][_x] = 0;
    }
    int nx = x + dx, ny = y + dy;
    while(true) {
      if(_map[ y][ x] == 3) break;
      if(_map[ny][nx] == 1) break;
      x += dx;
      y += dy;
      nx += dx;
      ny += dy;
    }
    Node next = new Node();
    next.x = x;
    next.y = y;
    next.c = c + 1;
    if(isIn(x + dx, y + dy) && map[y + dy][x + dx] == 1) {
      next.d[c] = y * w + x;
    }
    return next;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      w = sc.nextInt();
      h = sc.nextInt();
      if(w == 0 && h == 0) break;

      Node node = new Node();
      map = new int[h][w];
      for(int y = 0; y < h; y++) {
        for(int x = 0; x < w; x++) {
          map[y][x] = sc.nextInt();
          if(map[y][x] == 2) { node.x = sx = x; node.y = sy = y; }
          if(map[y][x] == 3) { gx = x; gy = y; }
        }
      }

      int min = -1;
      Queue<Node> queue = new ArrayDeque<Node>();
      queue.add(node);
      while(!queue.isEmpty()) {
        Node current = queue.remove();

        if(current.c > 10) break;
        if(current.x == gx && current.y == gy) {
          min = current.c;
          break;
        }

        if(ableToMove(current.x, current.y, -1,  0, current.d)) queue.add(move(current.x,current. y, -1,  0, current.c, current.d));
        if(ableToMove(current.x, current.y,  0, -1, current.d)) queue.add(move(current.x,current. y,  0, -1, current.c, current.d));
        if(ableToMove(current.x, current.y,  1,  0, current.d)) queue.add(move(current.x,current. y,  1,  0, current.c, current.d));
        if(ableToMove(current.x, current.y,  0,  1, current.d)) queue.add(move(current.x,current. y,  0,  1, current.c, current.d));
      }

      System.out.println(min);
    }
  }
}