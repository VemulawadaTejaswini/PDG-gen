import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

class Scanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner();
	    int n = sc.nextInt();
	    Digraph g = new Digraph(n);
	    List<Integer[]> edges = new LinkedList<>();

	    for (int i = 0; i < n - 1; ++i) {
	    	int a = sc.nextInt() - 1;
	    	int b = sc.nextInt() - 1;
	    	g.addEdge(a, b);
	    	g.addEdge(b, a);
	    	edges.add(new Integer[] {a, b});
	    }

		Queue<Integer> q = new LinkedList<Integer>();
		int[] parentColor = new int[n];
		Arrays.fill(parentColor, 0);
		q.add(0);
		parentColor[0] = -1;
		int mx = 0;
		while (!q.isEmpty())
		{
			int v = q.poll();
			int color = 1;
			for (int node : g.adj(v)) {
				if (parentColor[node] == 0) {
					if (color == parentColor[v]) color += 1;
					g.setColor(v, node, color);
					parentColor[node] = color;
					mx = Math.max(mx, color);
					color += 1;
					q.add(node);
				}
			}
		}

		System.out.println(mx);
		for (Integer[] edge : edges) {
			System.out.println(g.color(edge[0], edge[1]));
		}

	}


	public static class Digraph {
		private int V;
		private HashSet<Integer>[] adj;
	    public Map<Long, Integer> edgeColor;

		public Digraph(int V)
		{
			this.V = V;
			initializeAdj(V);
			edgeColor = new HashMap<>();
		}

		private long toKey(int a, int b) {
			return (long)V * (long)Math.max(a, b) + (long)Math.min(a, b);
		}

		public void setColor(int a, int b, int color) {
			edgeColor.put(toKey(a, b), color);
		}

		public int color(int a, int b) {
			long key = toKey(a, b);
			if (edgeColor.containsKey(key)) {
				return edgeColor.get(key);
			} else {
				return 0;
			}
		}

		void initializeAdj(int V) {
			this.adj = new HashSet[V];
			for (int v = 0; v < V; ++v)
				adj[v] = new HashSet<Integer>();
		}

		void addEdge(int v, int w)
		{
			adj[v].add(w);
		}

		public HashSet<Integer> adj(int v)
		{
			return this.adj[v];
		}

		public int V()
		{
			return this.V;
		}

		public int E()
		{
			return Arrays.stream(adj)
				.mapToInt(e -> e.size())
				.sum();
		}

		public Digraph reverse()
		{
			Digraph g = new Digraph(this.V());
			for (int v = 0; v < this.V(); ++v)
			{
				for (int w : this.adj(v))
				{
					g.addEdge(w, v);
				}
			}
			return g;
		}
		void show()
		{
			for (int v = 0; v < this.V; ++v)
				for (int w : this.adj(v))
					System.out.println(v + "-" + w);
		}
	}
}
