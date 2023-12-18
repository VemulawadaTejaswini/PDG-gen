		import java.util.*;
		import java.io.*;
		public class atcoder {
			static int n;
			static double arr[],dp[][];
			public static void main(String[] args) throws IOException{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int t=1;
		//		Integer.parseInt(br.readLine().trim());
				StringBuilder printans=new StringBuilder();
				while(t-->0)
				{
					StringTokenizer tok=new StringTokenizer(br.readLine()," ");
					n=Integer.parseInt(tok.nextToken());
					tok=new StringTokenizer(br.readLine()," ");
					arr=new double[n];
					for(int i=0;i<n;i++) {
						arr[i]=Double.parseDouble(tok.nextToken());
					}
					dp=new double[n+1][n+1];
					memset();
					System.out.println(dfs(n,0));
					
					
				}
				
				
			}
			static double  dfs(int i,int h) {
				if(dp[i][h]!=-1d)return dp[i][h];
				if(i<=0) {
					if(h>n/2) {
						return 1;
					}
					return 0;
				}
				
				dp[i][h]=(double)(arr[i-1]*dfs(i-1,h+1)+(1-arr[i-1])*dfs(i-1,h));
				
				return dp[i][h];
				
				
				
			}
	//		
			static void memset() {
				for(double a[]:dp) {
					Arrays.fill(a,-1d);
				}
			}
			
				
		}
