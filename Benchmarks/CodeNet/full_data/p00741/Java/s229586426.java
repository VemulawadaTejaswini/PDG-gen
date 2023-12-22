import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  boolean[][] done;
  int[][] field;

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 },
      { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };

  void dfs(int x, int y) {
    if ( done[ y ][ x ] || field[ y ][ x ] == 0 )
      return;

    done[ y ][ x ] = true;
    for ( int[] d : ofs ) {
      dfs( x + d[ 0 ], y + d[ 1 ] );
    }
  }

  void run() {
    for ( ;; ) {
      int w, h;
      w = ni();
      h = ni();

      if ( ( w | h ) == 0 ) {
        break;
      }

      done = new boolean[h + 2][w + 2];
      field = new int[h + 2][w + 2];

      for ( int i = 1; i <= h; ++i ) {
        for ( int j = 1; j <= w; ++j ) {
          field[ i ][ j ] = ni();
        }
      }

      int sum = 0;
      for ( int i = 1; i <= h; ++i ) {
        for ( int j = 1; j <= w; ++j ) {
          if ( !done[ i ][ j ] && field[ i ][ j ] == 1 ) {
            ++sum;
            dfs( j, i );
          }
        }
      }

      System.out.println( sum );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  String ns() {
    return sc.next();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}