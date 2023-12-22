import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int n = stdin.nextInt();
	final int size = 2 * n;
	final int[] cards = new int[ size + 1 ];
	final int[] cardsTo = new int[ size + 1 ];
	for ( int i = 1; i <= size; i++ ) {
	    cards[ i ] = i;
	}
	final int m = stdin.nextInt();

	for ( int t = 0; t < m; t++ ) {
	    final int k = stdin.nextInt();
	    if ( k == 0 ) {
		for ( int i = 1; i <= n; i++ ) {
		    cardsTo[ 2 * i - 1 ] = cards[ i ];
		    cardsTo[ 2 * i ] = cards[ i + n ];
		}
	    } else {
		for ( int i = 1; i <= k; i++ ) {
		    cardsTo[ size - k + i ] = cards[ i ];
		}
		for ( int i = k + 1; i <= size; i++ ) {
		    cardsTo[ i - k ] = cards[ i ];
		}
	    }
	    System.arraycopy( cardsTo, 1, cards, 1, size );
	}
	for ( int i = 1; i <= size; i++ ) {
	    System.out.println( cards[ i ] );
	}
    }    
}