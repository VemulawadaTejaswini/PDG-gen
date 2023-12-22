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

	final Scanner stdin = new Scanner( System.in );
	final int [] primes = makePrimes( 10000 );
	
	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    if ( n <= 2 ) {
		System.out.println( 0 );
	    } else {
		int count = 0;
		int index = 0;
		while ( index < primes.length && primes[ index ] <= n ) {
		    if ( Arrays.binarySearch( primes, n - primes[ index ] + 1 ) >= 0 ) {
			count++;
		    }
		    index++;
		}
		System.out.println( count );
	    }
	}	
    }    
}