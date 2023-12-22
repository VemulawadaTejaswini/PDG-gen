import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Map {

    final char[][] map;
    int x;
    int y;

    Map( char[][] map ) {
	this.map = map;

	for ( int i = 0; i < map.length; i++ ) {
	    for ( int j = 0; j < map[0].length; j++ ) {
		if ( map[i][j] == 'S' ) {
		    y = i;
		    x = j;
		}
	    }		
	}
    }    
}

class Point {

    final int x;
    final int y;

    Point( int y, int x ) {
	this.x = x;
	this.y = y;
    }    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final String[] input = stdin.nextLine().split( " " );

	final int H = Integer.parseInt( input[0] );
	final int W = Integer.parseInt( input[1] );
	final int N = Integer.parseInt( input[2] );

	char[][] mapArray = new char[H][];
	for ( int i = 0; i < H; i++ ) {
	    mapArray[i] = stdin.nextLine().toCharArray();
	}

	final Map map = new Map( mapArray );
	int sum = 0;
	for ( int i = 1; i <= N; i++ ) {
	    final char goal = ( char )( '0' + i );
	    sum += bfs( map, goal );
	}
	System.out.println( sum );
    }

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    
    static int bfs ( Map map, char goal ) {

	final boolean[][] visited = new boolean[ map.map.length ][ map.map[0].length ];

	ArrayList<Point> after = new ArrayList<Point>();
	ArrayList<Point> cur = new ArrayList<Point>();
	cur.add( new Point( map.y, map.x ) );
	visited[ map.y ][ map.x ] = true;

	int step = 0;
	while ( !cur.isEmpty() ) {
	    step++;
	    for ( Point p : cur ) {
		for ( int i = 0; i < 4; i++ ) {
		    final int ny = p.y + dy[i];
		    final int nx = p.x + dx[i];

		    if ( 0 <= ny && ny < map.map.length &&
			 0 <= nx && nx < map.map[0].length ) {
			
			if ( map.map[ ny ][ nx ] == goal ) {
			    map.y = ny;
			    map.x = nx;
			    return step;
			} else if ( map.map[ ny ][ nx ] != 'X' &&
				    !visited[ ny ][ nx ] ) {
			    
			    after.add( new Point( ny, nx ) );
			    visited[ ny ][ nx ] = true;
			}
		    }
		}
	    }
	    cur.clear();
	    cur.addAll( after );
	    after.clear();
	}
	return step;
    }
}