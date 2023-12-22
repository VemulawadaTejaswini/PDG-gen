import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Pair {
    int f;
    int s;

    Pair(int f, int s) {
      this.f = f;
      this.s = s;
    }
  }

  void run() {
    for ( ;; ) {
      int n = ni();
      int m = ni();
      if ( ( n | m ) == 0 ) {
        break;
      }

      Pair[] list = new Pair[n];
      for ( int i = 0; i < n; ++i ) {
        int d = ni();
        int p = ni();
        list[ i ] = new Pair( d, p );
      }

      Arrays.sort( list, new Comparator<Pair>() {
        @Override
        public int compare(Pair o1, Pair o2) {
          return o2.s - o1.s;
        }
      } );

      int sum = 0;
      for ( Pair p : list ) {
        int pay = Math.min( m, p.f );
        sum += ( p.f - pay ) * p.s;
        m -= pay;
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

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}