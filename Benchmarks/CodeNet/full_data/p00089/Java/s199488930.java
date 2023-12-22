import java.util.*;
import java.io.*;

class A {
    final int val;
    int maxSum;

    A( int val ) {
	this.val = val;
    }

    public String toString() {
	return String.format( "(%d, %d)", val, maxSum );
    }
}

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	ArrayList<ArrayList<A>> list = new ArrayList<ArrayList<A>>();

	while ( stdin.hasNextLine() ) {
	    String[] input = stdin.nextLine().split( "," );
	    ArrayList<A> ar = new ArrayList<A>();
	    for ( final String in : input ) {
		ar.add( new A( Integer.parseInt( in ) ) );
	    }
	    list.add( ar );
	}
	list.get( 0 ).get( 0 ).maxSum = list.get( 0 ).get( 0 ).val;
	
	final int size = list.size() / 2;
	for ( int i = 0; i < size; i++ ) {
	    for ( int j = 0; j <= i; j++ ) {
		A cur = list.get( i ).get( j );
		A straight = list.get( i + 1 ).get( j );
		straight.maxSum = Math.max( straight.maxSum, cur.maxSum + straight.val );
		A next = list.get( i + 1 ).get( j + 1 );
		next.maxSum = Math.max( next.maxSum, cur.maxSum + next.val );
	    }
	}

	for ( int i = size + 1; i <= size * 2; i++ ) {
	    for ( int j = 0; j < 2 * size + 1 - i; j++ ) {
		A cur = list.get( i ).get( j );
		A straight = list.get( i - 1 ).get( j );
		A next = list.get( i - 1 ).get( j + 1 );
		cur.maxSum = Math.max( straight.maxSum, next.maxSum ) + cur.val;
	    }
	}
	System.out.println( list.get( size * 2 ).get( 0 ).maxSum );
    }
    
}