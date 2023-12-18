import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int[][] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long dp[][];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
		
			int n=sc.nextInt();
			ar=new int[n][n];
			long sum=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
				ar[i][j]=sc.nextInt();
				
			}
			dp=new long[n][(1<<n)];
			set=(1<<n)-1;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<dp[0].length;j++) {
					dp[i][j]=-1;
				}
			}
			long ans=solve(n-1,0);
			
			
			System.out.println(ans);
			
		}

		System.out.println(out);
	}
	static int set;
	static long solve(int i,int mask) {
		if(i==-1 && mask==set) {
			return 1L;
		}
		if(i<=-1)return 0;
		if(dp[i][mask]!=-1)return dp[i][mask];
	    long ans=0;
	    
	    for(int j=0;j<ar.length;j++) {
	    	if(ar[i][j]==1 && ((1<<j)&mask)==0)ans+=solve(i-1,(mask|(1<<j)));
	    	ans%=mod;
	    }
		return dp[i][mask]= ans%mod;
		
	}


}