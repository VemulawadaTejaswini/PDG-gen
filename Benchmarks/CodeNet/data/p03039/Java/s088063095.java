import java.io.*;
import java.util.*;





public class Main
{

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);	

	static int n,m;
	static long mod=1000000007;

	static long[] fact;

	static long power(long x,long y)
	{
		if(y==0) return 1;
		long cp = power(x,y/2);

		if(y%2==0) return (cp*cp)%mod;
		return ((cp*cp)%mod * x)%mod;
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// long n=Long.parseLong(br.readLine());


		String[] s=br.readLine().split(" ");

		n=Integer.parseInt(s[0]);m=Integer.parseInt(s[1]);
		int k=Integer.parseInt(s[2]);

		long dis=0;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				long left = j;

				left*=(left+1);
				left/=2;
				left*=n;

				dis+=(left)%mod;

				left = i;

				left*=(left+1);
				left/=2;
				left*=m;

				dis+=(left)%mod;

			}
		}
      	dis%=mod;

		fact=new long[n*m+10];
		fact[0]=1;

		for(int i=1;i<n*m+10;i++)
		{
			fact[i]=(i*fact[i-1])%mod;
		}

		long ans=fact[n*m-2];

		ans*=power(fact[k-2],mod-2);
		ans%=mod;

		ans*=power(fact[n*m-k],mod-2);
		ans%=mod;

		ans*=dis;
		ans%=mod;

		out.println(ans);

		out.close();

	}
}