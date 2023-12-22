import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Edge implements Comparable<Edge> {

    final int from;
    final int to;
    final int len;

    Edge( final int from, final int to, final int len ) {
	this.from = from;
	this.to = to;
	this.len = len;
    }

    public int compareTo( Edge e ) {
	return len - e.len;
    }    
}

class Main {

    static int find( final int x, final int[] root ) {
	if ( x == root[ x ] ) {
	    return x;
	} else {
	    final int parents = find( root[ x ], root );
	    root[ x ] = parents;
	    return parents;
	}
    }

    static void union( final int x, final int y, final int[] root ) {
	final int parents = find( x, root );
	root[ parents ] = y;
    }

    static boolean same( final int x, final int y, final int[] root ) {
	final int parentsX = find( x, root );
	final int parentsY = find( y, root );
	return parentsX == parentsY;
    }
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    ArrayList<Edge> list = new ArrayList<Edge>();
	    
	    final int n = Integer.parseInt( stdin.nextLine() );
	    if ( n == 0 ) {
		break;
	    }
	    final int m = Integer.parseInt( stdin.nextLine() );
	    for ( int i = 0; i < m; i++ ) {
		final String[] input = stdin.nextLine().split( "," );
		final int from = Integer.parseInt( input[ 0 ] );
		final int to = Integer.parseInt( input[ 1 ] );
		final int len = Integer.parseInt( input[ 2 ] );
		list.add( new Edge( from, to, len ) );
	    }

	    Collections.sort( list );
	    
	    final int[] root = new int[ n ];
	    for ( int i = 0; i < n; i++ ) {
		root[ i ] = i;
	    }
	    Set<Integer> set = new HashSet<Integer>();

	    int ans = 0;
	    for ( Edge e : list ) {
		if ( !same( e.from, e.to, root ) ){
		    union( e.from, e.to, root );
		    ans += e.len / 100 - 1;
		}
	    }
	    System.out.println( ans );
	}	
    }    
}