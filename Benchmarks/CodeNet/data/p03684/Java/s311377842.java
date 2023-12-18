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
	static int[] parent,rank1,rank2;
	
	static int getParent(int u)
	{
		if(u==parent[u])	
		{
			return u;
		}
		
		else
		{
			parent[u]=getParent(parent[u]);return parent[u];
		}
	}
	
	static void merge(int x,int y)
	{
		parent[y]=x;
	}
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();Pair[] a=new Pair[n],b=new Pair[n];parent=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt(),y=sc.nextInt();
			
			a[i]=new Pair(i,x,y);
			
			b[i]=new Pair(i,y,x);
			
			parent[i]=i;
		}
		
		Arrays.sort(a);Arrays.sort(b);rank1=new int[n];rank2=new int[n];
		
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		
		int[] to=new int[n],cost=new int[n];
		
		int[] left1=new int[n],left2=new int[n],right1=new int[n],right2=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int pos2=-1,now=Integer.MAX_VALUE;
			
			if(i>0)
			{
				if(a[i].x-a[i-1].x<now)
				{
					now=a[i].x-a[i-1].x;pos2=a[i-1].idx;
				}
			}
			
			if(i<n-1)
			{
				if(a[i+1].x-a[i].x<now)
				{
					now=a[i+1].x-a[i].x;pos2=a[i+1].idx;
				}
			}
			
			to[a[i].idx]=pos2;cost[a[i].idx]=now;
			
			rank1[a[i].idx]=i;
		}
		
		for(int i=0;i<n;i++)
		{
			int pos2=-1,now=Integer.MAX_VALUE;
			
			if(i>0)
			{
				if(b[i].x-b[i-1].x<now)
				{
					now=b[i].x-b[i-1].x;pos2=b[i-1].idx;
				}
			}
			
			if(i<n-1)
			{
				if(b[i+1].x-b[i].x<now)
				{
					now=b[i+1].x-b[i].x;pos2=b[i+1].idx;
				}
			}
			
			if(now<cost[b[i].idx])
			{
				cost[b[i].idx]=now;to[b[i].idx]=pos2;
			}
			
			rank2[b[i].idx]=i;
		}
		
		for(int i=0;i<n;i++)
		{
			pq.add(new Pair(i,cost[i],to[i]));
			
			if(rank1[i]==rank1[to[i]]+1)
			{
				left1[i]=1;
			}
			
			if(rank1[i]==rank1[to[i]]-1)
			{
				right1[i]=1;
			}
			
			if(rank2[i]==rank2[to[i]]+1)
			{
				left2[i]=1;
			}
			
			if(rank2[i]==rank2[to[i]]+1)
			{
				right2[i]=1;
			}
		}
		
		int ctr=n-1;long res=0;
		
		while(ctr>0)
		{
			Pair curr=pq.poll();
			
			int x=curr.idx,y=curr.y;
			
			int z1=getParent(x),z2=getParent(y);
			
			if(z1!=z2)
			{
				merge(z1,z2);ctr--;res+=curr.x;
			}
			
			if(rank1[x]-left1[x]-1>=0)
			{
				pq.add(new Pair(x,a[rank1[x]].x-a[rank1[x]-left1[x]-1].x,a[rank1[x]-left1[x]-1].idx));
				
				left1[x]++;
			}
			
			if(rank1[x]+right1[x]+1<n)
			{
				pq.add(new Pair(x,a[rank1[x]+right1[x]+1].x-a[rank1[x]].x,a[rank1[x]+right1[x]+1].idx));
				
				right1[x]++;
			}
			
			if(rank2[x]-left2[x]-1>=0)
			{
				pq.add(new Pair(x,b[rank2[x]].x-b[rank2[x]-left2[x]-1].x,b[rank2[x]-left2[x]-1].idx));
				left2[x]++;
			}
			
			if(rank2[x]+right2[x]+1<n)
			{
				pq.add(new Pair(x,b[rank2[x]+right2[x]+1].x-b[rank2[x]].x,b[rank2[x]+right2[x]+1].idx));
				
				right2[x]++;
			}
			
			if(rank1[y]-left1[y]-1>=0)
			{
				pq.add(new Pair(y,a[rank1[y]].x-a[rank1[y]-left1[y]-1].x,a[rank1[y]-left1[y]-1].idx));
				
				left1[y]++;
			}
			
			if(rank1[y]+right1[y]+1<n)
			{
				pq.add(new Pair(y,a[rank1[y]+right1[y]+1].x-a[rank1[y]].x,a[rank1[y]+right1[y]+1].idx));
				
				right1[y]++;
			}
			
			if(rank2[y]-left2[y]-1>=0)
			{
				pq.add(new Pair(y,b[rank2[y]].x-b[rank2[y]-left2[y]-1].x,b[rank2[y]-left2[y]-1].idx));
				
				left2[y]++;
			}
			
			if(rank2[y]+right2[y]+1<n)
			{
				pq.add(new Pair(y,b[rank2[y]+right2[y]+1].x-b[rank2[y]].x,b[rank2[y]+right2[y]+1].idx));
				
				right2[y]++;
			}
		}
		
		out.println(res);out.close();
    }
}

class Pair implements Comparable<Pair>
{
	int idx,x,y;
	
	public Pair(int idx,int x,int y)
	{
		this.idx=idx;this.x=x;this.y=y;
	}
	
	public int compareTo(Pair x)
	{
		return Integer.compare(this.x,x.x);
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