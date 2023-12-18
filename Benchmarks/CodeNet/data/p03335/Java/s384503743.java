import java.util.*;
import java.io.*;

public class Main{
	
	static int par[], dep[], id[], time = 0, top[], hvy[], sz[];
	static ArrayList<Integer> graph[]; 
	static SegmentTree seg1, seg2;
	
	public static class SegmentTree{
		Node seg[];
		public SegmentTree(int n) {
			seg = new Node[4*n+1]; build(1, n, 1);
		}
		
		public class Node{
			int l, r, val, lazy;
			public Node(int l, int r) {
				this.l = l; this.r = r; this.val = 1;
			}
		}
		
		void build(int l, int r, int idx) {
			seg[idx] = new Node(l, r); if(l == r) return;
			int mid = (l + r)/ 2; build(l, mid, 2*idx); build(mid+1, r, 2*idx+1);
			seg[idx].val = seg[2*idx+1].val + seg[2*idx].val;
		}
		
		int query(int l, int r, int idx) {
			if(seg[idx].l == l && seg[idx].r == r) return seg[idx].val;
			int mid = (seg[idx].l + seg[idx].r)/2; if(seg[idx].lazy == 1) pd(idx);
			if(r <= mid) return query(l, r, 2*idx); 
			else if(l > mid) return query(l, r, 2*idx+1);
			else {return query(l, mid, 2*idx) + query(mid+1, r, 2*idx+1);}
		}
		
		void upd(int l, int r, int idx) {
			if(seg[idx].l == l && seg[idx].r == r) {seg[idx].lazy = 1; seg[idx].val = 0; return;}
			int mid = (seg[idx].l + seg[idx].r)/2; if(seg[idx].lazy == 1) pd(idx);
			if(r<=mid) upd(l, r, 2*idx); else if(l > mid) upd(l, r, 2*idx+1);
			else {upd(l, mid, 2*idx); upd(mid+1, r, 2*idx+1);}
			seg[idx].val = seg[2*idx+1].val + seg[2*idx].val;
		}
		
		void pd(int idx) {
			seg[2*idx].val = seg[2*idx+1].val = 0;
			seg[2*idx].lazy = seg[2*idx+1].lazy = 1;
			seg[idx].lazy = 0;
		}
	}

	public static void main(String[] args) throws IOException {
		int N = readInt(), M = readInt(); graph = new ArrayList[N+1]; for(int i = 1; i<=N; i++) graph[i] = new ArrayList<Integer>();
		for(int i = 1; i<N; i++) {int a = readInt(), b = readInt(); graph[a].add(b); graph[b].add(a);}
		par = new int[N+1]; dep = new int[N+1]; hvy = new int[N+1]; sz = new int[N+1]; dfs(1);
		top = new int[N+1]; id = new int[N+1]; hld(1,1); seg1 = new SegmentTree(N+1); seg2 = new SegmentTree(N+1);
		int e1[] = new int[M], e2[] = new int[M]; int tot = 0; for(int q = 0; q<M; q++) {
			int u = readInt(), v = readInt(), lca = lca(u,v); //println(lca); flush();
			int w1 = query1(u, lca) + query2(lca, v), w2 = query2(u, lca) + query1(lca, v);
			if(w1 >= w2) {upd1(u, lca); upd2(lca, v); tot += w1; e1[q] = u; e2[q] = v;}
			else {upd2(u, lca); upd1(lca, v); tot += w2; e1[q] = v; e2[q] = u;}
		}
		println(tot); for(int i = 0; i<M; i++) println(e1[i] + " " + e2[i]);
		exit();
	}
	
	public static void dfs(int n) {
		sz[n] = 1; for(int e : graph[n]) if(e != par[n]) {
			par[e] = n; dep[e] = dep[n] + 1; dfs(e); sz[n] += sz[e];
			hvy[n] = sz[hvy[n]] < sz[e] ? e : hvy[n];
		}
	}
	
	public static void hld(int n, int t) {
		id[n] = ++time; top[n] = t; 
		if(hvy[n] != 0) hld(hvy[n], t);
		for(int e : graph[n]) if(e != hvy[n] && e != par[n]) hld(e, e);
	}
	
	public static int lca(int u, int v) {
		while(top[u] != top[v]) {
			if(dep[top[u]] < dep[top[v]]) {int temp = u; u = v; v = temp;}
			u = par[top[u]];
		}
		return dep[v] < dep[u] ? v : u;
	}
	
	public static int query1(int u, int v) {
		int sum = 0; while(top[u] != top[v]) {
			if(dep[top[u]] < dep[top[v]]) {int temp = u; u = v; v = temp;}
			sum += seg1.query(id[top[u]], id[u], 1); u = par[top[u]];
		}
		if(dep[u] < dep[v]) {int temp = u; u = v; v = temp;}
//		println(id[v] + " " + id[u]); flush();
		if(u != v) sum += seg1.query(id[v] + 1, id[u], 1); return sum;
	}

	public static int query2(int u, int v) {
		int sum = 0; while(top[u] != top[v]) {
			if(dep[top[u]] < dep[top[v]]) {int temp = u; u = v; v = temp;}
			sum += seg2.query(id[top[u]], id[u], 1); u = par[top[u]];
		}
		if(dep[u] < dep[v]) {int temp = u; u = v; v = temp;}
//		println(id[v] + " " + id[u]); flush();
		if(u != v) sum += seg2.query(id[v] + 1, id[u], 1); return sum;
	}
	
	public static void upd1(int u, int v) {
		while(top[u] != top[v]) {
			if(dep[top[u]] < dep[top[v]]) {int temp = u; u = v; v = temp;}
			seg1.upd(id[top[u]], id[u], 1); u = par[top[u]];
		}
		if(dep[u] < dep[v]) {int temp = u; u = v; v = temp;}
		if(u != v) seg1.upd(id[v] + 1, id[u], 1); 
	}
	
	public static void upd2(int u, int v) {
		while(top[u] != top[v]) {
			if(dep[top[u]] < dep[top[v]]) {int temp = u; u = v; v = temp;}
			seg2.upd(id[top[u]], id[u], 1); u = par[top[u]];
		}
		if(dep[u] < dep[v]) {int temp = u; u = v; v = temp;}
		if(u != v) seg2.upd(id[v] + 1, id[u], 1); 
	}
	
	final private static int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static String readLine() throws IOException {
		byte[] buf = new byte[64]; // line length
		int cnt = 0, c;
		while ((c = Read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	public static String read() throws IOException {
		byte[] ret = new byte[1024];
		int idx = 0;
		byte c = Read();
		while (c <= ' ') {
			c = Read();
		}
		do {
			ret[idx++] = c;
			c = Read();
		} while (c != -1 && c != ' ' && c != '\n' && c != '\r');
		return new String(ret, 0, idx);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}

	public static double readDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = Read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null)
			return;
		din.close();
	}

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		din.close();
		pr.close();
		System.exit(0);
	}
}
