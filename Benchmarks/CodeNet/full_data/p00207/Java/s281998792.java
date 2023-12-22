import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Point {
	final int x;
	final int y;

	Point( final int x, final int y ) {
		this.y = y;
		this.x = x;
	}

	public boolean equals( final Point p ) {
		return x == p.x && y == p.y;
	}
}

class Main {

    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );

		while ( true ) {

			final int w = stdin.nextInt();
			final int h = stdin.nextInt();
			final int[][] map = new int[ h + 2 ][ w + 2 ];
			
			if ( w == 0 && h == 0 ) break;

			final Point start = new Point( stdin.nextInt(), stdin.nextInt() );
			final Point end = new Point( stdin.nextInt(), stdin.nextInt() );

			final int n = stdin.nextInt();
			for ( int i = 0; i < n; i++ ) {
				final int c = stdin.nextInt();
				final int d = stdin.nextInt();
				final int xs = stdin.nextInt();
				final int ys = stdin.nextInt();

				final int dx = d == 0 ? 4 : 2;
				final int dy = d == 0 ? 2 : 4;
				
				for ( int y = ys; y < ys + dy; y++ ) {
					for ( int x = xs; x < xs + dx; x++ ) {
						map[ y ][ x ] = c;
					}
				}				
			}
			if ( solve( map, start, end ) ) {
				System.out.println( "OK" );
			} else {
				System.out.println( "NG" );
			}
		}
    }

	static final int VISITED = -1;
	static final int[] dx = {-1, 0, 1, 0};
	static final int[] dy = {0, 1, 0, -1};
	
	static boolean solve( final int[][] map, final Point start, final Point end ) {
		
		final int color = map[ start.y ][ start.x ];
		final int w = map[ 0 ].length - 2;
		final int h = map.length - 2;
		
		final Queue<Point> que = new ArrayDeque<Point>();

		que.add( start );

		while ( !que.isEmpty() ){
			final Point p = que.poll();
			map[ p.y ][ p.x ] = VISITED;
			if ( p.x == end.x && p.y == end.y ) return true;

			for ( int i = 0; i < 4; i++ ) {
				final int nx = p.x + dx[ i ];
				final int ny = p.y + dy[ i ];

				if ( 1 <= nx && nx <= w && 1 <= ny && ny <= h &&
					 map[ ny ][ nx ] == color ) {

					que.offer( new Point( nx, ny ) );
				}				
			}			
		}
		return false;
	}
}