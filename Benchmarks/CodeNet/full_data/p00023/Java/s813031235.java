import java.util.*;
import java.io.*;

class Main {

    public static int X = 0;
    public static int Y = 1;
    public static int R = 2;
    public static int A = 0;
    public static int B = 1;    
    
    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	final int T = stdin.nextInt();
	for ( int t = 0; t < T; t++ ) {
	    final double[][] circles = new double[2][3];
	    
	    for ( int i = 0; i < 2; i++ ) {
		for ( int j = 0; j < 3; j++ ) {
		    circles[i][j] = stdin.nextDouble();
		}
	    }

	    final double dx = circles[A][X] - circles[B][X];
	    final double dy = circles[A][Y] - circles[B][Y];
	    final double dist = Math.sqrt( dx * dx + dy * dy );

	    if ( circles[A][R] + circles[B][R] < dist ) {
		System.out.println( 0 );
	    } else if ( circles[A][R] > dist + circles[B][R] ) {
		System.out.println( 2 );
	    } else if ( circles[B][R] > dist + circles[A][R] ) {
		System.out.println( -2 );
	    } else {
		System.out.println( 1 );
	    }
	}
	    
    }
    
}