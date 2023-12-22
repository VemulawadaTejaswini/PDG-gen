import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner( System.in );
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    HashSet<Character> set = new HashSet<Character>();
    for ( char c = 'h'; c <= 'p'; ++c ) {
      set.add( c );
    }
    set.add( 'y' );
    set.add( 'u' );

    for (; ; ) {
      char[] str = sc.next().toCharArray();
      if ( str[ 0 ] == '#' ) break;

      int cnt = 0;
      int buf = set.contains( str[ 0 ] ) ? 1 : 0;
      for ( char c : str ) {
        int nxt = set.contains( c ) ? 1 : 0;
        cnt += buf ^ nxt;
        buf = nxt;
      }

      System.out.println( cnt );
    }
  }

  int ni() {
    return sc.nextInt();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}