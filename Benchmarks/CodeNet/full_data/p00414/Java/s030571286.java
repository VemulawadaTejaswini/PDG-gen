import java.io.*;
import java.util.*;

class Main {
    void solve() {
	Scanner sc = new Scanner( System.in );
	int l = sc.nextInt();
	int n = sc.nextInt();
	String s = sc.next();

	long oocnt = 0;
	for ( int i=0; i<s.length()-1; ++i ) {
	    if ( s.charAt(i) == 'o' && s.charAt(i+1) == 'o' ) ++oocnt;
	}
	long total_oocnt = 0;
	for ( int i=0; i<n; ++i ) {
	    total_oocnt += oocnt;
	    oocnt *= 2;
	}

	System.out.println( 3*total_oocnt + s.length() );	    
    }
    public static void main( String[] a ) { new Main().solve(); }    
}

