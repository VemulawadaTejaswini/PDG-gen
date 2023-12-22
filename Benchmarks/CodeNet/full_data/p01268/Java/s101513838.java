import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int MAX = 1000000;

  void run() {
    for ( ;; ) {
      int n = ni();
      int p = ni();

      if ( ( n & p ) == -1 ) {
        break;
      }

      ArrayList<Integer> pl = new ArrayList<Integer>( p );
      for ( int i = n + 1; pl.size() < p; ++i ) {
        boolean f = i > 1;
        for ( int j = 2; f && j * j <= i; ++j ) {
          f &= i % j != 0;
        }
        if ( f ) {
          pl.add( i );
        }
      }
      ArrayList<Integer> list = new ArrayList<Integer>();
      for ( int i = 0; i < p; ++i ) {
        for ( int j = i; j < p; ++j ) {
          list.add( pl.get( i ) + pl.get( j ) );
        }
      }
      Collections.sort( list );

      System.out.println( list.get( p - 1 ) );
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