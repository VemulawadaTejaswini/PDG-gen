import java.util.*;
import java.io.*;

class Main {

    static int maxCount;

    static void exec( int x, int y, final int dx, final int dy,
		      final int n, final String[] map ) {
	int count = 0;
	while ( 0 <= x && x < n && 0 <= y && y < n ) {
	    if ( map[y].charAt( x ) == '0' ) {
		if ( maxCount < count ) {
		    maxCount = count;
		}
		count = 0;
	    } else {
		count = count + 1;
	    }
	    x += dx;
	    y += dy;
	}
	if ( maxCount < count ) {
	    maxCount = count;
	}
    }
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	
	while ( true ) {
	    final int n = Integer.parseInt( stdin.nextLine() );
	    if ( n == 0 ) {
		break;
	    }
	    String[] map = new String[n];
	    for ( int i = 0; i < n; i++ ) {
		map[i] = stdin.nextLine();
	    }

	    maxCount = 0;

	    for ( int c = 0; c < n; c++ ) {
		// たて
		exec( c, 0, 0, 1, n, map );
		// よこ
		exec( 0, c, 1, 0, n, map ); 
		// ななめ
		exec( 0, c, 1, 1, n, map);
		exec( 0, c, 1, -1, n, map);
		exec( c, 0, 1, 1, n, map);
		exec( c, n - 1, 1, -1, n, map);
	    }
	    System.out.println(maxCount);
	}
	
    }
    
}