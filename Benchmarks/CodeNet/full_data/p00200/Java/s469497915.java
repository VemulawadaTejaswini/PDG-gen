import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Edge {

    final int from;
    final int to;
    final int time;
    final int cost;

    Edge( final int from, final int to, final int cost, final int time ) {
	this.from = from;
	this.to = to;
	this.time = time;
	this.cost = cost;
    }
    public String toString() {
	return String.format( "(%d %d %d %d)", from, to, time, cost );
    }    
}

class Main {

    static final int DIST = 1;
    static final int MONEY = 0;
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int m = stdin.nextInt();
	    final int n = stdin.nextInt();
	    if ( n == 0 && m == 0 ) {
		break;
	    }

	    Edge[] list = new Edge[m];
	    for ( int i = 0; i < m; i++ ) {
		list[ i ] = new Edge( stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt() );
	    }

	    final int q = stdin.nextInt();
	    for ( int i = 0; i < q; i++ ) {
		final int from = stdin.nextInt();
		final int to = stdin.nextInt();
		final int type = stdin.nextInt();

		final int cost = bellman_ford( list, from, to, type, m );
		System.out.println( cost );
	    }	    
	}	
    }

    static int bellman_ford( final Edge[] list, final int from, final int to, final int type, final int m ) {
	final int[] cost = new int[ m ];
	Arrays.fill( cost, Integer.MAX_VALUE );
	cost[ from ] = 0;

	if ( type == MONEY ) {
	    boolean update = true;
	    while ( update ) {
		update = false;
		for ( final Edge e : list ) {
		    if ( cost[ e.from ] != Integer.MAX_VALUE && cost[ e.to ] > cost[ e.from ] + e.cost ) {
			cost[ e.to ] = e.cost + cost[ e.from ];
			update = true;
		    }		      
		}
	    }
	} else {
	    boolean update = true;
	    while ( update ) {
		update = false;
		for ( final Edge e : list ) {
		    if ( cost[ e.from ] != Integer.MAX_VALUE && cost[ e.to ] > cost[ e.from ] + e.time ) {
			cost[ e.to ] = e.time + cost[ e.from ];
			update = true;
		    }		      
		}
	    }	    
	}
	return cost[ to ];
    }    
}