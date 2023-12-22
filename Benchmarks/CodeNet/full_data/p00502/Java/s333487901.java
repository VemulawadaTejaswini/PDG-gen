import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int D = stdin.nextInt();
	final int N = stdin.nextInt();

	final int[] ts = new int[ D ];
	for ( int i = 0; i < D; i++ ) {
	    ts[ i ] = stdin.nextInt();
	}

	int[][] input = new int[ N ][ 3 ];
	for ( int i = 0; i < N; i++ ) {
	    for ( int j = 0; j < 3; j++ ) {
		input[ i ][ j ] = stdin.nextInt();
	    }					  
	}

	final int MIN = 0;
	final int MAX = 1;
	int[][] show = new int[ 2 ][ 61 ];
	Arrays.fill( show[ MIN ], Integer.MAX_VALUE );
	Arrays.fill( show[ MAX ], Integer.MIN_VALUE );
	for ( int i = 0; i < N; i++ ) {
	    for ( int t = input[ i ][ 0 ]; t <= input[ i ][ 1 ]; t++ ) {
		show[ MIN ][ t ] = Math.min( show[ MIN ][ t ], input[ i ][ 2 ] );
		show[ MAX ][ t ] = Math.max( show[ MAX ][ t ], input[ i ][ 2 ] );
	    }
	}

	int[][] dp = new int[ 2 ][ D ];

	for ( int i = 1; i < D; i++ ) {
	    dp[ MIN ][ i ] = Math.max( dp[ MIN ][ i - 1 ] + Math.abs( show[ MIN ][ ts[ i - 1 ] ] - show[ MIN ][ ts[ i ] ] ),
				       dp[ MAX ][ i - 1 ] + Math.abs( show[ MAX ][ ts[ i - 1 ] ] - show[ MIN ][ ts[ i ] ] ) );
	    dp[ MAX ][ i ] = Math.max( dp[ MIN ][ i - 1 ] + Math.abs( show[ MIN ][ ts[ i - 1 ] ] - show[ MAX ][ ts[ i ] ] ),
				       dp[ MAX ][ i - 1 ] + Math.abs( show[ MAX ][ ts[ i - 1 ] ] - show[ MAX ][ ts[ i ] ] ) );
	}
	System.out.println( Math.max( dp[ MAX ][ D - 1 ], dp[ MIN ][ D - 1 ] ) );
    }    
}