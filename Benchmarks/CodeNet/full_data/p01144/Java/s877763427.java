import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int[] d, p;
  int n, m;

  int dfs(int idx, int money, int ave) {
    if ( idx == n ) {
      return ave;
    }
    int min = 1 << 28;

    for ( int pay = 0; pay <= Math.min( d[ idx ], money ); ++pay ) {
//      debug(idx, pay, ( d[ idx ] - pay ) * p[ idx ] );
      min = Math.min( min, dfs( idx + 1, money - pay, ave + ( d[ idx ] - pay ) * p[ idx ] ) );
    }

    return min;
  }

  void run() {
    for ( ;; ) {
      n = ni();
      m = ni();
      if ( ( n | m ) == 0 ) {
        break;
      }

      d = new int[n];
      p = new int[n];
      for ( int i = 0; i < n; ++i ) {
        d[ i ] = ni();
        p[ i ] = ni();
      }

      System.out.println( dfs( 0, m, 0 ) );
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