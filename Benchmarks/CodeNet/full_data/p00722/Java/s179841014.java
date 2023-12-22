import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int INF = 1 << 28;

  void run() {
    for ( ;; ) {
      int a = ni();
      int d = ni();
      int n = ni();

      if ( ( a | d | n ) == 0 ) {
        break;
      }

      int cnt = 0;
      for ( ;; ) {
        boolean f = a != 1;
        for ( int i = 2; i * i <= a; ++i ) {
          f &= a % i != 0;
        }
        if ( f ) {
          if ( ++cnt >= n ) {
            break;
          }
        }
        a += d;
      }

      System.out.println( a );
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