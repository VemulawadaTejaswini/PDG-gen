import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Point {

    final int x;
    final int y;

    Point( final int y, final int x ) {
	this.x = x;
	this.y = y;
    }

    public String toString() {
	return String.format( "(%d, %d)", y, x );
    }
}

class PointDepth {

    final int x;
    final int y;
    final int depth;
    boolean in;

    PointDepth( final int y, final int x, final int depth ) {
	this.x = x;
	this.y = y;
	this.depth = depth;
	in = true;
    }

    public String toString() {
	return String.format( "(%d, %d, %d)", y, x, depth );
    }
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int m = stdin.nextInt();
	    final int n = stdin.nextInt();
	    
	    if ( n == 0 && m == 0 ) {
		break;
	    }

	    final boolean[][] map = new boolean[ n ][ m ];
	    for ( int i = 0; i < n; i++ ) {
		for ( int j = 0; j < m; j++ ) {
		    map[ i ][ j ] = ( stdin.nextInt() == 1 ) ? true : false;
		}
	    }

	    int maxStep = -1;
	    final boolean[][] visited = new boolean[ n ][ m ];
	    final int[][] count = new int[ n ][ m ];
	    final boolean[][] executed = new boolean[ n ][ m ];
	    for ( int i = 0; i < n; i++ ) {
		for ( int j = 0; j < m; j++ ) {
		    if ( map[ i ][ j ] ) {
			final int step = find( map, visited, count, i, j );
			//final Point p = bfs( map, visited, i, j );
			//if ( !executed[ p.y ][ p.x ] ) {
			//executed[ p.y ][ p.x ] = true;
			maxStep = maxStep < step ? step : maxStep;
		    }
		}
	    }
	    System.out.println( maxStep );
	}	
    }

    static final int[] dx = { -1, 0, 1, 0 };
    static final int[] dy = { 0, 1, 0, -1 };
    
    static Point bfs( final boolean[][] map, final boolean[][] visited, final int y, final int x ) {
	for ( final boolean[] array : visited ) {
	    Arrays.fill( array, false );
	}
	
	final Queue<Point> que = new LinkedList<Point>();
	que.offer( new Point( y, x ) );

	Point last = null;
	while ( !que.isEmpty() ) {
	    last = que.poll();
	    visited[ last.y ][ last.x ] = true;
	    for ( int i = 0; i < 4; i++ ) {
		final int ny = last.y + dy[ i ];
		final int nx = last.x + dx[ i ];
		if ( 0 <= ny && ny < map.length &&
		     0 <= nx && nx < map[ 0 ].length &&
		     !visited[ ny ][ nx ] && map[ ny ][ nx ] ) {
		    
		    que.offer( new Point( ny, nx ) );
		}
	    }
	}
	return last;
    }

    static int find( final boolean[][] map, final boolean[][] visited, final int[][] count, final int y, final int x ) {
	for ( final boolean[] array : visited ) {
	    Arrays.fill( array, false );
	}
	for ( final int[] array : count ) {
	    Arrays.fill( array, -1 );
	}

	final Stack<PointDepth> stack = new Stack<PointDepth>();
	stack.push( new PointDepth( y, x, 1 ) );

	while ( !stack.isEmpty() ) {
	    
	    final PointDepth p = stack.pop();
	    if ( p.in ) {

		visited[ p.y ][ p.x ] = true;
		count[ p.y ][ p.x ] = p.depth;
		p.in = false;
		stack.push( p );
		
		for ( int i = 0; i < 4; i++ ) {
		    final int ny = p.y + dy[ i ];
		    final int nx = p.x + dx[ i ];
		    if ( 0 <= ny && ny < map.length &&
			 0 <= nx && nx < map[ 0 ].length &&
			 !visited[ ny ][ nx ] && map[ ny ][ nx ] ) {
			
			stack.push( new PointDepth( ny, nx, p.depth + 1 ) );
		    }
		}
	    } else {
		visited[ p.y ][ p.x ] = false;
	    }
	}
	int maxCount = -1;
	for ( int[] array : count ) {
	    for ( int val : array ) {
		maxCount = maxCount < val ? val : maxCount;
	    }
	}
	return maxCount;
    }

    static void printArray( int[][] count ) {
	for ( final int[] array : count ) {
	    System.err.println( Arrays.toString( array ) );
	}
	System.err.println();
    }    
}