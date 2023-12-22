import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int date(int y, int m, int d) {
    return ( y - 1 ) * ( 19 + 20 ) * 5 + ( ( y - 1 ) / 3 ) * 5 + ( m - 1 ) * 20
        - ( y % 3 == 0 ? 0 : ( m - 1 ) / 2 ) + d;
  }

  void run() {
    int n = ni();
    int base = date( 1000, 1, 1 );
    for ( int i = 0; i < n; ++i ) {
      int y, m, d;
      y = ni();
      m = ni();
      d = ni();
      int dst = date( y, m, d );

      System.out.println( base - dst );
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