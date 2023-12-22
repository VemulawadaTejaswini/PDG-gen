import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main (String [] args) throws IOException

	{
		Scanner s=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);

		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
		long max=Long.MIN_VALUE;
		int x=Math.max(a,b);
		long y=Math.max(c,d);
		max=Math.max(max,x*y);

		x=Math.min(a,b);
		y=Math.min(c,d);
		max=Math.max(max,x*y);

		x=Math.min(a,b);
		y=Math.max(c,d);
		max=Math.max(max,x*y);


		x=Math.max(a,b);
		y=Math.min(c,d);
		max=Math.max(max,x*y);
		pw.println(max);


		pw.flush();

}


















	public static void shuffle(int[] a)
	{
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			int r = i + (int)(Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}

	/*

	 try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}

	 */



	static class Scanner
{
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

	public String next() throws IOException
	{
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {return Integer.parseInt(next());}

	public long nextLong() throws IOException {return Long.parseLong(next());}

	public String nextLine() throws IOException {return br.readLine();}

	public double nextDouble() throws IOException
	{
		String x = next();
		StringBuilder sb = new StringBuilder("0");
		double res = 0, f = 1;
		boolean dec = false, neg = false;
		int start = 0;
		if(x.charAt(0) == '-')
		{
			neg = true;
			start++;
		}
		for(int i = start; i < x.length(); i++)
			if(x.charAt(i) == '.')
			{
				res = Long.parseLong(sb.toString());
				sb = new StringBuilder("0");
				dec = true;
			}
			else
			{
				sb.append(x.charAt(i));
				if(dec)
					f *= 10;
			}
		res += Long.parseLong(sb.toString()) / f;
		return res * (neg?-1:1);
	}

	public boolean ready() throws IOException {return br.ready();}


}
}