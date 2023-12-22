import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  class Pair{
    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    int[][] ofs = new int[][]{
        {-1, 0},
        {0, 1},
        {1, 0},
        {0, -1}
    };
    Pair(Pair p, int d) {
      this.x = p.x + ofs[d][0];
      this.y = p.y + ofs[d][1];
    }
  }

  void run() {
    for(;;) {
      int N = ni();
      if( N == 0 ) break;


      HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();

      map.put(0, new Pair(0, 0));

      for(int i = 1; i < N; ++i) {
        int n = ni();
        int d = ni();

        map.put(i, new Pair(map.get(n), d));
      }

      int minx = 1 << 28;
      int maxx = 0;
      int miny = 1 << 28;
      int maxy = 0;

      for(Integer ite: map.keySet()) {
        Pair p = map.get(ite);

        minx = Math.min(minx, p.x);
        maxx = Math.max(maxx, p.x);
        miny = Math.min(miny, p.y);
        maxy = Math.max(maxy, p.y);
      }

      int h = maxx - minx + 1;
      int w = maxy - miny + 1;

      System.out.println(h + " " + w);
    }

  }
  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}