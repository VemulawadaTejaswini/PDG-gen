import java.io.*;
import java.util.*;
public class Main
{
	private void solve()throws IOException
	{
		fact();
		int n=nextInt();
		int m=nextInt();
		int k=nextInt();
		long ans=0;
		for(int i=0;i<=m;i++)
			for(int j=0;j<=k;j++)
			{
				long curr=fact[n-1+i+j];
				long den=(fact[n-1]*((fact[i]*fact[j])%mod))%mod;
				curr=(curr*modinv(den))%mod;
				curr=(curr*modpow(3,m+k-i-j))%mod;
				ans=(ans+curr)%mod;
			}
		out.println(ans);
	}
	int maxn=(int)(1e6);
	long fact[];
	void fact(){
		fact=new long[maxn+1];
		fact[0]=1;
		for(int i=1;i<=maxn;i++)
			fact[i]=(fact[i-1]*i)%mod;
	}
	final long mod=(long)(1e9+7);
	long modinv(long x){
	    return modpow(x,mod-2);
	}
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