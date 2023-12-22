import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int MAX = 1000000;

  void run() {
    for ( ;; ) {
      int e = ni();
      if ( e == 0 ) {
        break;
      }

      int min = 1 << 28;
      for(int z = 0; z * z * z <= e; ++z) {
        for(int y = 0; y * y <= e - z * z * z; ++y) {
          int x = e - z*z*z - y*y;
          if ( x + y * y + z * z * z == e ) {
            min = Math.min( min, x + y + z );
          }
        }
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