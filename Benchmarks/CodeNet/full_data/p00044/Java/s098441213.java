import java.util.*;
import java.io.*;

class Main {

    static int[] makePrimeArray( int lim ) {

	boolean[] isPrime = new boolean[lim + 1];
	Arrays.fill( isPrime, true );
	isPrime[0] = isPrime[1] = false;
	
	int index = 2;
	final int indexLim = ( int )Math.sqrt( lim );
	while ( index <= indexLim ) {
	    for ( int i = index * 2; i < lim; i += index ) {
		isPrime[i] = false;
	    }
	    index++;
	    while ( index <= indexLim && !isPrime[index] ) {
		index++;
	    }
	}
	int primeNo = count( isPrime, true );
	int[] ans = new int[primeNo];
	index = 0;
	for ( int i = 2; i <= lim; i++ ) {
	    if ( isPrime[i] ) {
		ans[index] = i;
		index++;
	    }
	}
	return ans;
    }

    static int count( boolean[] array, boolean val ) {
	int count = 0;
	for ( boolean a : array ) {
	    if ( a == val ) {
		count++;
	    }
	}
	return count;
    }
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	int[] primes = makePrimeArray( 60000 );

	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    final int index = Arrays.binarySearch( primes, n );
	    if ( 0 <= index ) {
		System.out.printf( "%d %d\n", primes[index - 1], primes[index + 1] );
	    } else {
		System.out.printf( "%d %d\n", primes[-index - 2], primes[-index - 1] );
	    }	    
	}
    }    
}