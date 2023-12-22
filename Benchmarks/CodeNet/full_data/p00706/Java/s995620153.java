import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int N = ni();

      if ( N == 0 )
        break;

      int W = ni();
      int H = ni();

      int[][] field = new int[H][W];

      for ( int i = 0; i < N; ++i ) {
        int x = ni() - 1;
        int y = ni() - 1;

        field[ y ][ x ] |= 1;
      }

      int S = ni();
      int T = ni();

      int max = 0;
      for ( int i = 0; i <= H - T; ++i ) {
        for ( int j = 0; j <= W - S; ++j ) {
          int cnt = 0;
          for ( int y = 0; y < T; ++y ) {
            for ( int x = 0; x < S; ++x ) {
              cnt += field[ i + y ][ j + x ];
            }
          }
          max = Math.max( max, cnt );
        }
      }

      System.out.println( max );
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