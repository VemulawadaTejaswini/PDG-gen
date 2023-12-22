import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int n = Integer.parseInt( stdin.nextLine() );
	    if ( n == 0 ) {
		break;
	    }
	    String input = stdin.nextLine();
	    
	    for ( int i = 0; i < n; i++ ) {
		input = solve( input );
	    }
	    System.out.println( input );
	}	
    }

    static String solve( final String input ) {
	StringBuilder sb = new StringBuilder();

	char current = ( char )255;
	int count = 0;
	for ( final char ch : input.toCharArray() ) {
	    if ( current == 255 ) {
		count++;
		current = ch;
	    } else if ( ch != current ) {
		sb.append( count );
		sb.append( current );
		count = 1;
		current = ch;
	    } else {
		count++;
	    }
	}
	sb.append( count );
	sb.append( current );
	return sb.toString();
    }    
}