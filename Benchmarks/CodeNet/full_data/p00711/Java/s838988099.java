import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int w = sc.nextInt();
      final int h = sc.nextInt();
      sc.nextLine();

      if(w == 0 && h == 0) break;

      final Tiles map = new Tiles(w, h);
      int px = -1;
      int py = -1;

      for(int y = 0; y < h; y++) {
        String line = sc.nextLine();
        for(int x = 0; x < w; x++) {
          switch(line.charAt(x)) {
          case '.' : map.setBlack(x, y); break;
          case '#' : map.setRed(x, y);   break;
          case '@' : map.setBlack(x, y); px = x; py = y; break;
          }
        }
      }

      System.out.println(map.blackArea(px, py));
    }
  }

  private final Scanner sc = new Scanner(System.in);
}

class Tiles {
  public Tiles(int w, int h) {
    this.w = w;
    this.h = h;
    this.map = new int[w * h];

    for(int i = 0; i < w * h; i++) map[i] = -1;
  }

  public void setBlack(int x, int y) {
    final int pos = x + y * w;

    map[pos] = -1;

    if(x != 0 && map[pos - 1] != RED) union(pos, pos - 1);
    if(y != 0 && map[pos - w] != RED) union(pos, pos - w);
  }

  public void setRed(int x, int y) {
    map[x + y * w] = RED;
  }

  public int blackArea(int x, int y) {
    return - map[root(x + y * w)];
  }

  private void union(int a, int b) {
    a = root(a);
    b = root(b);

    if(a != b) {
      if(map[a] < map[b]) {
        map[a] += map[b];
        map[b] = a;
      }
      else {
        map[b] += map[a];
        map[a] = b;
      }
    }
  }

  private int root(int a) {
    if(map[a] < 0) return a;

    map[a] = root(map[a]);
    return map[a];
  }

  private final int w;
  private final int h;
  private final int[] map;

  private static final int RED = 10000000;
}