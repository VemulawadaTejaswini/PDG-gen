import java.io.IOException;
import java.util.ArrayList;
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
	static int ar[][];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long dp[];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			gr=new ArrayList[n];
			for(int i=0;i<n;i++) {
				gr[i]=new ArrayList<Integer>();
			}
			for(int i=0;i<m;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				u--;
				v--;
				gr[u].add(v);
			}
			dp=new long[n];
			
			for(int i=0;i<n;i++) {
				if(dp[i]==0)dp[i]=solve(i);
			}
			
			long max=Long.MIN_VALUE;
			for(int i=0;i<n;i++) {
				max=Math.max(dp[i], max);
			}
		System.out.println(max);
		}

	}
	
	static long solve(int pa) {
		if(dp[pa]!=0)return dp[pa];
		long ans=-1;
	    for(Integer ch:gr[pa]) {
	    	ans=Math.max(ans,solve(ch));
	    }
	    return dp[pa]=ans+1;
		
		
	}


}