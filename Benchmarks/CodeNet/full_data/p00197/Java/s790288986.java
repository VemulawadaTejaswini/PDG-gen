import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int a = stdin.nextInt();
	    final int b = stdin.nextInt();

	    if ( a == 0 && b == 0 ) {
		break;
	    }

	    int count = 0;
	    int mx = max( a, b );
	    int mn = min( a, b );

	    while ( mn > 0 ){
		final int mod = mx % mn;
		mx = mn;
		mn = mod;
		count++;
	    }

	    System.out.printf( "%d %d\n", mx, count );
	}	
    }    
}