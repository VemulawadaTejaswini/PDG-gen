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
		int n=sc.nextInt(),m=sc.nextInt();
		
		boolean[] in=new boolean[n],ot=new boolean[n];
		
		int[] a=new int[m],b=new int[m];
		
		for(int i=0;i<m;i++)
		{
			int u=sc.nextInt()-1,v=sc.nextInt()-1;
			
			a[i]=Math.min(u,v);b[i]=Math.max(u,v);
			
			if(u==0)
			{
				in[v]=true;
			}
			
			if(v==n-1)
			{
				ot[u]=true;
			}
		}
		
		boolean ans=false;
		
		for(int i=0;i<n;i++)
		{
			if(in[i] && ot[i])
			{
				ans=true;
			}
		}
		
		out.println(ans?"POSSIBLE":"IMPOSSIBLE");out.close();
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