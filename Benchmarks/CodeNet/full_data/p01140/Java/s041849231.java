import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int n = ni();
      int m = ni();
      if ( ( n | m ) == 0 ) {
        break;
      }

      int[] h = new int[n];
      int[] w = new int[m];
      for ( int i = 0; i < n; ++i ) {
        h[ i ] = ni();
      }
      for ( int j = 0; j < m; ++j ) {
        w[ j ] = ni();
      }

      int[] W = new int[1500 * 1000];
      for ( int i = 0; i < m; ++i ) {
        int sum = 0;
        for ( int j = i; j < m; ++j ) {
          sum += w[ j ];
          ++W[ sum ];
        }
      }

      int ans = 0;
      for ( int i = 0; i < n; ++i ) {
        int sum = 0;
        for ( int j = i; j < n; ++j ) {
          sum += h[ j ];
          ans += W[ sum ];
        }
      }

      System.out.println( ans );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  byte ni() {
    return (byte) sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }

}