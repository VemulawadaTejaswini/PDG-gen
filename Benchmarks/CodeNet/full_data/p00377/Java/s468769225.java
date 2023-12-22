import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner( System.in );
	int n = sc.nextInt() + 1;
	int c = sc.nextInt();

	int total_p = 0;
	for ( int i=0; i<c; ++i ) {
	    total_p += sc.nextInt();
	}

	int p = total_p/n;
	if ( total_p%n != 0 ) ++p;
	
	System.out.println( p );
    }

    public static void main( String[] a ) {new Main().solve(); }
}

