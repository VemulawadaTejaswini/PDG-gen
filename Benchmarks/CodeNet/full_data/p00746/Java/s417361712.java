import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Point {
    int x;
    int y;

    Point(int a, int b) {
      x = a;
      y = b;

    }

    int[][] ofs = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

    Point(Point p, int d) {
      x = p.x + ofs[ d ][ 0 ];
      y = p.y + ofs[ d ][ 1 ];
    }
  }

  int INF = 1 << 28;

  void run() {
    for ( ;; ) {
      int N = ni();
      if ( N == 0 ) {
        break;
      }

      HashMap<Integer, Point> map = new HashMap<Integer, Point>();

      map.put( 0, new Point( 0, 0 ) );

      for ( int i = 1; i < N; ++i ) {
        int n = ni();
        int d = ni();

        Point p = map.get( n );
        map.put( i, new Point( p, d ) );
      }

      int minx = 1 << 28;
      int maxx = -( 1 << 28 );
      int miny = INF;
      int maxy = -INF;
      for ( Integer k : map.keySet() ) {
        Point p = map.get( k );
        minx = Math.min( p.x, minx );
        maxx = Math.max( p.x, maxx );
        miny = Math.min( p.y, miny );
        maxy = Math.max( p.y, maxy );
      }

      int w = maxx - minx + 1;
      int h = maxy - miny + 1;
      System.out.println( w + " " + h );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}