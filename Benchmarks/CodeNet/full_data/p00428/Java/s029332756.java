import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Pair implements Comparable<Pair> {

    final int index;
    final int count;

    Pair( int index, int count ) {
	this.index = index;
	this.count = count;
    }

    public int compareTo( final Pair pair ) {
	if ( count != pair.count ) {
	    return pair.count - count;
	} else {
	    return index - pair.index;
	}
    }    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = stdin.nextInt();
	    final int m = stdin.nextInt();

	    if ( n == 0 && m == 0 ) {
		break;
	    }

	    int[] count = new int[ m ];
	    for ( int i = 0; i < n; i++ ) {
		for ( int j = 0; j < m; j++ ) {
		    if ( stdin.nextInt() == 1 ) {
			count[ j ]++;
		    }
		}
	    }

	    ArrayList<Pair> pairList = new ArrayList<Pair>();
	    for ( int i = 0; i < m; i++ ) {
		pairList.add( new Pair( i, count[ i ] ) );
	    }
	    Collections.sort( pairList );
	    for ( int i = 0; i < m; i++ ){
		if ( i > 0 ) {
		    System.out.print( " " );
		}
		System.out.print( pairList.get( i ).index + 1 );
	    }
	    System.out.println();
	}	
    }    
}