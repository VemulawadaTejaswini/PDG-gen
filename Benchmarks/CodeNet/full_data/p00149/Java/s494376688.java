import java.util.*;
import java.io.*;

class Main {

    static final int LEFT = 0;
    static final int RIGHT = 1;
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	int[][] no = new int[4][2];

	while ( stdin.hasNextDouble() ) {
	    final double left = stdin.nextDouble();
	    no[index( left )][LEFT]++;
	    final double right = stdin.nextDouble();
	    no[index( right )][RIGHT]++;	    
	}

	for ( int c = 0; c < no.length; c++ ) {
	    System.out.printf( "%d %d\n", no[c][LEFT], no[c][RIGHT] );
	}	
    }

    static int index( double sight ) {
	if ( sight < 0.2 ) {
	    return 3;
	} else if ( 0.2 <= sight && sight < 0.6 ) {
	    return 2;
	} else if ( 0.6 <= sight && sight < 1.1 ) {
	    return 1;
	} else {
	    return 0;
	}	
    }
    
}