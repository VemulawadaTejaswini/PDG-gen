import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	static int n,mat[][];
	static long ans;
	static StringBuilder allset;
	static Long dp[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
//		Integer.parseInt(br.readLine().trim());
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
			dp=new Long[n+1][1<<n+1];
			memset();
			System.out.println(call(0,0));
		}
	}
	static long call(int i,int mask) {
		
		if(i==n) {
			
			if((mask&1<<n+1)==0)return 1;
			
			
			return 0;
		}
		if(dp[i][mask]!=-1l)return dp[i][mask];
		long ans=0;
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
			Arrays.fill(dp[i], -1l);
		}
	}
	static int mod=(int)1e9+7;
}