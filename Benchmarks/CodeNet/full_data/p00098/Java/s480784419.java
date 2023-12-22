import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int n = stdin.nextInt();

	final long[][] map = new long[n][n];
	for ( int i = 0; i < n; i++ ) {
	    for ( int j = 0; j < n; j++ ) {
		map[i][j] = stdin.nextLong();
	    }	    
	}

	final long[][] cumCol = new long[n + 1][n];
	for ( int i = 0; i < n; i++ ) {
	    for ( int j = 1; j <= n; j++ ) {
		cumCol[j][i] = cumCol[j - 1][i] + map[j - 1][i];
	    }
	}

	// final long[][] cumRow = new long[n][n + 1];
	// for ( long i = 0; i < n; i++ ) {
	//     for ( long j = 1; j <= n; j++ ) {
	// 	cumRow[i][j] = cumRow[i][j - 1] + map[i][j - 1];
	//     }
	// }

	long maxSum = 0;
	for ( int fy = 0; fy < n; fy++ ) {
	    for ( int fx = 0; fx < n; fx++ ) {
		for ( int ty = fy; ty < n; ty++ ) {
		    long sum = 0;
		    for ( int tx = fx; tx < n; tx++ ) {
			sum += cumCol[ty + 1][tx] - cumCol[fy][tx];
			maxSum = max( maxSum, sum );
		    }
		}
	    }
	}
	System.out.println( maxSum );
    }    
}