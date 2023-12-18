import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		long ans=0;
		for(int i=1;i<=n;i++)
		{
			int a=nextInt();
			ans+=map.getOrDefault(a-i,0);
			map.put(-i-a,map.getOrDefault(-i-a,0)+1);
		}
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