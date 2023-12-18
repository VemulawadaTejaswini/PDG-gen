import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int m=nextInt();
		int a[]=new int[n+1];
		int p2=-1;
		boolean flag=true;
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt()/2;
			int c=0;
			for(int j=a[i];j%2==0;j=j/2)
				c++;
			if(p2==-1)
				p2=c;
			else if(p2!=c)
				flag=false;
		}
		if(!flag)
		{
			out.println(0);
			return;
		}
		long lcm=1;
		for(int i=1;i<=n;i++)
		{
			lcm=lcm(lcm,a[i]);
			if(lcm>m)
			{
				out.println(0);
				return;
			}
		}
		out.println((m/lcm+1)/2);
	}
	long lcm(long a,long b)
	{
		return a*b/gcd(a,b);
	}
	long gcd(long a,long b){
	    if(a==0)
	        return b;
	    return gcd(b%a,a);
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}