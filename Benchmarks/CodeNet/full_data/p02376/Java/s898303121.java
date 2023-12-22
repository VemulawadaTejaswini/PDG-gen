import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int V = sc.nextInt(), E = sc.nextInt();
		Dinic dinic = new Dinic(V);
		for(int i = 0; i < E; i++) dinic.addEdge(sc.nextInt(), sc.nextInt(), sc.nextLong());
		System.out.println(dinic.maxFlow(0, V-1));
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class Dinic{
	class Edge{
		int to;
		long cap;
		int rev;
		boolean isRev;
		public Edge(int t, long c, int r, boolean i){
			to = t; cap = c; rev = r; isRev = i;
		}
	}
	
	int V;
	ArrayList<ArrayList<Edge>> graph;
	int[] minCost, iter;
	
	public Dinic(int V){
		this.V = V;
		graph = new ArrayList<>();
		for(int i = 0; i < V; i++) graph.add(new ArrayList<>());
		minCost = new int[V];
		iter = new int[V];
	}
	
	void addEdge(int from, int to, long cap){
		graph.get(from).add(new Edge(to, cap, graph.get(to).size(), false));
		graph.get(to).add(new Edge(from, 0, graph.get(from).size()-1, true));
	}
	
	boolean bfs(int s, int t){
		Arrays.fill(minCost, -1);
		Deque<Integer> queue = new ArrayDeque<Integer>();
		minCost[s] = 0;
		queue.addLast(s);
		while(!queue.isEmpty() && minCost[t] == -1){
			int p = queue.getFirst();
			queue.pop();
			for(Edge e : graph.get(p)){
				if(e.cap > 0 && minCost[e.to] == -1){
					minCost[e.to] = minCost[p] + 1;
					queue.push(e.to);
				}
			}
		}
		
		return minCost[t] != -1;
	}
	
	long dfs(int index, int t, long flow){
		if(index == t) return flow;
		for(int i = iter[index]; i < graph.get(index).size(); i++){
			Edge e = graph.get(index).get(i);
			if(e.cap > 0 && minCost[index] < minCost[e.to]){
				long d = dfs(e.to, t, Math.min(flow, e.cap));
				if(d > 0){
					e.cap -= d;
					graph.get(e.to).get(e.rev).cap += d;
					return d;
				}
			}
		}
		return 0;
	}
	
	long maxFlow(int s, int t){
		long flow = 0;
		while(bfs(s, t)){
			Arrays.fill(iter, 0);
			long f = 0;
			while((f = dfs(s, t, Long.MAX_VALUE / 2)) > 0) flow += f;
		}
		return flow;
	}
	
	void output(){
		for(int i = 0; i < graph.size(); i++){
			for(Edge e : graph.get(i)){
				if(e.isRev) continue;
				Edge revEdge = graph.get(e.to).get(e.rev);
				System.out.println(i + " -> " + e.to + " (flow: " + revEdge.cap + " / " + (e.cap + revEdge.cap) + ")");
			}
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
