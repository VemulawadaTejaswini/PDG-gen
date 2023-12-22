import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	
	final int N = stdin.nextInt();
	final int M = stdin.nextInt();

	int[] map = new int[N];
	for ( int i = 0; i < N; i++ ) {
	    map[i] = stdin.nextInt();
	}

	int p = 0;
	for ( int i = 1; i <= M; i++ ) {
	    final int dice = stdin.nextInt();
	    p += dice;
	    if ( p >= N - 1 ) {
		System.out.println( i );
		break;
	    }
	    p += map[p];
	}	    
    }    
}