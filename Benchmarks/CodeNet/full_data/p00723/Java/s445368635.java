import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  String retro(String str) {
    char[] arr = str.toCharArray();
    int len = str.length();
    for ( int i = 0; i < len / 2; ++i ) {
      char tmp = arr[ i ];
      arr[ i ] = arr[ len - 1 - i ];
      arr[ len - 1 - i ] = tmp;
    }
    return new String( arr );
  }

  void solve(String str) {
    HashSet<String> set_ = new HashSet<String>();

    for ( int i = 1; i < str.length(); ++i ) {
      String l = str.substring( 0, i );
      String r = str.substring( i, str.length() );

      HashSet<String> set = new HashSet<String>();

      set.add( l + r );
      set.add( retro( l ) + r );
      set.add( l + retro( r ) );
      set.add( retro( l ) + retro( r ) );

      set.add( r + l );
      set.add( retro( r ) + l );
      set.add( r + retro( l ) );
      set.add( retro( r ) + retro( l ) );

      set_.addAll( set );

      // debug( set );
    }

    // debug( set_ );

    System.out.println( set_.size() );
  }

  void run() {
    int m = ni();
    for ( int i = 0; i < m; ++i ) {
      solve( sc.next() );
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