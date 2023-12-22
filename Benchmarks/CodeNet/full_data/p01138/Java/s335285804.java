import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int n = ni();
      if ( n == 0 ) {
        break;
      }

      int[] imos = new int[24 * 60 * 60 + 60 * 60 + 60];
      for ( int i = 0; i < n; ++i ) {
        ++imos[ nt() ];
        --imos[ nt() ];
      }

      int max = 0;
      int ite = 0;
      for ( int v : imos ) {
        ite += v;
        // if ( v != 0 )
        // debug( v, ite, max );
        max = Math.max( max, ite );
      }

      System.out.println( max );
    }
  }

  int nt() {
    String str = sc.next();
    String[] spr = str.split( ":" );
    int h = Integer.parseInt( spr[ 0 ] );
    int m = Integer.parseInt( spr[ 1 ] );
    int s = Integer.parseInt( spr[ 2 ] );
    return h * 60 * 60 + m * 60 + s;
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