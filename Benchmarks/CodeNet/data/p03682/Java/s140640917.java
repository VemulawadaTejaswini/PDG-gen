import java.util.PriorityQueue;
import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}

	final long MOD = 1000000007;

	void run()
	{
		int n = sc.nextInt();
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		int[] xs = new int[n];
		int[] ys = new int[n];
		for(int i = 0; i < n; i++)
		{
			xs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
			for(int j=0; j<i; j++)
			{
				pq.add(new Edge(i, j, Math.min(Math.abs(xs[i]-xs[j]), Math.abs(ys[i]-ys[j]))));
			}
		}
		UnionFind uf = new UnionFind(n);
		long res = 0;
		for(int c=1;c<n;)
		{
			Edge e = pq.poll();
			if(!uf.same(e.v1, e.v2))
			{
				uf.unite(e.v1, e.v2);
				res += e.cost;
				c++;
			}
		}
		System.out.println(res);
	}
}

class UnionFind
{
	int[] root;

	public UnionFind(int n)
	{
		root = new int[n];
		for(int i = 0; i < n; i++)
			root[i] = i;
	}

	int root(int i)
	{
		if(root[i] != i) root[i] = root(root[i]);
		return root[i];
	}

	boolean same(int i, int j)
	{
		return root(i) == root(j);
	}

	void unite(int i, int j)
	{
		root[root(i)] = root(j);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder().append("{");
		for(int i=0; i<root.length; i++)
		{
			sb.append(i).append(":").append(root[i]).append(", ");
		}
		return sb.append("}").toString();
	}
}

class Edge implements Comparable<Edge>
{
	int v1, v2;
	long cost;

	public Edge(int p, int q, long c)
	{
		v1 = p;
		v2 = q;
		cost = c;
	}

	@Override
	public int compareTo(Edge o)
	{
		return Long.compare(cost, o.cost);
	}
	
	@Override
	public String toString()
	{
		return v1 + "--" + v2 + ": " + cost;
	}

}
