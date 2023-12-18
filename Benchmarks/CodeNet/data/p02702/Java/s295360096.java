import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=nextLine();
		int n=s.length();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=s.charAt(i-1)-'0';

		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++)
			dp[i]=(dp[i-1]*10+a[i])%2019;

		HashMap<Integer,Integer> map=new HashMap<>();
		int pow=1;
		long ans=0;
		for(int i=n;i>=1;i--)
		{
			int curr=(dp[i]*pow)%2019;
			int x=map.getOrDefault(curr,0);
			ans+=x;
			map.put(curr,x+1);
			pow=(pow*10)%2019;
		}
		ans+=map.getOrDefault(0,0);
		out.println(ans);
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