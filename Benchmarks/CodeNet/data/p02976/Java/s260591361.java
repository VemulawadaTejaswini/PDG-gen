import java.io.*;
import java.util.*;
 
public class a {
	static class Graph
	{
		public PrintWriter out;
		public ArrayList adjacency[];
		public int count[];
		public int assigned[];
		public int n;
		public Graph(int nodes)
		{
			n=nodes;
			assigned = new int[n];
			count = new int[n];
			Arrays.fill(count,0);
			Arrays.fill(assigned,0);
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
			count[from]++;
			// even[from]=!(even[from]);
			// even[to]=!(even[to]);
			count[to]++;
		}
		// public void visit(LinkedList<Integer> q)
		// {
		// 	int node; int ct = 0; int nbr;
		// 	while(q.size()!=0)
		// 	{
		// 		node = q.pop();
		// 		ct = count[node];
		// 		if()
		// 		ArrayList<Integer> list = adjacency[node];
		// 		while(ct>0)
		// 		{
		// 			nbr = list.get(j);

		// 			ct--;
		// 		}
		// 	}
		// }
		public void bfs()
		{
			int visited[] = new int[n];
			// Arrays.fill(visited,0); 
			boolean skip;
			ArrayList<Integer> list; int nbr;
			for(int i=0;i<n;i++)
			{
				skip = false;
				if(assigned[i]%2==0)
				{
					if(count[i]%2!=0)
					{
						skip=true;
					}
				}
				else
				{
					if(count[i]%2==0)
					{
						skip=true;
					}
				}
				list = adjacency[i];
				for(int j=0;j<list.size();j++)
				{
					nbr=list.get(j);
					if(nbr<i)
						continue;
					if(skip)
					{
						out.println((nbr+1)+" "+(i+1));
						assigned[nbr]++;
						count[nbr]--;
						skip=false;
					}
					else
					{
						out.println((i+1)+" "+(nbr+1));
						count[nbr]--;
					}
					// count[i]--;
				}
			}
			// LinkedList<Integer> q = new LinkedList<Integer>();
			// visited[0]=1;
			// q.add(0);
			// visit(q);
		}
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int m = in.nextInt();
		Graph g = new Graph(n);
		g.out = out;
		for(int i=0;i<n;i++)
		{
			g.addEdge(in.nextInt()-1, in.nextInt()-1);
		}
		if(m%2!=0)
			out.println(-1);
		else
		{
			g.bfs();
		}
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