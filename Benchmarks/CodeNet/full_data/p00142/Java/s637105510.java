import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    final int[] ns = new int[ n - 1 ];
	    for ( int i = 1; i <= n - 1; i++ ) {
		ns[i - 1] = ( i * i ) % n;
	    }
	    Set<Integer> set = new HashSet<Integer>();
	    for ( int i : ns ) {
		if ( !set.contains( i ) ) {
		    set.add( i );
		}		    
	    }		

	    int[] ans = new int[ n / 2 ];

	    for ( final int i : set ) {
		for ( final int j : set ) {
		    if ( i != j ) {
			int diff = ( i - j + n ) % n;
			if ( diff > n / 2 ) {
			    diff = n - diff;
			}
			//System.err.printf( "(i, j, diff) = (%d, %d, %d)\n", i, j, diff );
			ans[ diff - 1 ]++;
		    }
		}		    
	    }
	    for ( int i : ans ) {
		System.out.println( i );
	    }
	}	
    }
}