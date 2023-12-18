import java.io.*;
import java.util.*;
class Main {
	
	BufferedReader in;
	PrintWriter ob;
	StringTokenizer st;
	long dp[];
	
	public static void main(String args[]) throws IOException {
		new Main().run();
	}
	void run() throws IOException {
		in = new BufferedReader( new InputStreamReader( System.in ) );
		ob = new PrintWriter( System.out );
		solve();
		ob.flush();
	}
	
	void solve() throws IOException {
		int n = ni();
		int k = ni();
		
		if( n == 0 ) {
			ob.println("0");
			return;
		}
		
		int a[] = new int[n];
		dp = new long[n];
		for(int i=0 ; i<n ; i++) { 
			a[i] = ni();
			dp[i] = -1;
		}
			
		long res = rec( a , 0 , n-1 , k );
		ob.println(res);
	}
	
	long rec( int a[] , int i , int size , int k ) {
		if( i > size )
			return Long.MAX_VALUE;
		if( size == i )
			return 0;
		
		if( dp[i] != -1 )
			return dp[i];
		
		long ret = Long.MAX_VALUE;
		for( int j=i+1 ; j<=i+k && j<=size ; j++ )
			ret = Math.min( ret , Math.abs( a[i] - a[j] ) + rec( a , j , size , k ) );
		
		dp[i] = ret;
		return ret;
	}
	
	int ni() throws IOException {
		return Integer.parseInt( nextToken() );
	}
	
	String nextToken() throws IOException {
		if( st == null || !st.hasMoreTokens() )
			st = new StringTokenizer(in.readLine());
		return st.nextToken();
	}
}