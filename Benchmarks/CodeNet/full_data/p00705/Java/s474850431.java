import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int N = ni();
      int Q = ni();

      if ( ( N | Q ) == 0 ) {
        break;
      }

      int[][] list = new int[N][];
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for ( int i = 1; i < 100; ++i ) {
        map.put( i, 0 );
      }
      for ( int i = 0; i < N; ++i ) {
        int M = ni();
        list[ i ] = new int[M];
        for ( int j = 0; j < M; ++j ) {
          int d = ni();
          list[ i ][ j ] = d;
//          debug(d);
//          debug(map.keySet());
          map.put( d, map.get( d ) + 1 );
        }
      }

      int max = 0;
      int idx = 0;
      for ( Integer key : map.keySet() ) {
        int n = map.get( key );
        if( n >= Q ) {
          if( max < n ) {
            idx = key;
            max = n;
          }
        }
      }
      
      System.out.println(idx);
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