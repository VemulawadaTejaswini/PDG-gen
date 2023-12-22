import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int[] array = new int[ 1000000 ];

	while ( true ) {

	    final int n = Integer.parseInt( stdin.nextLine() );
	    if ( n == 0 ) {
		break;
	    }
	    Arrays.fill( array, Integer.MAX_VALUE );

	    final String[] input = stdin.nextLine().split( " " );
	    for ( int i = 0; i < n; i++ ) {
		array[ i ] = Integer.parseInt( input[ i ] );
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