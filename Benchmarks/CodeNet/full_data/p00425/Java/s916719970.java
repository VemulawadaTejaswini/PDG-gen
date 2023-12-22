import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

	static final int TOP = 0;
	static final int NORTH = 1;
	static final int EAST = 2;
	static final int SOUTH = 3;
	static final int WEST = 4;
	static final int DOWN = 5;

	static int[] northPos = { TOP, SOUTH, DOWN, NORTH };
	static int[] southPos = { TOP, NORTH, DOWN, SOUTH };
	static int[] eastPos = { TOP, WEST, DOWN, EAST };
	static int[] westPos = { TOP, EAST, DOWN, WEST };
	static int[] rightPos = { SOUTH, EAST, NORTH, WEST };
	static int[] leftPos = { SOUTH, WEST, NORTH, EAST };
	
	static void apply( int[] dice, int[] pos ) {
		int tmp = dice[ pos[ 0 ] ];
		for ( int i = 0; i < 3; i++ ) {
			dice[ pos[ i ] ] = dice[ pos[ i + 1 ] ];
		}
		dice[ pos[ 3 ] ] = tmp;
	}
	
    public static void main( final String[] args ) {
		
		final Scanner stdin = new Scanner( System.in );

		int[] dice = new int[ 6 ];
		Map<String, int[]> map = new HashMap<String, int[]>();
		map.put( "North", northPos );
		map.put( "South", southPos );
		map.put( "East", eastPos );
		map.put( "West", westPos );
		map.put( "Left", leftPos );
		map.put( "Right", rightPos );
		
		while ( true ) {
			final int n = Integer.parseInt( stdin.nextLine() );
			if ( n == 0 ) break;
			
			int sum = 1;
			dice[ TOP ] = 1;
			dice[ NORTH ] = 5;
			dice[ EAST ] = 3;
			dice[ SOUTH ] = 2;
			dice[ WEST ] = 4;
			dice[ DOWN ] = 6;
			
			for ( int i = 0; i < n; i++ ) {
				String input =  stdin.nextLine();
				apply( dice, map.get( input ) );
				sum += dice[ TOP ];
			}
			System.out.println( sum );
		}	
    }    
}