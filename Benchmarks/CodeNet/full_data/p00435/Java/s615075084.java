import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final String input = stdin.nextLine();
	final StringBuilder sb = new StringBuilder();

	for ( final char ch : input.toCharArray() ) {
	    final char nch = ( char )( ( ch - 'A' - 3 + 26 ) % 26 + 'A' );
	    sb.append( nch );
	}
	System.out.println( sb.toString() );	
    }    
}