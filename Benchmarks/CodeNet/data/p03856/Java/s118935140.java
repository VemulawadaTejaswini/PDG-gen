import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int[] dp;
	static String[] arr=new String[]{"dreamer","dream","eraser","erase"};
	static String a="";
	static int n;
	
	static boolean match(int idx1,int idx2)
	{
		if(idx2+arr[idx1].length()>n)
			return false;
		return (a.substring(idx2,idx2+arr[idx1].length())).equals(arr[idx1]);
	}
	
	static int solve(int idx)
	{
		if(idx>=n)
		{
			return 1;
		}
		if(dp[idx]!=-1)
		{
			return dp[idx];
		}
		else
		{
			int val=0;
			for(int i=0;i<arr.length;i++)
			{
				if(match(i,idx))
				{
					val=val|solve(idx+arr[i].length());
				}
			}
			dp[idx]=val;return dp[idx];
		}
	}
	
    public static void main(String args[]) throws Exception
    {
		a=new String(sc.next());n=a.length();dp=new int[n];Arrays.fill(dp,-1);
		out.println(solve(0)==1?"YES":"NO");out.close();
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