import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }

  int INF = 1 << 28;
  int x, y;
  int[][] field;

  void run() {
    for ( ;; ) {
      x = ni();
      y = ni();

      if ( ( x | y ) == 0 ) {
        break;
      }

      field = new int[y][x];
      int[] S = new int[2];
      int[] G = new int[2];
      for ( int i = 0; i < y; ++i ) {
        char[] str = sc.next().toCharArray();
        for ( int j = 0; j < x; ++j ) {
          if ( str[ j ] == 'S' ) {
            S = new int[] { j, i };
            field[ i ][ j ] = -1;
          } else if ( str[ j ] == 'G' ) {
            G = new int[] { j, i };
            field[ i ][ j ] = -1;
          } else if ( str[ j ] == '.' ) {
            field[ i ][ j ] = -1;
          } else {
            field[ i ][ j ] = str[ j ] - '0' - 1;
          }
        }
      }

      HashMap<Integer, ArrayList<Point>> map = new HashMap<Integer, ArrayList<Point>>();
      for ( int i = 0; i < 1 << 5; ++i ) {
        map.put( i, new ArrayList<Point>() );
      }

      dp = new Point[1 << 5][y][x];
      for ( int i = 0; i < 1 << 5; ++i ) {
        for ( int j = 0; j < y; ++j ) {
          for ( int k = 0; k < x; ++k ) {
            dp[ i ][ j ][ k ] = new Point( INF, INF );
          }
        }
      }
      for ( int i = 0; i < 5; ++i ) {
        ArrayList<Point> list = map.get( 1 << i );
        list.add( new Point( S[ 0 ], S[ 1 ] ) );
        dp[ 1 << i ][ S[ 1 ] ][ S[ 0 ] ] = new Point( 0, i );
      }

      for ( int i = 1; i < 1 << 5; ++i ) {
        ArrayList<Point> list = map.get( i );
        for ( int j = 0; j < list.size(); ++j ) {
          Point p = list.get( j );
          int id = dp[ i ][ p.y ][ p.x ].y;
          int nid = ( id + 1 ) % 5;

          // debug( i, id, nid, p, dp[ i ][ p.y ][ p.x ].x );

          ArrayList<Point> nidlist = bfs( p.x, p.y, i, nid );
          ArrayList<Point> nlist = map.get( i | ( 1 << nid ) );
          nlist.addAll( nidlist );
          map.put( i | ( 1 << nid ), nlist );
        }
      }

      Point res = dp[ ( 1 << 5 ) - 1 ][ G[ 1 ] ][ G[ 0 ] ];
      if ( res.y == INF ) {
        System.out.println( "NA" );
      } else {
        System.out.println( ( res.y + 1 ) + " " + res.x );
      }
    }
  }

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

  Point[][][] dp;

  ArrayList<Point> bfs(int sx, int sy, int bits, int nid) {
    ArrayList<Point> list = new ArrayList<Point>();

    boolean[][] done = new boolean[y][x];
    Queue<Point> queue = new LinkedList<Point>();
    queue.add( new Point( sx, sy ) );
    done[ sy ][ sx ] |= true;
    while (queue.size() > 0) {
      Point p = queue.poll();
      for ( int[] dv : ofs ) {
        int nx = p.x + dv[ 0 ];
        int ny = p.y + dv[ 1 ];
        if ( 0 <= nx && nx < x && 0 <= ny && ny < y ) {
          if ( !done[ ny ][ nx ] ) {
            queue.add( new Point( nx, ny ) );
            done[ ny ][ nx ] |= true;
            if ( dp[ bits ][ ny ][ nx ].x > dp[ bits ][ p.y ][ p.x ].x + 1 ) {
              dp[ bits ][ ny ][ nx ] = new Point(
                  dp[ bits ][ p.y ][ p.x ].x + 1, nid );
              if ( field[ ny ][ nx ] == nid ) {
                if ( dp[ bits ][ ny ][ nx ].x < dp[ bits | ( 1 << nid ) ][ ny ][ nx ].x ) {
                  dp[ bits | ( 1 << nid ) ][ ny ][ nx ] = new Point(
                      dp[ bits ][ ny ][ nx ].x, nid );
                  list.add( new Point( nx, ny ) );
                } else if ( dp[ bits ][ ny ][ nx ].x == dp[ bits | ( 1 << nid ) ][ ny ][ nx ].x ) {
                  if ( dp[ bits ][ ny ][ nx ].y < dp[ bits | ( 1 << nid ) ][ ny ][ nx ].y ) {
                    dp[ bits | ( 1 << nid ) ][ ny ][ nx ].y = dp[ bits ][ ny ][ nx ].y;
                  }
                }
              }
            } else if ( dp[ bits ][ ny ][ nx ].x == dp[ bits ][ p.y ][ p.x ].x + 1 ) {
              if ( dp[ bits ][ ny ][ nx ].y > nid ) {
                dp[ bits ][ ny ][ nx ].y = nid;
              }
            }
          }
        }
      }
    }

    return list;
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