import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int m=nextInt();
		int k=nextInt();
		int bigmask=(1<<m)-1;
		if(k>bigmask)
			out.println(-1);
		else if(m==0)
			out.println("0 0");
		else if(m==1 && k==0)
			out.println("0 0 1 1");
		else if(m==1 && k==1)
			out.println(-1);
		else
		{
			//xor[0..bigmask]=0 because bigmask%4=0
			for(int i=0;i<=bigmask;i++)
				if(i!=k)
					out.print(i+" ");
			out.print(k+" ");
			for(int i=bigmask;i>=0;i--)
				if(i!=k)
					out.print(i+" ");
			out.println(k);
		}
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