import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int H = ni();

      if ( H == 0 ) {
        break;
      }

      int[][] field = new int[H][5];
      for ( int i = 0; i < H; ++i ) {
        for ( int j = 0; j < 5; ++j ) {
          field[ i ][ j ] = ni();
        }
      }

      int ans = 0;
      for ( ;; ) {
        int sum = 0;
        for ( int i = 0; i < H; ++i ) {
          int num = 0;
          for ( int j = 0; j < 3; ++j ) {
            int v = field[ i ][ j ];
            boolean del = true;
            for ( int k = 1; k < 3; ++k ) {
              del &= field[ i ][ j + k ] == v;
            }
            if ( del ) {
              num = v;
              break;
            }
          }
          for ( int j = 0; j < 5; ++j ) {
            if ( field[ i ][ j ] == num ) {
              sum += num;
              field[ i ][ j ] = 0;
              for ( int k = i; 0 < k; --k ) {
                field[ k ][ j ] = field[ k - 1 ][ j ];
              }
              field[ 0 ][ j ] = 0;
            }
          }
        }

        /*
         * for ( int[] v : field ) debug( v ); debug();
         */

        if ( sum == 0 ) {
          break;
        }

        ans += sum;
      }

      System.out.println( ans );
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