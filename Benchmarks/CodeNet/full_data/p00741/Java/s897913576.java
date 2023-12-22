import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  boolean[][] field;
  boolean[][] done;

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 },
      { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

  void dfs(int x, int y) {
    if ( done[ y ][ x ] )
      return;

    done[ y ][ x ] = true;
    for ( int[] d : ofs ) {
      int dx = d[ 0 ];
      int dy = d[ 1 ];
      // debug(field[y][x], y, x, dx, dy);
      if ( field[ y + dy ][ x + dx ] ) {
        dfs( x + dx, y + dy );
      }
    }
  }

  void run() {
    for ( ;; ) {
      int w = ni();
      int h = ni();

      if ( ( w | h ) == 0 ) {
        break;
      }

      field = new boolean[h + 2][w + 2];
      for ( int i = 1; i <= h; ++i ) {
        for ( int j = 1; j <= w; ++j ) {
          field[ i ][ j ] = ni() == 1;
        }
      }

      done = new boolean[h + 2][w + 2];

      int cnt = 0;
      for ( int i = 1; i <= h; ++i ) {
        for ( int j = 1; j <= w; ++j ) {
          if ( field[ i ][ j ] && !done[ i ][ j ] ) {
            ++cnt;
            // debug(i, j);
            dfs( j, i );
          }
        }
      }

      System.out.println( cnt );
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