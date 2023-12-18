import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static char[] a;
	
    public static void main(String args[]) throws Exception
    {
		a=sc.next().toCharArray();int n=a.length;
		if(a[0]==a[n-1] && n%2==0)
		{
			out.println("First");
		}
		else if(a[0]==a[n-1] && n%2!=0)
		{
			out.println("Second");
		}
		else if(a[0]!=a[n-1] && n%2==0)
		{
			out.println("Second");
		}
		else
		{
			out.println("First");
		}
		out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) 
	{
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}