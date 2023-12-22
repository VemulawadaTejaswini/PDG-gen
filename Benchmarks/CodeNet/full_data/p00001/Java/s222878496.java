import java.util.Scanner;

class _0001 {
    public static void main( String[] args ) {
    	int[] data = new int[ 10 ], top3 = new int[ 3 ];
    
    	Scanner stdIn = new Scanner( System.in );

    	for( int i = 0; i < 10; i++ )
    		data[ i ] = stdIn.nextInt();

		for ( int i = 0; i < 3; i++ ) {
			int max = data[ 0 ], idx = 0;

			for ( int j = 1; j < 10 - i; j++ )
				if ( max < data[ j ] )
					max = data[ idx = j ];
			top3[ i ] = max;

			for ( int j = idx; j < 9 - i; j++ )
				data[ j ] = data[ j + 1 ];
		}

		for( int i = 0; i < 3; i++ )
			System.out.println( top3[ i ] );
    }
}