import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
  static int n,len,mat[][],num;
	static String dig;
	static long ans;
	static StringBuilder allset;
	static long dp[][][];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
//		Integer.parseInt(br.readLine().trim());
		OutputStream outputStream =System.out;
        PrintWriter out =new PrintWriter(outputStream);
		StringBuilder printans=new StringBuilder();
		while(t-->0)
		{
			dig=br.readLine().trim();
			len=dig.length();
			num=Integer.parseInt(br.readLine());
			dp=new long[len+1][num+1][2];
			memset();
			printans.append((call(0,0,true)-1+mod)%mod);
		}
		out.println(printans);
		out.close();
		
	}
	static long call(int i,int sum,boolean edge) {
		
		if(i==len) {
			if(sum==0) {
				return 1;
			}
			return 0;
		}
		if(dp[i][sum][edge?1:0]!=-1)return dp[i][sum][edge?1:0];
		long ans =0;
		int lim=9;
		if(edge)lim=dig.charAt(i)-'0';
		
		for(int j=0;j<=lim;j++) {
			boolean temo=edge;
			if(j<lim) {
				temo=false;
			}
			ans+=call(i+1,(sum+j)%num,temo);
		}
		dp[i][sum][edge?1:0]=ans%mod;
		return ans%mod;
		
	}
	static void memset() {
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j][0]=dp[i][j][1]=-1;
				
			}
			
		}
	}
	static int mod=(int)1e9+7;
}
