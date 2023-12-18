import java.util.*;
import java.io.*;
class Pair
{
	int x; 
	int y;
	Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
class Main
{
	int V;
	ArrayList<Integer> adj[];
	int[] in;
    Main(int V)
    {
        this.V = V;
        adj = new ArrayList[V];
        in = new int[V];
        for(int i = 0; i < V; i++)
        {
            adj[i] = new ArrayList<>();
        }
    }
    void addEdge(int p1, int p2)
    {
        adj[p1].add(p2);
        in[p2]++;
    }
    static int max;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int e = sc.nextInt();
	    Main g1 = new Main(n);
	    for(int i = 0; i < e; i++)
	    {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	g1.addEdge(a-1, b-1);
	    }
	    Pair[] p = new Pair[n];
	    for(int i = 0; i < n; i++)
	    {
	    	p[i] = new Pair(i, g1.in[i]);
	    }
	    Arrays.sort(p, new Comparator<Pair>()
	    {
	    	public int compare(Pair p1, Pair p2)
	    	{
	    		return p1.y-p2.y;
	    	}
	    });
	    int[] dp = new int[n];
	    int k = 0;
	    while(k < n)
	    {
	    	int v = p[k].x;
	    	Iterator<Integer> itr = g1.adj[v].iterator();
	    	while(itr.hasNext())
	    	{
	    		int temp = itr.next();
	    		dp[temp] = Math.max(dp[temp], dp[v]+1);
	    	}
	    	k++;
	    }
	    int max = 0;
	    for(int i = 0; i < n; i++)
	    {
	    	if(max < dp[i])
	    		max = dp[i];
	    }
	    System.out.println(max);
	}   
}