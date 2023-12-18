import java.io.*;
import java.util.*;
public class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static int[] parent,depth,size;
	
	static int getParent(int u)
	{
		if(u==parent[u])	
			return u;
		int val=getParent(parent[u]);parent[u]=val;return parent[u];
	}
	
	static void merge(int u,int v)
	{
		if(depth[u]>depth[v])
		{
			size[u]+=size[v];parent[v]=u;
		}
		else if(depth[v]>depth[u])
		{
			size[v]+=size[u];parent[u]=v;
		}
		else
		{
			depth[u]++;size[u]+=size[v];parent[v]=u;
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		int n=sc.nextInt();Pair[] a=new Pair[n];TreeSet<Integer> ts=new TreeSet<Integer>();parent=new int[n];depth=new int[n];size=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new Pair(i,sc.nextLong());parent[i]=i;depth[i]=1;size[i]=1;
		}
		Arrays.sort(a);long res=0;
		for(int i=n-1;i>=0;i--)
		{
			long l=1,r=1;Integer val1=ts.lower(a[i].idx),val2=ts.higher(a[i].idx);
			if(val1!=null && val1==a[i].idx-1)
			{
				int x=getParent(a[i].idx-1);l+=size[x];merge(x,a[i].idx);
			}
			if(val2!=null && val2==a[i].idx+1)
			{
				int x=getParent(a[i].idx+1);r+=size[x];merge(x,getParent(a[i].idx));
			}
			res=res+(a[i].val*l*r);ts.add(a[i].idx);
		}
		out.println(res);out.close();
	}
}
class Pair implements Comparable<Pair>
{
	int idx;long val;
	public Pair(int idx,long val)
	{
		this.idx=idx;this.val=val;
	}
	public int compareTo(Pair x)
	{
		return Long.compare(this.val,x.val);
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