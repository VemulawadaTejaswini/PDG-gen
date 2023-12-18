import java.io.*;
import java.util.*;
import java.lang.*;
class Graph
{
	public ArrayList adjacency[];
	public Graph(int nodes)
	{
		adjacency = new ArrayList[nodes];
		for(int i=0;i<nodes;i++)
		{
			adjacency[i] = new ArrayList<Integer>();
		}
	}
	@Override
	public String toString()
	{
		String ret = "";
		for (ArrayList temp : adjacency) {
			ret+=(temp.toString()+"\n");
		}
		return ret;
	}
	public void addEdge(int from, int to)
	{
		adjacency[from].add(to);
		adjacency[to].add(from);
	}
}
	
public class Main {
	public static Graph g;
	public static int taka,aoki;
	public static int count[];
	public static void mark(int node, int pos)
	{
		count[node] = pos;
		ArrayList list = g.adjacency[node];
		int val;
		for(int i=0;i<list.size();i++)
		{
			val = (int)list.get(i);
			if(count[val]<0)
			{
				mark(val,pos+1);
			}
		}
	}
	public static int calc(int node, int pos)
	{
		if(count[node]==pos || count[node]+1==pos)
			return count[node];
		if(count[node]<pos)
			return Integer.MIN_VALUE;
		ArrayList list = g.adjacency[node];
		int val;
		int ans = 0;
		for(int i=0;i<list.size();i++)
		{
			val = (int)list.get(i);
			ans=Math.max(ans,calc(val,pos+1));
		}
		return ans;
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		taka = in.nextInt()-1;
		aoki = in.nextInt()-1;
		g = new Graph(n);
		int a,b;
		for(int i=0;i<n-1;i++)
		{
			a=in.nextInt()-1;
			b=in.nextInt()-1;
			g.addEdge(a,b);
			g.addEdge(b,a);
		}
		count = new int[n];
		Arrays.fill(count,-1);
		mark(aoki,0);
		// out.println("marked");
		// for(int i=0;i<n;i++)
		// {
		// 	out.print(i+" ");
		// 	out.println(count[i]);
		// }
		out.println(calc(taka,0));
        out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}