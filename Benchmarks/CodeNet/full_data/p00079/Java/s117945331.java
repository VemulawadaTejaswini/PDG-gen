import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Point{

    final double x;
    final double y;

    Point( final double x, final double y ) {
	this.x = x;
	this.y = y;
    }    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	ArrayList<Point> list = new ArrayList<Point>();
	
	while ( stdin.hasNextLine() ) {

	    String[] input = stdin.nextLine().split( "," );
	    final double x = Double.parseDouble( input[0] );
	    final double y = Double.parseDouble( input[1] );
	    list.add( new Point( x, y ) );
	}

	double ans = 0.0;
	for ( int i = 1; i < list.size() - 1; i++ ) {
	    final Point p1 = list.get( 0 );
	    final Point p2 = list.get( i );
	    final Point p3 = list.get( i + 1 );

	    final double d12 = dist( p1, p2 );
	    final double d23 = dist( p2, p3 );
	    final double d31 = dist( p3, p1 );
	    ans += area( d12, d23, d31 );
	}
	System.out.println( ans );
    }

    static double area( double d1, double d2, double d3 ) {
	final double s = ( d1 + d2 + d3 ) / 2.0;
	return sqrt( s * ( s - d1 ) * ( s - d2 ) * ( s - d3 ) );
    }

    static double dist( Point p1, Point p2 ) {
	return sqrt( pow( p1.x - p2.x, 2.0 ) + pow( p1.y - p2.y, 2.0 ) );
    }
}