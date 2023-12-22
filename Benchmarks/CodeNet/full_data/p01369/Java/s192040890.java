import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	
	final HashSet<Character> left = new HashSet<Character>();
	for ( final char ch : "qwertasdfgzxcvb".toCharArray() ){
	    left.add( ch );
	}

	final int LEFT = 0;
	final int RIGHT = 1;
	
	while ( true ) {

	    final String input = stdin.nextLine();
	    if ( "#".equals( input ) ) {
		break;
	    }

	    int hand = -1;
	    int count = 0;
	    for ( final char ch : input.toCharArray() ) {
		final int curHand = ( left.contains( ch ) ? LEFT : RIGHT );
		if ( hand != curHand ) {
		    if ( hand != -1 ) {
			count++;
		    }
		    hand = curHand;
		}
	    }
	    System.out.println( count );
	}	
    }    
}