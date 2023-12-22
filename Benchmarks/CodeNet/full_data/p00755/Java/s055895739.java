import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int h, w, c;

  int[][] field;

  int dfs(int depth) {
    if ( depth == 4 ) {
      fill( depth, c );
      return fill( depth + 1, 7 );
    }

    int max = 0;
    for ( int r = 1; r <= 6; ++r ) {
      fill( depth, r );
//      debug( depth );
//      for ( int[] a : field ) {
//        for ( int v : a ) {
//          System.err.print( ( ( v >> ( depth * 3 ) ) & 7 ) );
//          System.err.print( ":" + ( ( v >> ( ( depth + 1 ) * 3 ) ) & 7 ) + " " );
//        }
//        System.err.println();
//      }
      max = Math.max( max, dfs( depth + 1 ) );
    }
    return max;
  }

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

  int fill(int depth, int color) {
    int cnt = 0;
    Queue<Integer> qx = new LinkedList<Integer>();
    Queue<Integer> qy = new LinkedList<Integer>();
    qx.add( 0 );
    qy.add( 0 );
    boolean[][] done = new boolean[h][w];
    boolean[][] ok = new boolean[h + 2][w + 2];
    for ( int i = 1; i <= h; ++i ) {
      for ( int j = 1; j <= w; ++j ) {
        ok[ i ][ j ] = true;
      }
    }
    int atom = ( field[ 0 ][ 0 ] >> ( depth * 3 ) ) & 7;
    int mask = ~( 7 << ( ( depth + 1 ) * 3 ) );
    for ( int i = 0; i < h; ++i ) {
      for ( int j = 0; j < w; ++j ) {
        field[ i ][ j ] &= mask;
        field[ i ][ j ] |= ( ( field[ i ][ j ] >> ( depth * 3 ) ) & 7 ) << ( ( depth + 1 ) * 3 );
      }
    }
    field[ 0 ][ 0 ] &= mask;
    field[ 0 ][ 0 ] |= color << ( ( depth + 1 ) * 3 );
    done[ 0 ][ 0 ] = true;
    ++cnt;
    while (qx.size() > 0) {
      int x = qx.poll();
      int y = qy.poll();

      for ( int[] d : ofs ) {
        int nx = x + d[ 0 ];
        int ny = y + d[ 1 ];
        if ( ok[ ny + 1 ][ nx + 1 ] && !done[ ny ][ nx ]
            && ( ( field[ ny ][ nx ] >> ( depth * 3 ) ) & 7 ) == atom ) {
          done[ ny ][ nx ] = true;
          field[ ny ][ nx ] &= mask;
          field[ ny ][ nx ] |= color << ( ( depth + 1 ) * 3 );
          qx.add( nx );
          qy.add( ny );
          ++cnt;
        }
      }
    }

    return cnt;
  }

  void run() {
    for ( ;; ) {
      h = ni();
      w = ni();
      c = ni();
      if ( ( h | w | c ) == 0 ) {
        break;
      }

      field = new int[h][w];
      for ( int i = 0; i < h; ++i ) {
        for ( int j = 0; j < w; ++j ) {
          field[ i ][ j ] = ni();
        }
      }

      System.out.println( dfs( 0 ) );
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