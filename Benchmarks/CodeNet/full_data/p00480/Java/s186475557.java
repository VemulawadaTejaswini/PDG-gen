import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

	static void dp( long[] ans, int[] array, int from, int to ) {
		long[] before = new long[ ans.length ];
		before[ 0 ] = 1L;
		for ( int i = from; i < to; i++ ) {
			Arrays.fill( ans, 0L );
			for ( int j = 0; j <= 20; j++ ) {
				final int pval = j + array[ i ];
				if ( 0 <= pval && pval <= 20 ) {
					ans[ pval ] += before[ j ];
				}
				final int sval = j - array[ i ];
				if ( 0 <= sval && sval <= 20 ) {
					ans[ sval ] += before[ j ];
				}
			}
			System.arraycopy( ans, 0, before, 0, ans.length );
		}
	}
	
    public static void main( final String[] args ) {

		final Scanner stdin = new Scanner( System.in );
		int n = stdin.nextInt();
		int[] ary = new int[ n ];
		for ( int i = 0; i < n; i++ ) {
			ary[ i ] = stdin.nextInt();
		}
		long[] left = new long[ 21 ];
		
		dp( left, ary, 0, n - 1 );
		System.out.println( left[ ary[ n - 1 ] ] );
    }    
}