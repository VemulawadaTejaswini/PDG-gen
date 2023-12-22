import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static int[] makePrimes( final int lim ) {
	
	BitSet isPrime = new BitSet( lim + 1 );
	isPrime.set( 0, lim + 1, true );
	isPrime.set( 0, 2, false );
	final int limIndex = ( int )sqrt( lim );
	for ( int index = 2; index <= limIndex; index++ ) {
	    if ( isPrime.get( index ) ) {
	   	for ( int i = index * index; i <= lim; i += index ) {
		    isPrime.set( i, false );
		}
	    }
	}
	final int count = isPrime.cardinality();
	int[] ans = new int[count];
	int index = 0;
	for ( int i = 0; i <= lim; i++ ) {
	    if ( isPrime.get( i ) ) {
		ans[index++] = i;
	    }
	}
	return ans;
    }
    
    public static void main( final String[] args ) {

	final int[] primes = makePrimes( 10000000 );
	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    int index = Arrays.binarySearch( primes, n );
	    if ( index < 0 ) {
		index = min( primes.length, - index - 2 );
	    }
	    while ( index >= 3 ) {
		while ( index >= 3 && primes[ index ] - primes[ index - 1 ] > 2 ) {
		    index--;
		}
		if ( primes[ index - 1 ] - primes[ index - 2 ] == 4 &&
		     primes[ index - 2 ] - primes[ index - 3 ] == 2 ) {
		    
		    System.out.println( primes[ index ] );
		    break;
		}
		index--;
	    }	    
	}	
    }    
}