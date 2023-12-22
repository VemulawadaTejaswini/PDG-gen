import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    System.out.println( solve( n ) );
	    
	}
	
    }

    static long solve( final int n ) {

	long sum = 0;
	final long end = Math.min( 2000L, n );
	final long start = Math.max( 0, n - 2000L );
	for ( long i = start; i <= end; i++ ) {
	    sum += ( i + 1 ) * ( n - i + 1 );
	}
	return sum;
    }
    
}