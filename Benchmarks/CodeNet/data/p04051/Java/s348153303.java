import java.io.*;
import java.util.*;
public class Main
{
	final int zero=2001,maxn=2000;
	int n,a[],b[];
	long dp[][];
	final long mod=(long)(1e9+7);
	private void solve()throws IOException
	{
		fact();
		n=nextInt();
		a=new int[n+1];
		b=new int[n+1];
		dp=new long[zero+maxn+1][zero+maxn+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			b[i]=nextInt();
			dp[zero-a[i]][zero-b[i]]++;
		}
		for(int i=-maxn;i<=maxn;i++)
			for(int j=-maxn;j<=maxn;j++)
				dp[zero+i][zero+j]=(dp[zero+i][zero+j]+(dp[zero+i-1][zero+j])+(dp[zero+i][zero+j-1])%mod)%mod;
		long ans=0;
		for(int i=1;i<=n;i++)
			ans=(ans+dp[zero+a[i]][zero+b[i]])%mod;
		for(int i=1;i<=n;i++)
			ans=(ans-choose(2*a[i]+2*b[i],2*a[i])+mod)%mod;
		out.println((ans*modinv(2))%mod);
	}
	long choose(int n,int r)
	{
		return (((fact[n]*modinv(fact[r]))%mod)*modinv(fact[n-r]))%mod;
	}
	long fact[];
	void fact(){
		fact=new long[8000+1];
		fact[0]=1;
		for(int i=1;i<=8000;i++)
			fact[i]=(fact[i-1]*i)%mod;
	}
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