	import java.util.*;
	import java.io.*;
	public class Main {
		static int n,wi[],W;
		static long dp[][],vi[];
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				W=Integer.parseInt(tok.nextToken());
				
				wi=new int[n];
				vi=new long[n];
				int sm=0;
				for(int i=0;i<n;i++) {
					tok=new StringTokenizer(br.readLine()," ");
					wi[i]=Integer.parseInt(tok.nextToken());
					vi[i]=Long.parseLong(tok.nextToken());
					sm+=vi[i];
				}
				dp=new long[n+1][sm+1];
				memset();
				printans.append(call(0,0,0));
			    
			}
			System.out.println(printans);
			
		}
		static void memset() {
			for(long a[]:dp) {
				Arrays.fill(a, -1);
			}
		}
static long call(int i,long v,int w) {
			
			if(i==n) {
				
				return 0;
			}
		
			if(dp[i][w]!=-1) {
				return dp[i][w];
			}
			if(wi[i]+w>W) {
				dp[i][w]=call(i+1,v,w);
			}
			else {
				dp[i][w]=Math.max(call(i+1,v,w), vi[i]+call(i+1,v,w+wi[i]));
			}
			
		
			return dp[i][w];
			
		}	
			
	}
