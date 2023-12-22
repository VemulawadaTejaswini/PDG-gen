import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    final int[] before = new int[n];
	    final int[] current = new int[n];
	    for ( int i = 0; i < n; i++ ) {
		current[i] = stdin.nextInt();
	    }
	    final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    int count = 0;
	    while ( !isSame( before, current ) ) {
		System.arraycopy( current, 0,  before, 0, current.length );
		map.clear();
		for ( final int val : current ) {
		    if ( map.containsKey( val ) ){
			map.put( val, map.get( val ) + 1 );
		    } else {
			map.put( val, 1 );
		    }
		}
		for ( int i = 0; i < current.length; i++ ) {
		    current[i] = map.get( current[i] );
		}
		count++;
	    }
	    count--;
	    System.out.println( count );
	    if ( current.length > 0 ) {
		System.out.print( current[0] );
		for ( int i = 1; i < current.length; i++ ){
		    System.out.print(" " + current[i] );
		}
		System.out.println();
	    }		
	}
	
    }

    static boolean isSame ( int[] a1, int[] a2 ) {
	for ( int i = 0; i < a1.length; i++ ) {
	    if ( a1[i] != a2[i] ) {
		return false;
	    }
	}
	return true;
    }
    
}