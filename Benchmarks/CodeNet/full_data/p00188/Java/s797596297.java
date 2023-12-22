import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    final int[] val = new int[n];
	    for ( int i = 0; i < n; i++ ) {
		val[i] = stdin.nextInt();
	    }

	    final int target = stdin.nextInt();

	    int left = 0;
	    int right = n - 1;
	    int count = 0;
	    while ( left <= right ) {

		final int middle = ( left + right ) / 2;
		count++;
		if ( target < val[middle] ) {
		    right = middle - 1;
		} else if ( target > val[middle] ) {
		    left = middle + 1;
		} else {
		    break;
		}
	    }

	    System.out.println( count );	    
	}
	
    }    
}