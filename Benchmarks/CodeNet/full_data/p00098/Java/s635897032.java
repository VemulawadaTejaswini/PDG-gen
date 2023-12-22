import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int n = stdin.nextInt();

	final int[][] map = new int[n][n];
	for ( int i = 0; i < n; i++ ) {
	    for ( int j = 0; j < n; j++ ) {
		map[i][j] = stdin.nextInt();
	    }	    
	}

	final int[][] cumCol = new int[n + 1][n];
	for ( int i = 0; i < n; i++ ) {
	    for ( int j = 1; j <= n; j++ ) {
		cumCol[j][i] = cumCol[j - 1][i] + map[j - 1][i];
	    }
	}

	// final int[][] cumRow = new int[n][n + 1];
	// for ( int i = 0; i < n; i++ ) {
	//     for ( int j = 1; j <= n; j++ ) {
	// 	cumRow[i][j] = cumRow[i][j - 1] + map[i][j - 1];
	//     }
	// }

	int maxSum = 0;
	for ( int fy = 0; fy < n; fy++ ) {
	    for ( int fx = 0; fx < n; fx++ ) {
		for ( int ty = fy; ty < n; ty++ ) {
		    int sum = 0;
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