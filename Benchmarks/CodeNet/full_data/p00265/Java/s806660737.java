import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final String[] param = stdin.nextLine().split( " " );
	final int N = Integer.parseInt( param[ 0 ] );
	final int Q = Integer.parseInt( param[ 1 ] );

	final String[] input = stdin.nextLine().split( " " );
	final int[] cs = new int[ input.length ];
	int maxValue = Integer.MIN_VALUE;
	for ( int i = 0; i < cs.length; i++ ) {
	    cs[ i ] = Integer.parseInt( input[ i ] );
	    maxValue = max( maxValue, cs[ i ] );
	}

	boolean[] ns = new boolean[ maxValue + 1 ];
	for ( final int c : cs ) {
	    ns[ c ] = true;		
	}

	for ( int i = 0; i < Q; i++ ) {
	    final int q = stdin.nextInt();
	    int stepIndex = 0;
	    int maxMod = 0;
	    while ( stepIndex <= maxValue ) {
		for ( int j = maxMod; stepIndex + j <= maxValue && j < q; j++ ) {
		    if ( ns[ stepIndex + j ] ) {
			maxMod = j;
		    }
		}
		stepIndex += q;
		if ( maxMod == q - 1 ) {
		    break;
		}
	    }
	    System.out.println( maxMod );
	}	
    }    
}