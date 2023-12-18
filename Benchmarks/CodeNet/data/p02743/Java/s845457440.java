import java.io.*;
import java.util.*;
import java.math.*;
public class Main
{
	
	private void solve()throws IOException
	{
		BigDecimal a=new BigDecimal(nextToken());
		BigDecimal b=new BigDecimal(nextToken());
		BigDecimal c=new BigDecimal(nextToken());
		MathContext mc=new MathContext(100);
		a=a.sqrt(mc);
		b=b.sqrt(mc);
		c=c.sqrt(mc);
		if(a.add(b).compareTo(c)<0)
			out.println("Yes");
		else
			out.println("No");
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