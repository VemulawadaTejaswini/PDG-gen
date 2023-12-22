import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Pair implements Comparable<Pair> {

    final int cost;
    final int to;

    Pair( int cost, int to ) {
	this.cost = cost;
	this.to = to;
    }

    public int compareTo( Pair p ) {
	return cost - p.cost;
    }    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int n = Integer.parseInt( stdin.nextLine() );
	final int m = Integer.parseInt( stdin.nextLine() );
	List< List<Pair> > map = new ArrayList< List<Pair> >();
	for ( int i = 0; i <= n; i++ ) {
	    map.add( new ArrayList<Pair>() );
	}
	for ( int i = 0; i < m; i++ ) {
	    String[] input = stdin.nextLine().trim().split( "," );
	    final int from = Integer.parseInt( input[ 0 ] );
	    final int to = Integer.parseInt( input[ 1 ] );
	    final int cost = Integer.parseInt( input[ 2 ] );
	    final int revCost = Integer.parseInt( input[ 3 ] );
	    map.get( from ).add( new Pair( cost, to ) );
	    map.get( to ).add( new Pair( revCost, from ) );
	}
	String[] input = stdin.nextLine().split( "," );
	int x1 = Integer.parseInt( input[ 0 ] );
	int x2 = Integer.parseInt( input[ 1 ] );
	int y1 = Integer.parseInt( input[ 2 ] );
	int y2 = Integer.parseInt( input[ 3 ] );
	System.out.println( y1 - y2 - dijkstra( x1, x2, map ) - dijkstra( x2, x1, map ) );
    }

    static int dijkstra( int start, int end, List< List< Pair > > map ) {
	int[] minDist = new int[ map.size() ];
	Arrays.fill( minDist, 10000000 );
	minDist[ start ] = 0;
	
	PriorityQueue<Pair> que = new PriorityQueue<Pair>();
	que.add( new Pair( 0, start ) );
	
	while ( !que.isEmpty() ) {
	    Pair p = que.poll();
	    if ( minDist[ p.to ] < p.cost ) {
		continue;
	    }
	    if ( p.to == end ) {
		return p.cost;
	    }
	    for ( Pair edge : map.get( p.to ) ){
		que.add( new Pair( p.cost + edge.cost, edge.to ) );
		minDist[ edge.to ] = min( minDist[ edge.to ], p.cost + edge.cost );
	    }
	}
	return -1;
    }    
}