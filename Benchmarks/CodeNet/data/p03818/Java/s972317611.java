import java.io.*;
import java.util.*;
class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int maxn=(int)1e5+5;
	static Node[] tree;
	
	static Node merge(Node n1,Node n2)
	{
		if(n1.val>n2.val)
		{
			return new Node(n1.idx,n1.val);
		}
		return new Node(n2.idx,n2.val);
	}
	
	static void update(int node,int s,int e,int l,int r,int val)
	{
		if(s>e || l>e || r<s)
		{
			return;
		}
		if(s==e)
		{
			tree[node].val+=val;
		}
		else
		{
			int mid=(s+e)>>1;
			update(node<<1,s,mid,l,r,val);update(node<<1|1,mid+1,e,l,r,val);
			tree[node]=merge(tree[node<<1],tree[node<<1|1]);
		}
	}
	
	static Node query(int node,int s,int e,int l,int r)
	{
		if(s>e || l>e || r<s)
		{
			return new Node(-1,-1);
		}
		if(l<=s && r>=e)
		{
			return tree[node];
		}
		else
		{
			int mid=(s+e)>>1;
			Node n1=query(node<<1,s,mid,l,r),n2=query(node<<1|1,mid+1,e,l,r);
			return merge(n1,n2);
		}
	}
	
	static void build(int node,int s,int e)
	{
		if(s>e)	
		{
			return;
		}
		if(s==e)
		{
			tree[node]=new Node(s,0);
		}
		else
		{
			int mid=(s+e)>>1;
			build(node<<1,s,mid);build(node<<1|1,mid+1,e);
			tree[node]=merge(tree[node<<1],tree[node<<1|1]);
		}
	}
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();int[] a=new int[n];tree=new Node[4*maxn];build(1,0,maxn-1);
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();update(1,0,maxn-1,a[i],a[i],1);
		}
		boolean check=true;int res=0;
		while(check)
		{
			Node curr=query(1,0,maxn-1,0,maxn-1);
			if(curr.val<=1)
			{
				check=false;break;
			}
			else
			{
				Node curr2=merge(query(1,0,maxn-1,0,curr.idx-1),query(1,0,maxn-1,curr.idx+1,maxn-1));
				update(1,0,maxn-1,curr.idx,curr.idx,-1);
				update(1,0,maxn-1,curr2.idx,curr2.idx,-1);
			}
		}
		for(int i=0;i<maxn;i++)
		{
			res+=query(1,0,maxn-1,i,i).val;
		}
		out.println(res);out.close();
    }
}
class Node
{
	int idx,val;
	public Node(int idx,int val)
	{
		this.idx=idx;this.val=val;
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