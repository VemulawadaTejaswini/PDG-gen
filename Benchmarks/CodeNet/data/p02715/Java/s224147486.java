import java.io.*;
import java.util.*;
public class Main
{
	private void solve()throws IOException
	{
		int n=nextInt();
		int k=nextInt();
		long ans=0;
		//dp[i] is the number of ways in which sequence gcd is multiple of i
		long dp[]=new long[k+1];
		for(int i=k;i>=1;i--)
		{
			long curr=(modpow(k/i,n)-dp[i]+mod)%mod;
			for(int j=2;j*j<=i;j++)
				if(i%j==0)
				{
					dp[j]=(dp[j]+curr)%mod;
					if(j*j!=i)
						dp[i/j]=(dp[i/j]+curr)%mod;
				}
			if(i!=1)
				dp[1]=(dp[1]+curr)%mod;
			ans=(ans+(i*curr)%mod)%mod;
		}
		out.println(ans);
	}
	final long mod=(long)(1e9+7);
	long modpow(long a,long b){
	    long ret=1;
	    while(b!=0)
	    {
	        if(b%2==1)
	            ret=(ret*a)%mod;
	        a=(a*a)%mod;
	        b=b/2;
	    }
	    return ret;
	} 

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();

		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}