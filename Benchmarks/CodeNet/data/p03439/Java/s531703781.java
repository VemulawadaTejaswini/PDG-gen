import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int low=0,high=n-1;
		boolean lowmale=guess(low);
		while(high-low>1)
		{
			int mid=(low+high)/2;
			boolean midmale=guess(mid);
			if((mid-low)%2==0)
			{
				if(lowmale==midmale)
				{
					low=mid;
					lowmale=midmale;
				}
				else
					high=mid-1;
			}
			else
			{
				if(lowmale==midmale)
					high=mid-1;
				else
				{
					low=mid;
					lowmale=midmale;
				}
			}
		}
		guess(high);
		guess(low);
	}
	boolean guess(int x)throws IOException
	{
		System.out.println(x);
		String s=nextLine();
		if(s.equals("Vacant"))
			System.exit(0);
		else if(s.equals("Male"))
			return true;
		return false;
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