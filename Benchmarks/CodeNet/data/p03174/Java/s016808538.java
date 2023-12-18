
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int m=1000000007;
    static long dp[][];
	public static long 	 Solve(int i,int womenset,int n,int comp[][]) {
		// Base Condn : No men is left
		if(i==n) {
			if(womenset==0) return 1;
			else return 0;
		}
		if(dp[i][womenset]!=-1) return dp[i][womenset];
		long ans=0;
		for(int women=0;women<n;women++) {
			boolean available= (((1<<women)&womenset)!=0);
		
			if(available&&comp[i][women]==1) {
				ans=(ans%m+ Solve(i+1, (womenset^(1<<women)), n, comp)%m)%m;
				
				
			}
		}
		dp[i][womenset]=ans;
	
		return dp[i][womenset];
	}
	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
	int n=sc.nextInt();
	// comp matrix
	int comp[][]=new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) comp[i][j]=sc.nextInt();
	}
	dp=new long[n][1<<n];
	for(int i=0;i<n;i++) Arrays.fill(dp[i], -1);
	long ans=Solve(0, (1<<n)-1, n, comp);
	System.out.println(ans);
	
	

	}

	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}
	

}



