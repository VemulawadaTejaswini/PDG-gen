import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int n, m, a;
      n = ni();
      m = ni();
      a = ni();
      if ( n == 0 ) {
        break;
      }

      boolean link[][][] = new boolean[1001][n + 1][n + 1];
      for ( int i = 0; i < m; ++i ) {
        int h, p, q;
        h = ni();
        p = ni();
        q = ni();
        link[ h ][ p ][ q ] = link[ h ][ q ][ p ] = true;
      }

      for ( int i = 1000; 1 <= i; --i ) {
        for ( int j = 1; j <= n; ++j ) {
          if ( !link[ i ][ a ][ j ] )
            continue;
          a = j;
          break;
        }
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