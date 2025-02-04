import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Node {
  public byte x, y;
  public byte c;
  public byte[][] map;
}


class Main {
  static int w, h;
  static int gx, gy;

  static boolean isIn(int x, int y) {
    return 0 <= x && x < w && 0 <= y && y < h;
  }

  static boolean ableToMove(int x, int y, int dx, int dy, byte[][] map) {
    int c = 0;
    while(true) {
      x += dx;
      y += dy;
      if(!isIn(x, y)) return false;
      if(map[y][x] == 3) return true;
      if(map[y][x] == 1) break;
      c++;
    }
    return c > 0;
  }

  static Node move(int x, int y, int dx, int dy, int c, byte[][] map) {
    int nx = x + dx, ny = y + dy;
    while(true) {
      if(map[ y][ x] == 3) break;
      if(map[ny][nx] == 1) break;
      x += dx;
      y += dy;
      nx += dx;
      ny += dy;
    }
    Node next = new Node();
    next.x = (byte) x;
    next.y = (byte) y;
    next.c = (byte) (c + 1);
    next.map = new byte[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        next.map[i][j] = map[i][j];
      }
    }
    if(isIn(x + dx, y + dy) && map[y + dy][x + dx] == 1) {
      next.map[y + dy][x + dx] = 0;
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
      node.map = new byte[h][w];
      for(int y = 0; y < h; y++) {
        for(int x = 0; x < w; x++) {
          node.map[y][x] = sc.nextByte();
          if(node.map[y][x] == 2) { node.x = (byte) x; node.y = (byte) y; }
          if(node.map[y][x] == 3) { gx = x; gy = y; }
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

        if(ableToMove(current.x, current.y, -1,  0, current.map)) { queue.add(move(current.x,current. y, -1,  0, current.c, current.map)); }
        if(ableToMove(current.x, current.y,  0, -1, current.map)) { queue.add(move(current.x,current. y,  0, -1, current.c, current.map)); }
        if(ableToMove(current.x, current.y,  1,  0, current.map)) { queue.add(move(current.x,current. y,  1,  0, current.c, current.map)); }
        if(ableToMove(current.x, current.y,  0,  1, current.map)) { queue.add(move(current.x,current. y,  0,  1, current.c, current.map)); }
      }

      System.out.println(min);
    }
  }
}