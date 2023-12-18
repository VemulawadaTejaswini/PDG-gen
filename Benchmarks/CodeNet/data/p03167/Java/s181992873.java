	import java.util.*;
	import java.io.*;

	public class Main {
		static int n,m,mod=(int)1e9+7;
		static ArrayList<ArrayList<Integer>> g;
		static int l1,l2,color[];
		static char mat[][];
		static boolean cj;
		static long dp[][];
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				m=Integer.parseInt(tok.nextToken());
				mat=new char[n][m];
				for(int i=0;i<n;i++) {
					String ccc=br.readLine().trim();
					
					for(int j=0;j<m;j++) {
						mat[i][j]=ccc.charAt(j);
						
					}
				
					
				}
				dp=new long[n+1][m+1];
				memset();
				System.out.println(dfs(0,0));
				
				
			}
			
			
		}
		static long  dfs(int i,int j) {
			if(i==n-1 && j==m-1) {
				
				return 1;
			}
			if(i>=n || j>=m) {
				return 0;
				
			}
			long ans=0;
			if(dp[i][j]!=-1)return dp[i][j];
			if(i<n-1 && mat[i+1][j]!='#') {
				ans+=dfs(i+1,j)%mod;
			}
			if(j<m-1 && mat[i][j+1]!='#') {
				ans+=dfs(i,j+1)%mod;
			}
			dp[i][j]=ans%mod;
			return ans%mod;
		}
		
		static void memset() {
			for(long a[]:dp) {
				Arrays.fill(a,-1);
			}
		}
		
			
	}
