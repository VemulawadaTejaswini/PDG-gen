import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Point {

    final int x;
    final int y;

    Point( int y, int x ) {
	this.x = x;
	this.y = y;
    }

    public boolean equals( final Point p ) {
	return x == p.x && y == p.y;
    }

    public String toString() {
	return String.format( "(%d %d)", y, x );
    }    
}

class Main {

    public static void main( final String[] args ) {
	final Scanner stdin = new Scanner( System.in );
	
	while ( true ) {
	    final String[] input = stdin.nextLine().split( " " );
	    final int h = Integer.parseInt( input[ 0 ] );
	    final int w = Integer.parseInt( input[ 1 ] );

	    if ( h == 0 && w == 0 ) {
		break;
	    }

	    final char[][] map = new char[ h ][ w ];
	    for ( int i = 0; i < h; i++ ){
		map[ i ] = stdin.nextLine().toCharArray();
	    }

	    final char[][] cp = new char[ h ][ w ];
	    final int[][] dir = new int[ h ][ w ];

	    final ArrayList<Point> cityList = noOfCity( map );

	    int sum = 0;

	    while( !cityList.isEmpty() ){
		int minCost = Integer.MAX_VALUE;
		ArrayList<Point> minRoute = null;
		Point minPoint = null;
		for ( final Point p : cityList ) {
		    copy( cp, map );
		    final ArrayList<Point> route = bfs( cp, p, dir );
		    if ( minCost > route.size() ) {
			minPoint = p;
			minRoute = route;
			minCost = route.size();
		    }
		}
		sum += minRoute.size();
		map[ minPoint.y ][ minPoint.x ] = 'P';
		for ( final Point p : minRoute ) {
		    if ( map[ p.y ][ p.x ] == '.' ) {
			map[ p.y ][ p.x ] = '@';
		    }
		}
		cityList.remove( minPoint );
	    }
	    System.out.println( sum );
	}
    }

    static final int START = -2;
    static final int NONE = -1;
    static final int UP = 0;
    static final int LEFT = 1;
    static final int DOWN = 2;
    static final int RIGHT = 3;

    static final int[] dx = { 0, -1, 0, 1 };
    static final int[] dy = { -1, 0, 1, 0 };
    
    static ArrayList<Point> bfs( char[][] map, Point p, int[][] dir ) {
	for ( int i = 0; i < dir.length; i++ ) {
	    Arrays.fill( dir[ i ], NONE );
	}
	ArrayList<Point> before = new ArrayList<Point>();
	before.add( p );
	dir[ p.y ][ p.x ] = START;
	ArrayList<Point> after = new ArrayList<Point>();

	while ( !before.isEmpty() ) {
	    for ( final Point bp : before ) {
		for ( int i = 0; i < 4; i++ ) {
		    final int nx = bp.x + dx[ i ];
		    final int ny = bp.y + dy[ i ];
		    if ( map[ ny ][ nx ] == 'P' ) {
			dir[ ny ][ nx ] = ( i + 2 ) % 4;
			return reverseRoute( dir, new Point( ny, nx ) );
		    } else if ( map[ ny ][ nx ] == '.' && dir[ ny ][ nx ] == NONE ) {
			after.add( new Point( ny, nx ) );
			dir[ ny ][ nx ] = ( i + 2 ) % 4;
		    }
		}
	    }
	    before.clear();
	    before.addAll( after );
	    after.clear();
	}
	return new ArrayList<Point>();
    }

    static void printMap( final char[][] map ) {
	for ( char[] ar : map ) {
	    for ( char ch : ar ) {
		System.err.print( ch );
	    }
	    System.err.println();
	}
	System.err.println();
    }

    static void printMap( final int[][] map ) {
	for ( int[] ar : map ) {
	    for ( int i : ar ) {
		System.err.printf( "%02d", i );
	    }
	    System.err.println();
	}
	System.err.println();
    }
    
    static ArrayList<Point> reverseRoute ( final int[][] dir, final Point end ) {
	ArrayList<Point> list = new ArrayList<Point>();
	int x = end.x;
	int y = end.y;
	
	while ( dir[ y ][ x ] != START ) {
	    list.add( new Point( y, x ) );
	    final int ny = y + dy[ dir[ y ][ x ] ];
	    final int nx = x + dx[ dir[ y ][ x ] ];
	    y = ny;
	    x = nx;
	}
	return list;
    }

    static void copy( char[][] cp, char[][] map ) {
	for ( int i = 0; i < cp.length; i++ ) {
	    System.arraycopy( map[ i ], 0, cp[ i ], 0, cp[ i ].length );
	}
    }

    static ArrayList<Point> noOfCity ( char[][] map ) {
	ArrayList<Point> list = new ArrayList<Point>();
	for ( int i = 0; i < map.length; i++ ) {
	    for ( int j = 0; j < map[ i ].length; j++ ) {
		if ( map[ i ][ j ] == '*' ){
		    list.add( new Point( i, j ) );
		}
	    }
	}
	return list;
    }    
}