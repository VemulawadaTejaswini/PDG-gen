import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {

	    final int[] cross = new int[ 101 ];
	    while ( true ) {
		final String[] input = stdin.nextLine().split( " " );
		final int from = Integer.parseInt( input[ 0 ] );
		final int to = Integer.parseInt( input[ 1 ] );

		if ( from == 0 && to == 0 ) {
		    break;
		}
		cross[ from ]++;
		cross[ to ]++;
	    }

	    //System.err.println( Arrays.toString( cross ) );

	    if ( canWallAround( cross ) ) {
		System.out.println(  "OK" );
	    } else {
		System.out.println(  "NG" );
	    }	    
	}
    }

    static boolean canWallAround( final int[] cross ) {
	for ( int i = 3; i <= 100; i++ ) {
	    if ( cross[ i ] % 2 == 1 ) {
		return false;
	    }
	}
	return ( cross[ 1 ] % 2 == 1 && cross[ 2 ] % 2 == 1 );	
    }    
}