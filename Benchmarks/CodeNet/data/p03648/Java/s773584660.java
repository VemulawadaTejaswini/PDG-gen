import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	
    public static void main(String args[]) throws Exception
    {
		long k=sc.nextLong();int n=50;long[] a=new long[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=i;
		}
		
		out.println(n);
		
		for(int i=0;i<n;i++)
		{
			long now=(k/n)+(i<(k%n)?1:0);
			
			a[i]+=(now*n);
			
			long left=k-now;
			
			a[i]-=left;
			
			out.print(a[i]+" ");
		}
		
		out.println("");out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
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