	import java.util.*;
	import java.io.*;
	public class Main {
		static int n,vi[];
		static long dp[][],W,wi[];
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				W=Long.parseLong(tok.nextToken());
				
				wi=new long[n];
				vi=new int[n];
				int sm=0;
				for(int i=0;i<n;i++) {
					tok=new StringTokenizer(br.readLine()," ");
					wi[i]=Long.parseLong(tok.nextToken());
					vi[i]=Integer.parseInt(tok.nextToken());
					sm+=vi[i];
				}
				dp=new long[n+1][sm+1];
				memset();
			 
			    System.out.println(call());
			}
			
			
		}
		static void memset() {
			 long INF = 1_000_000_000_000L;
				for (int i = 1; i < dp[0].length; i++) dp[0][i] = INF;
			    
		}
static long call() {
			
			for(int i=1;i<=n;i++) {
				for(int j=0;j<dp[0].length;j++) {
					dp[i][j]=dp[i-1][j];
					if(j-vi[i-1]>=0) {
						dp[i][j]=Math.min(dp[i][j], wi[i-1]+dp[i-1][j-vi[i-1]]);
					}
					
					
					
				}
			}
			long aa=0;
			for(int j=0;j<dp[0].length;j++) {
				if(dp[n][j]<=W) {
					
					aa=Math.max(aa,j);
				}
			}
			
return aa;		
}	
			
	}
