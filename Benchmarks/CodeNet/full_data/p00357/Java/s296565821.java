import java.io.*;
import java.util.*;

class Main {

    int n = 0;
    ArrayList<Integer> m_bounce = new ArrayList<Integer>();
    
    boolean IsReachable() {

	int current = 0;
	for ( int i=0; i<n; ++i ) {
	    if ( current < 10*i ) return false;
	    current = Math.max( current, 10*i + m_bounce.get( i ) );
	    if ( current >= 10*n ) return true;
	}
	return false;
    }
    
    void solve(){

	Scanner sc = new Scanner( System.in );

	n = sc.nextInt();
	for ( int i=0; i<n; ++i ) m_bounce.add( sc.nextInt() );
	    
	if ( !IsReachable() ) {
	    System.out.println( "no" );
	    return;
	}
	
	Collections.reverse( m_bounce );
	if ( !IsReachable() ) System.out.println( "no" );
	else System.out.println( "yes" );
	
    }

    public static void main( String[] a ) {new Main().solve(); }
}

