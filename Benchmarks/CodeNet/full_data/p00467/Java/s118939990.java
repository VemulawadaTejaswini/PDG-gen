import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {
	    final int N = stdin.nextInt();
	    final int M = stdin.nextInt();
	    if ( N == 0 && M == 0 ){
		break;
	    }
	    
	    int[] map = new int[N];
	    for ( int i = 0; i < N; i++ ) {
		map[i] = stdin.nextInt();
	    }
	    
	    int p = 0;
	    int[] dices = new int[M];
	    for ( int i = 0; i < M; i++ ) {
		dices[i] = stdin.nextInt();
	    }
	    for ( int i = 1; i <= M; i++ ) {
		final int dice = dices[i - 1];
		p += dice;
		if ( p >= N - 1 ) {
		    System.out.println( i );
		    break;
		}
		p += map[p];
	    }
	}
    }    
}