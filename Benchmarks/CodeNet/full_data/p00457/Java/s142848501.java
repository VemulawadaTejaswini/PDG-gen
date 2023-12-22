import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Pair {

    final int color;
    final int count;

    Pair( final int color, final int count ) {
	this.color = color;
	this.count = count;
    }

    public String toString() {
	return String.format( "(%d, %d)", color, count );
    }    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ){
		break;
	    }
	    final ArrayList<Pair> lst = new ArrayList<Pair>();
	
	    int color = stdin.nextInt();
	    int count = 1;
	    for ( int i = 0; i < n - 1; i++ ) {
		final int pcolor = stdin.nextInt();
		if ( color == pcolor ) {
		    count++;
		} else {
		    lst.add( new Pair( color, count ) );
		    color = pcolor;
		    count = 1;
		}
	    }
	    lst.add( new Pair( color, count ) );

	    int minSize = n;
	    for ( int i = 1; i < lst.size() - 1; i++ ) {
		if ( lst.get( i ).count == 1 && lst.get( i - 1 ).color == lst.get( i + 1 ).color ) {
		    final int reduceNum = simulate( lst, i );
		    if ( minSize > n - reduceNum ) {
			minSize = n - reduceNum;
		    }
		}
	    }
	    System.out.println( minSize );
	}
    }

    static int simulate( final ArrayList<Pair> lst, final int index ) {
	
	int number = 0;
	final int initNum = lst.get( index - 1 ).count + lst.get( index ).count + lst.get( index + 1 ).count;

	if ( initNum >= 4 ) {
	    number = initNum;
	} else {
	    return 0;
	}
	int dist = 2;
	while ( 0 <= index - dist && index + dist < lst.size() &&
		lst.get( index - dist ).color == lst.get( index + dist ).color ) {

	    final int pNumber = lst.get( index - dist ).count + lst.get( index + dist ).count;
	    if ( pNumber >= 4 ) {
		number += pNumber;
		dist++;
	    } else {
		return number;
	    }
	}
	return number;		
    }    
}