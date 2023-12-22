import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {
    
    public static void main( final String[] args ) {
	
	final Scanner stdin = new Scanner( System.in );
	final int[] ls = { 4, 1, 4, 1, 2, 1, 2, 1 };
	
	while ( stdin.hasNextInt() ) {
	    final int[] ps = new int[8];
	    for ( int i = 0; i < 8; i++ ) {
		ps[i] = stdin.nextInt();
	    }
	    
	    final int[] ans = new int[8];	    
	    int maxPeople = 0;
	    for ( int i = 0; i < 8; i++ ) {
		final int p = ip( ps, ls );
		if ( p > maxPeople ) {
		    maxPeople = p;
		    System.arraycopy( ls, 0, ans, 0, 8 );
		}
		next( ls );
	    }
	    System.out.print( ans[0] );
	    for ( int i = 1; i < 8; i++ ) {
		System.out.print( " " + ans[i] );
	    }
	    System.out.println();
	}
    }
    
    static void next( int[] a ) {
	final int front = a[0];
	for ( int i = 0; i < 7; i++ ) {
	    a[i] = a[i + 1];
	}
	a[7] = front;
    }

    static int ip( int[] ps, int[] ls ) {
	int sum = 0;
	for ( int i = 0; i < ps.length; i++ ){
	    sum += min( ls[i], ps[i] );
	}
	return sum;
    }    
}