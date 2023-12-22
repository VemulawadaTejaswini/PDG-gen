import java.util.*;
import java.io.*;
import java.math.BigInteger;
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

	final int n = stdin.nextInt();

	int[] primes = makePrimes( n + 1 );
	
	BigInteger b = lcmAll( primes ).add( new BigInteger( "2" ) );
	System.out.println( b );
	for ( int i = 2; i <= n + 1; i++ ){
	    boolean success = false;
	    for ( int j = 0; j <= primes.length && primes[j] <= i; j++ ) {				    
		if ( i % primes[j] == 0 ) {
		    System.out.println( primes[j] );
		    success = true;
		    break;
		}
	    }
	    if ( !success ) {
		System.out.println( i );
	    }
	}	    
    }

    static BigInteger lcmAll( int[] primes ) {

	BigInteger ans = BigInteger.ONE;
	for ( int i : primes ) {
	    final BigInteger val = new BigInteger( Integer.toString( i ) );
	    ans = ans.multiply( val );
	}	
	return ans;	
    }    
}