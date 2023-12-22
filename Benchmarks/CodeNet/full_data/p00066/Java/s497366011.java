import java.util.*;
import java.io.*;

class Main {

    public static void main( String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextLine() ) {
	    final String input = stdin.nextLine();
	    
	    final boolean winO = win( 'o', input );
	    final boolean winX = win( 'x', input );

	    if ( winO ) {
		System.out.println( 'o' );
	    } else if ( winX ) {
		System.out.println( 'x' );
	    } else {
		System.out.println( 'd' );
	    }
	}	
    }

    static boolean win( char ch, String input ) {

	for ( int i = 0; i < 3; i++ ) {
	    int count = 0;
	    for ( int j = 0; j < 3; j++ ) {
		if ( input.charAt( 3 * i + j ) == ch ) {
		    count++;
		}
	    }
	    if ( count == 3 ) {
		return true;
	    }

	    count = 0;
	    for ( int j = 0; j < 3; j++ ) {
		if ( input.charAt( 3 * j + i ) == ch ) {
		    count++;
		}
	    }
	    if ( count == 3 ) {
		return true;
	    }	    
	}
	
	if ( input.charAt( 3 * 0 + 0 ) == ch &&
	     input.charAt( 3 * 1 + 1 ) == ch &&
	     input.charAt( 3 * 2 + 2 ) == ch ){
	    
	    return true;
	}
	
	if ( input.charAt( 3 * 2 + 0 ) == ch &&
	     input.charAt( 3 * 1 + 1 ) == ch &&
	     input.charAt( 3 * 0 + 2 ) == ch ){
	    
	    return true;		
	}
	return false;
    }
}