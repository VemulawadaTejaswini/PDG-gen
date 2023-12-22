import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    final int[] array = new int[ n ];
	    for ( int i = 0; i < n; i++ ) {
		array[ i ] = stdin.nextInt();
	    }
	    Arrays.sort( array );

	    int index = 0;
	    boolean success = false;
	    while ( index < n ) {
		final int startIndex = index;
		while ( index < n && array[ startIndex ] == array[ index ] ) {
		    index++;
		}
		if ( ( index - startIndex ) * 2 > n ) {
		    System.out.println( array[ startIndex ] );
		    success = true;
		    break;
		}
	    }
	    if ( !success ) {
		System.out.println( "NO COLOR" );
	    }
	}	
    }    
}