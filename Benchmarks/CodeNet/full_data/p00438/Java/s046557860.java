import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while( true ) {
	    final int a = stdin.nextInt();
	    final int b = stdin.nextInt();

	    if ( a == 0 && b == 0 ) {
		break;
	    }
	    
	    final int[][] map = new int[ b + 1 ][ a + 1 ];
	    final int n = stdin.nextInt();
	    for ( int i = 0; i < n; i++ ) {
		final int x = stdin.nextInt();
		final int y = stdin.nextInt();
		map[ y ][ x ] = -1;
	    }
	    
	    map[ 1 ][ 1 ] = 1;
	    for ( int i = 1; i <= b; i++ ) {
		for ( int j = 1; j <= a; j++ ) {
		    if ( ( i != 1 || j != 1 ) && map[ i ][ j ] != -1 ) {
			if ( map[ i - 1 ][ j ] != -1 ) {
			    map[ i ][ j ] += map[ i - 1 ][ j ];
			}
			if ( map[ i ][ j - 1 ] != -1 ) {
			    map[ i ][ j ] += map[ i ][ j - 1 ];
			}
		    }
		}
	    }
	    System.out.println( map[ b ][ a ] );
	}
    }    
}