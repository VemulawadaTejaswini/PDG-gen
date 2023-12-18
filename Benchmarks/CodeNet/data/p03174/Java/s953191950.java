import java.io.*;
import java.util.*;

class Main{
	static int n,mat[][];
	static long ans;
	static StringBuilder allset;
	static long dp[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
//		Integer.parseInt(br.readLine().trim());
		OutputStream outputStream =System.out;
        PrintWriter out =new PrintWriter(outputStream);
		StringBuilder printans=new StringBuilder();
		while(t-->0)
		{
			StringTokenizer tok=new StringTokenizer(br.readLine()," ");
			n=Integer.parseInt(tok.nextToken());
			
			mat=new int[n][n];
			for(int i=0;i<n;i++) {
				tok=new StringTokenizer(br.readLine()," ");
				for(int j=0;j<n;j++)
					mat[i][j]=Integer.parseInt(tok.nextToken());
			}
			dp=new long[n+1][1<<n];
			memset();
			printans.append(call(0,0));
		}
		out.println(printans);
		out.close();
		
	}
	static long call(int i,int mask) {
		
		if(i==n) {
			
			if((mask&1<<n+1)==0)return 1;
			
			
			return 0;
		}
		if(dp[i][mask]!=-1)return dp[i][mask];
		Long ans=0l;
		for(int j=0;j<n;j++) {
			if((mask & (1<<j))==0 && mat[i][j]==1) {
				mask|=(1<<j);
				ans+=call(i+1,mask);
				mask^=(1<<j);
			}
			
			
		}
		dp[i][mask]=ans%mod;
		return ans%mod;
	}
	static void memset() {
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
	}
	static int mod=(int)1e9+7;
}