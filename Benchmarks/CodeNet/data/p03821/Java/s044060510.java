import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();long[] a=new long[n],b=new long[n];long res=0,sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();b[i]=sc.nextLong();
		}
		for(int i=n-1;i>=0;i--)
		{
			a[i]+=sum;
			if(a[i]%b[i]==0)
			{
				continue;
			}
			long now=b[i]-(a[i]%b[i]);
			sum+=now;
		}
		out.println(sum);out.close();
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