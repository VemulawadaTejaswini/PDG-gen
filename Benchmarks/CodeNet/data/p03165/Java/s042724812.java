import java.io.*;
import java.util.*;
class Main {
	
	BufferedReader in;
	PrintWriter ob;
	StringTokenizer st;
	
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
		char s[] = nextToken().toCharArray();
		char t[] = nextToken().toCharArray();
		
		int n = s.length;
		int m = t.length;
		int dp[][] = new int[n+1][m+1];
		for(int i=1 ; i<=n;  i++) {
			for(int j=1 ; j<=m ; j++) {
				if( s[i-1] == t[j-1] )
					dp[i][j] = 1 + dp[i-1][j-1];
				else
					dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
			}
		}
		
		int i=n , j = m;
		String res = "";
		while( i>0 && j>0 ) {
			if( s[i-1] == t[j-1] ) {
				res = s[i-1] + res;
				i--;
				j--;
			}
			else if( dp[i-1][j] > dp[i][j-1] )
				i--;
			else 
				j--;
		}
		ob.println(res);
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