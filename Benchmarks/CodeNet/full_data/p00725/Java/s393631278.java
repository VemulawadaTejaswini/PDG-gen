import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Node {
  private int h, w;
  public byte x, y;
  public byte c;
  private int[] _map;

  public Node(int _h, int _w) {
    h = _h;
    w = _w;
    _map = new int[h * w / 16 + 1];
  }

  public void map(int y, int x, int v) {
    int i = (y * w + x) / 16;
    int p = (y * w + x) % 16;
    _map[i] &= (~(3 << (p*2)));
    _map[i] |= (v << (p*2));
  }

  public int map(int y, int x) {
    int i = (y * w + x) / 16;
    int p = (y * w + x) % 16;
    return (_map[i] >> (p*2)) & 3;
  }
}


class Main {
  static int w, h;
  static int gx, gy;

  static boolean isIn(int x, int y) {
    return 0 <= x && x < w && 0 <= y && y < h;
  }

  static boolean ableToMove(Node node, int dx, int dy) {
    int b = 0;
    int x = node.x;
    int y = node.y;
    while(true) {
      x += dx;
      y += dy;
      if(!isIn(x, y)) return false;
      if(node.map(y, x) == 3) return true;
      if(node.map(y, x) == 1) break;
      b++;
    }
    return b > 0;
  }

  static Node move(Node node, int dx, int dy) {
    int x = node.x, y = node.y;
    int nx = x + dx, ny = y + dy;
    while(true) {
      if(node.map( y,  x) == 3) break;
      if(node.map(ny, nx) == 1) break;
      x += dx;
      y += dy;
      nx += dx;
      ny += dy;
    }
    Node next = new Node(h, w);
    next.x = (byte) x;
    next.y = (byte) y;
    next.c = (byte) (node.c + 1);
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        next.map(i, j, node.map(i, j));
      }
    }
    if(isIn(nx, ny) && node.map(ny, nx) == 1) {
      next.map(ny, nx, 0);
    }
    return next;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      w = sc.nextInt();
      h = sc.nextInt();
      if(w == 0 && h == 0) break;

      Node node = new Node(h, w);
      for(int y = 0; y < h; y++) {
        for(int x = 0; x < w; x++) {
          node.map(y, x, sc.nextInt());
          if(node.map(y, x) == 2) { node.x = (byte) x; node.y = (byte) y; }
          if(node.map(y, x) == 3) { gx = x; gy = y; }
        }
      }

      int min = -1;
      Queue<Node> queue = new ArrayDeque<Node>();
      queue.add(node);
      while(!queue.isEmpty()) {
        Node current = queue.remove();

        // System.out.printf("%d, %d: %d\n", current.x, current.y, current.c);
        // for(int y = 0; y < h; y++) {
        //   for(int x = 0; x < w; x++) {
        //     System.out.print(current.map(y, x));
        //     if(x != w - 1) {
        //       System.out.print(" ");
        //     }
        //   }
        //   System.out.println("");
        // }
        // System.out.println("");

        if(current.c > 10) break;
        if(current.x == gx && current.y == gy) {
          min = current.c;
          break;
        }

        if(ableToMove(current, -1,  0)) { queue.add(move(current, -1,  0)); }
        if(ableToMove(current,  0, -1)) { queue.add(move(current,  0, -1)); }
        if(ableToMove(current,  1,  0)) { queue.add(move(current,  1,  0)); }
        if(ableToMove(current,  0,  1)) { queue.add(move(current,  0,  1)); }
      }

      System.out.println(min);
    }
  }
}