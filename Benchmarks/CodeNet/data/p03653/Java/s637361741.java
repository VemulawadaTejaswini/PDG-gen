import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int x = ni(), y = ni(), z = ni();
		int n = x+y+z;
		int[][] abc = new int[n][];
		int[] ss = new int[n];
		for(int i = 0;i < n;i++){
			abc[i] = na(3);
			for(int j = 0;j < 3;j++){
				ss[i] = Math.max(ss[i], abc[i][j]);
			}
		}
		List<Edge> es = new ArrayList<>();
		int src = n+3, sink = src + 1;
		for(int i = 0;i < n;i++){
			es.add(new Edge(src, i, 1, 0));
			for(int j = 0;j < 3;j++){
				es.add(new Edge(i, n+j, 1, ss[i]-abc[i][j]));
			}
		}
		es.add(new Edge(n, sink, x, 0));
		es.add(new Edge(n+1, sink, y, 0));
		es.add(new Edge(n+2, sink, z, 0));
		long F = solveMinCostFlowWithSPFA(compileWD(sink+1, es), src, sink, n);
		long ret = 0;
		for(int v : ss)ret += v;
		out.println(ret-F);
	}
	
	
	public static class Edge
	{
		public int from, to;
		public int capacity;
		public long cost;
		public int flow;
		public Edge complement;
		// public int iniflow;
		
		public Edge(int from, int to, int capacity, long cost) {
			this.from = from;
			this.to = to;
			this.capacity = capacity;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", capacity="
					+ capacity + ", cost=" + cost + "]";
		}
	}
	
	public static long addNegativeEdge(List<Edge> edges, Edge e, int src, int sink)
	{
		if(e.cost > 0){
			edges.add(e);
			return 0;
		}else{
			e.cost = -e.cost;
			edges.add(new Edge(src, e.to, e.capacity, 0));
			edges.add(new Edge(e.from, sink, e.capacity, 0));
					
			int d = e.from; e.from = e.to; e.to = d;
			edges.add(e);
			return (long)e.capacity * -e.cost;
		}
	}
	
	// TODO test
	public static long addMinCapacityConstraintEdge(List<Edge> edges, Edge e, int minCapacity, int src, int sink)
	{
		e.capacity -= minCapacity;
		edges.add(new Edge(src, e.to, minCapacity, 0));
		edges.add(new Edge(e.from, sink, minCapacity, 0));
		return (long)minCapacity * e.cost;
	}
	
	
	
	public static Edge[][] compileWD(int n, List<Edge> edges)
	{
		Edge[][] g = new Edge[n][];
		// cloning
		for(int i = edges.size()-1;i >= 0;i--){
			Edge origin = edges.get(i);
			Edge clone = new Edge(origin.to, origin.from, origin.capacity, -origin.cost);
			clone.flow = origin.capacity;
			clone.complement = origin;
			origin.complement = clone;
			edges.add(clone);
		}
		
		int[] p = new int[n];
		for(Edge e : edges)p[e.from]++;
		for(int i = 0;i < n;i++)g[i] = new Edge[p[i]];
		for(Edge e : edges)g[e.from][--p[e.from]] = e;
		return g;
	}
	
	public static class DQ {
		public int[] q;
		public int n;
		protected int pt, ph;
		
		public DQ(int n){ this.n = Integer.highestOneBit(n)<<1; q = new int[this.n]; pt = ph = 0; }
		
		public void addLast(int x){ q[ph] = x; ph = ph+1&n-1; }
		public void addFirst(int x){ pt = pt+n-1&n-1; q[pt] = x; }
		public int pollFirst(){ int ret = q[pt]; pt = pt+1&n-1; return ret; }
		public int pollLast(){ ph = ph+n-1&n-1; int ret = q[ph]; return ret; }
		public int getFirst(){ return q[pt]; }
		public int getFirst(int k){ return q[pt+k&n-1]; }
		public int getLast(){ return q[ph+n-1&n-1]; }
		public int getLast(int k){ return q[ph+n-k-1&n-1]; }
		public void clear(){ pt = ph = 0; }
		public int size(){ return ph-pt+n&n-1; }
		public boolean isEmpty(){ return ph==pt; }
	}

//	public static long solveMinCostFlow(Edge[][] g, int source, int sink, long all)
//	{
//		int n = g.length;
//		long mincost = 0;
//		long[] potential = new long[n];
//		
//		final long[] d = new long[n];
//		MinHeapL q = new MinHeapL(n);
//		while(all > 0){
//			// shortest path src->sink
//			Edge[] inedge = new Edge[n];
//			Arrays.fill(d, Integer.MAX_VALUE / 2);
//			d[source] = 0;
//			q.add(source, 0);
//			while(q.size() > 0){
//				int cur = q.argmin();
//				q.remove(cur);
//				for(Edge ne : g[cur]){
//					if(ne.capacity - ne.flow > 0){
//						long nd = d[cur] + ne.cost + potential[cur] - potential[ne.to];
//						if(d[ne.to] > nd){
//							inedge[ne.to] = ne;
//							d[ne.to] = nd;
//							q.update(ne.to, nd);
//						}
//					}
//				}
//			}
//			
//			if(inedge[sink] == null)break;
//			
//			long minflow = all;
//			long sumcost = 0;
//			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
//				if(e.capacity - e.flow < minflow)minflow = e.capacity - e.flow;
//				sumcost += e.cost;
//			}
//			mincost += minflow * sumcost;
//			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
//				e.flow += minflow;
//				e.complement.flow -= minflow;
//			}
//			
//			all -= minflow;
//			for(int i = 0;i < n;i++){
//				potential[i] += d[i];
//			}
//		}
//		return mincost;
//	}
	
	// negative is OK.
	public static long solveMinCostFlowWithSPFA(Edge[][] g, int source, int sink, long all)
	{
		int n = g.length;
		long mincost = 0;
		
		final long[] d = new long[n];
		DQ q = new DQ(n);
		boolean[] inq = new boolean[n];
		while(all > 0){
			// shortest path src->sink
			Edge[] inedge = new Edge[n];
			Arrays.fill(d, Long.MAX_VALUE / 2);
			d[source] = 0;
			q.addLast(source);
			while(!q.isEmpty()){
				int cur = q.pollFirst();
				inq[cur] = false;
				for(Edge ne : g[cur]){
					if(ne.capacity - ne.flow > 0){
						long nd = d[cur] + ne.cost;
						if(d[ne.to] > nd){
							inedge[ne.to] = ne;
							d[ne.to] = nd;
							if(!inq[ne.to]){
								q.addLast(ne.to);
								inq[ne.to] = true;
							}
						}
					}
				}
			}
			
			if(inedge[sink] == null)break;
			
			long minflow = all;
			long sumcost = 0;
			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
				if(e.capacity - e.flow < minflow)minflow = e.capacity - e.flow;
				sumcost += e.cost;
			}
			mincost += minflow * sumcost;
			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
				e.flow += minflow;
				e.complement.flow -= minflow;
			}
			
			all -= minflow;
		}
		return mincost;
	}
	
	
	// neagtive is OK, and simple but maybe slower.
	public static long solveMinCostFlowWithBellmanFord(Edge[][] g, int source, int sink, long all)
	{
		int n = g.length;
		long mincost = 0;
		
		final long[] d = new long[n];
		while(all > 0){
			// shortest path src->sink
			Edge[] inedge = new Edge[n];
			Arrays.fill(d, Long.MAX_VALUE / 2);
			d[source] = 0;
			
			int nease = 0;
			for(;;nease++){
				boolean changed = false;
				for(Edge[] row : g){
					for(Edge e : row){
						if(e.capacity - e.flow > 0){
							long nd = d[e.from] + e.cost;
							if(nd < d[e.to]){
								d[e.to] = nd;
								inedge[e.to] = e;
								changed = true;
							}
						}
					}
				}
				if(!changed)break;
				if(nease == n-1){
					// there are negative circuits.
					throw new RuntimeException();
				}
			}
			
			if(inedge[sink] == null)break;
			
			long minflow = all;
			long sumcost = 0;
			boolean fromSource = false;
			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
				if(e.capacity - e.flow < minflow)minflow = e.capacity - e.flow;
				sumcost += e.cost;
				if(e.from == source)fromSource = true;
			}
			if(!fromSource)break;
				
			mincost += minflow * sumcost;
			for(Edge e = inedge[sink];e != null;e = inedge[e.from]){
				e.flow += minflow;
				e.complement.flow -= minflow;
			}
			
			all -= minflow;
		}
		return mincost;
	}

	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
