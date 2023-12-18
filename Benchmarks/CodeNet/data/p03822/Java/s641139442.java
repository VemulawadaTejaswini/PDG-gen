import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static ArrayList<Integer>[] al;
	static int[] level,deg;
	
	static void dfs(int u,int p,int curr)
	{
		level[u]=curr;
		for(int x:al[u])	
		{
			if(x!=p)
			{
				deg[u]++;dfs(x,u,curr+1);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();al=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			al[i]=new ArrayList<Integer>();
		}
		level=new int[n];deg=new int[n];
		for(int i=1;i<n;i++)
		{
			int u=sc.nextInt()-1,v=i;
			al[u].add(v);al[v].add(u);
		}
		dfs(0,-1,1);int ans=0;
		for(int i=0;i<n;i++)
		{
			ans=Math.max(ans,level[i]-1+deg[i]);
		}
		out.println(ans);out.close();
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