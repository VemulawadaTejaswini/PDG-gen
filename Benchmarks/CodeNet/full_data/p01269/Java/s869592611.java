import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int n = ni();
      int m = ni();
      int l = ni();
      if ( ( n | m | l ) == 0 ) {
        break;
      }

      int[][] dm = new int[n + 1][n + 1];
      int[][] em = new int[n + 1][n + 1];
      boolean[][] lk = new boolean[n + 1][n + 1];

      for ( int i = 0; i < m; ++i ) {
        int a = ni();
        int b = ni();
        int d = ni();
        int e = ni();
        dm[ a ][ b ] = dm[ b ][ a ] = d;
        em[ a ][ b ] = em[ b ][ a ] = e;
        lk[ a ][ b ] = lk[ b ][ a ] = true;
      }

      boolean[][] ok = new boolean[n + 1][l + 1];
      int[][] dp = new int[n + 1][l + 1];
      for ( int[] v : dp )
        Arrays.fill( v, 1 << 28 );
      dp[ 1 ][ l ] = 0;
      ok[ 1 ][ l ] = true;
      for ( int h = 0; h < n; ++h ) {
        for ( int i = 1; i <= n; ++i ) {
          for ( int j = 1; j <= n; ++j ) {
            if ( lk[ i ][ j ] ) {
              for ( int k = 0; k <= l; ++k ) {
                if ( ok[ i ][ k ] ) {
                  if ( k - dm[ i ][ j ] >= 0 ) {
                    dp[ j ][ k - dm[ i ][ j ] ] = Math.min( dp[ j ][ k
                        - dm[ i ][ j ] ], dp[ i ][ k ] );
                    ok[ j ][ k - dm[ i ][ j ] ] = true;
//                    debug( i, j, k - dm[ i ][ j ], dp[ j ][ k - dm[ i ][ j ] ] );
                  }
                  dp[ j ][ k ] = Math.min( dp[ j ][ k ], dp[ i ][ k ]
                      + em[ i ][ j ] );
                  ok[ j ][ k ] = true;
//                  debug( "a", i, j, k, dp[ j ][ k ] );
                }
              }
            }
          }
        }
      }

      int min = 1 << 28;
      for ( int k = 0; k <= l; ++k ) {
        min = Math.min( min, dp[ n ][ k ] );
      }

      System.out.println( min );
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