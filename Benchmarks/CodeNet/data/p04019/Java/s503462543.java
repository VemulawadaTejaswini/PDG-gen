import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=nextLine();
		int cnt[]=new int[128];
		for(int i=0;i<s.length();i++)
			cnt[s.charAt(i)]++;
		if(cnt['N']*cnt['S']==0 && cnt['N']+cnt['S']>0 || cnt['E']*cnt['W']==0 && cnt['E']+cnt['W']>0)
			out.println("No");
		else
			out.println("Yes");
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