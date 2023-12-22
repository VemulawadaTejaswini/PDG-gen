import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    static final int X = 0;
    static final int Y = 1;
    
    public static void main( String[] args ) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextDouble() ) {
	    final double[][] ps = new double[4][2];
	    for ( int i = 0; i < 4; i++ ){
		ps[i][X] = stdin.nextDouble();
		ps[i][Y] = stdin.nextDouble();
	    }

	    if ( inside( ps[0], ps[1], ps[2][X], ps[2][Y] ) ||
		 inside( ps[0], ps[1], ps[2][X], ps[3][Y] ) ||
		 inside( ps[0], ps[1], ps[3][X], ps[2][Y] ) ||
		 inside( ps[0], ps[1], ps[3][X], ps[3][Y] ) ){

		System.out.println( "YES" );
	    } else {
		System.out.println( "NO" );
	    }
	}
    }

    static boolean inside( final double[] p1, final double[] p2, final double x, final double y ) {
	return ( min( p1[X], p2[X] ) <= x && x <= max( p1[X], p2[X] ) &&
		 min( p1[Y], p2[Y] ) <= y && y <= max( p1[Y], p2[Y] ) );
    }    
}