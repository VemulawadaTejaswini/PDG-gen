import java.util.*;
import java.io.*;

class Main {

    static final int SMALL = 1;
    static final int MIDDLE = 2;
    static final int LARGE = 3;

    public static void main( String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	int[][] map = new int[10][10];

	while ( stdin.hasNextLine() ) {
	    String[] input = stdin.nextLine().split(",");
	    final int x = Integer.parseInt( input[0] );
	    final int y = Integer.parseInt( input[1] );
	    final int size = Integer.parseInt( input[2] );
	    switch ( size ) {
	    case SMALL:
		dropSmall( map, x, y );
		break;
	    case MIDDLE:
		dropMiddle( map, x, y );
		break;
	    case LARGE:
		dropLarge( map, x, y );
		break;
	    }
	}

	final int noOfZero = countZero( map );
	final int max = countMax( map );
	System.out.println(noOfZero);
	System.out.println(max);
	
    }

    static int countZero( int[][] map ) {
	int count = 0;
	for ( int i = 0; i < 10; i++ ) {
	    for ( int j = 0; j < 10; j++ ) {
		if ( map[i][j] == 0 ) {
		    count++;
		}
	    }
	}
	return count;
    }

    static int countMax( int[][] map ) {
	int max = 0;
	for ( int i = 0; i < 10; i++ ) {
	    for ( int j = 0; j < 10; j++ ) {
		if ( map[i][j] > max ) {
		    max = map[i][j];
		}
	    }
	}
	return max;
    }

    static boolean check( int val ) {
	return 0 <= val && val <= 9;
    }

    static void dropSmall( int[][] map, int x, int y ) {
	final int[] width = {0, 1, 0};
	final int[] yindex = {-1, 0, 1};
	
	for ( int i = 0; i < 3; i++ ) {
	    final int cy = y + yindex[i];
	    for ( int j = x - width[i]; j <= x + width[i]; j++ ) {
		if ( check( cy ) && check( j ) ) {
		    map[cy][j]++;
		}
	    }		
	}
	
    }

    static void dropMiddle( int[][] map, int x, int y ) {
	final int xs = Math.max( 0, x - 1 );
	final int xe = Math.min( 9, x + 1 );
	final int ys = Math.max( 0, y - 1 );
	final int ye = Math.min( 9, y + 1 );

	for ( int i = ys; i <= ye; i++ ) {
	    for ( int j = xs; j <= xe; j++ ) {
		map[i][j]++;
	    }
	}
    }
    
    static void dropLarge( int[][] map, int x, int y ) {
	final int[] width = {0, 1, 2, 1, 0};
	final int[] yindex = {-2, -1, 0, 1, 2};
	
	for ( int i = 0; i < 5; i++ ) {
	    final int cy = y + yindex[i];
	    for ( int j = x - width[i]; j <= x + width[i]; j++ ) {
		if ( check( cy ) && check( j ) ) {
		    map[cy][j]++;
		}
	    }		
	}
    }
    
}