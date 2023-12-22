import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int argmin( final int[] array ){
	
	int index = 0;
	int minVal = Integer.MAX_VALUE;
	for ( int i = 0; i < array.length; i++ ) {
	    if ( minVal > array[ i ] ) {
		index = i;
		minVal = array[ i ];
	    }
	}
	return index;
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    int[][] map = new int[ n ][ n ];
	    for ( int i = 0; i < n; i++ ){
		for ( int j = 0; j < n; j++ ){
		    map[ i ][ j ] = stdin.nextInt();
		}		    
	    }

	    int index = -1;
	    int maxVal = -1;
	    for ( int i = 0; i < map.length; i++ ){
		final int minIndex = argmin( map[ i ] );
		if ( maxVal < map[ i ][ minIndex ] ) {
		    index = i;
		    maxVal = map[ i ][ minIndex ];
		}
	    }
	    System.out.println( maxVal );
	}	
    }    
}