import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( stdin.hasNextInt() ) {

	    final int p = stdin.nextInt();
	    final int q = stdin.nextInt();

	    int[] quotients = new int[80];
	    int[] rest = new int[80];
	    int mod = ( p % q ) * 10;
	    int index = -1;
	    int repFirst = -1;
	    boolean finish = false;

	    while ( !finish ) {
		index++;
		rest[index] = mod;
		quotients[index] = mod / q;
		mod %= q;
		mod *= 10;
		for ( int i = 0; i < index; i++ ) {
		    if ( rest[i] == rest[index] ) {
			repFirst = i;
			finish = true;
			break;
		    }
		}
		if ( mod == 0 ) {
		    finish = true;
		}
	    }

	    if ( mod > 0 ) {
		for ( int i = 0; i < index; i++ ) {
		    System.out.print( quotients[i] );
		}
		System.out.println();
		for ( int i = 0; i < repFirst; i++ ) {
		    System.out.print( " " );
		}		
		for ( int i = repFirst; i < index; i++ ) {
		    System.out.print( "^" );
		}
		System.out.println();
	    } else {
		for ( int i = 0; i <= index; i++ ) {
		    System.out.print( quotients[i] );
		}
		System.out.println();
	    }
	}	
    }    
}