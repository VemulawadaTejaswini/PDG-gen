import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner( System.in );
	int n = sc.nextInt();
	
	int max_t = 0;
	int[] timing = new int[n];
	for ( int i=0; i<n; ++i ) {
	    timing[i] = sc.nextInt();
	    if ( timing[i] > max_t ) max_t = timing[i];
	}

	ArrayList< Integer > divisor = new ArrayList< Integer >();
	
	for ( int i=1; i<=max_t>>1; ++i ) {
	    if ( max_t%i == 0 ) divisor.add( i );
	}
	divisor.add( max_t );

	int adj = 0;
	for ( int t : timing ) {

	    for ( int d : divisor ) {
		if ( d >= t ) {
		    adj += d - t;
		    break;
		}
	    }
	}

	System.out.println( adj );
    }

    public static void main( String[] a ) {new Main().solve(); }
}

