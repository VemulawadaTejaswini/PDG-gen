import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	int n, Q, log, time = 0;
	ArrayList<Edge>[] adj, colorList;
	int[] depth, timeIn, timeOut, arr;
	int[][] lift, weight;
	
	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		n = fs.nextInt();
		Q = fs.nextInt();
		adj = new ArrayList[n];
		colorList = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			adj[i] = new ArrayList<>();
			colorList[i] = new ArrayList<>();
		}
		for(int i = 0; i < n-1; i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			int c = fs.nextInt()-1, we = fs.nextInt();
			adj[u].add(new Edge(u, v, c, we));
			adj[v].add(new Edge(v, u, c, we));
			colorList[c].add(new Edge(u, v, c, we));
		}
		
		Query[] qs = new Query[Q];
		for(int i = 0; i < Q; i++) {
			int x = fs.nextInt()-1, y = fs.nextInt();
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			qs[i] = new Query(i, x, y, u, v);
		}
		
		log = Integer.numberOfTrailingZeros(Integer.highestOneBit(n))+1;
		lift = new int[log][n];
		weight = new int[log][n];
		for(int[] a : lift) Arrays.fill(a, -1);
		depth = new int[n];
		dfs(0, -1);
		
		for(int lg = 1; lg < log; lg++) {
			for(int i = 0; i < n; i++) {
				int up = lift[lg-1][i];
				if(up == -1 || lift[lg-1][up] == -1) continue;
				lift[lg][i] = lift[lg-1][up];
				weight[lg][i] = weight[lg-1][i]+weight[lg-1][up];
			}
		}
		
		timeIn = new int[n];
		timeOut = new int[n];
		arr = new int[2*n];
		dfs2(0, -1);
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(timeIn));
//		System.out.println(Arrays.toString(timeOut));
//		System.out.println(Arrays.toString(depth));
		
		Arrays.sort(qs);
		BIT sum = new BIT(2*n);
		BIT cnt = new BIT(2*n);
		long[] res = new long[Q];
		for(int i = 0; i < Q; i++) {
			int ii = i;
			while(ii < Q && qs[ii].x == qs[i].x) ii++;
			int color = qs[i].x;
			for(Edge e : colorList[color]) {
				int who = e.u;
				if(depth[e.v] > depth[who]) who = e.v;
				sum.upd(timeIn[who]+1, e.we);
				sum.upd(timeOut[who]+1, -e.we);
				cnt.upd(timeIn[who]+1, 1);
				cnt.upd(timeOut[who]+1, -1);
			}
			for(int j = i; j < ii; j++) {
				Query now = qs[j];
				int[] temp = sumPath(now.u, now.v);
				long reg = temp[0];
				
				int sumOf = sum.sum(timeIn[now.u]+1);
				sumOf += sum.sum(timeIn[now.v]+1);
				sumOf -= 2*sum.sum(timeIn[temp[1]]+1);
				
				long cntOf = cnt.sum(timeIn[now.u]+1);
				cntOf += cnt.sum(timeIn[now.v]+1);
				cntOf -= 2*cnt.sum(timeIn[temp[1]]+1);
				
				reg -= sumOf;
				reg += cntOf*now.y;
				res[qs[j].id] = reg;
			}
			for(Edge e : colorList[color]) {
				int who = e.u;
				if(depth[e.v] > depth[who]) who = e.v;
				sum.upd(timeIn[who]+1, -e.we);
				sum.upd(timeOut[who]+1, e.we);
				cnt.upd(timeIn[who]+1, -1);
				cnt.upd(timeOut[who]+1, 1);
			}
			
			i = --ii;
		}
		
		for(long ll : res) out.println(ll);
		
		out.close();
	}
	
	void dfs2(int u, int p) {
		arr[time] = u;
		timeIn[u] = time++;
		for(Edge e : adj[u]) if(e.v != p) {
			dfs2(e.v, u);
		}
		arr[time] = u;
		timeOut[u] = time++;
	}
	
	int[] sumPath(int u, int v) {
		if(depth[u] < depth[v]) return sumPath(v, u);
		int dist = depth[u]-depth[v];
		
		int res = 0;
		while(dist > 0) {
			int bit = Integer.numberOfTrailingZeros(Integer.highestOneBit(dist));
			dist -= 1 << bit;
			res += weight[bit][u];
			u = lift[bit][u];
			
		}
		if(u == v) return new int[] {res, u};
		for(int lg = log-1; lg >= 0; lg--) {
			if(lift[lg][u] == lift[lg][v]) continue;
			res += weight[lg][u];
			res += weight[lg][v];
			u = lift[lg][u];
			v = lift[lg][v];
		}
		res += weight[0][u];
		res += weight[0][v];
		return new int[] {res, lift[0][u]};
	}
	
	void dfs(int u, int p) {
		for(Edge e : adj[u]) {
			if(e.v == p) continue;
			depth[e.v] = 1+depth[u];
			lift[0][e.v] = u;
			weight[0][e.v] = e.we;
			dfs(e.v, u);
		}
	}
	
	class Query implements Comparable<Query> {
		int id;
		int u, v;
		int x, y;
		Query(int a, int xx, int yy, int uu, int vv){
			id = a;
			x = xx; y = yy;
			u = uu; v = vv;
		}
		public int compareTo(Query q) {
			return Integer.compare(x, q.x);
		}
		public String toString() {
			return String.format("x=%d y=%d u=%d v=%d", x, y, u, v);
		}
	}
	
	class Edge {
		int u, v, we, col;
		Edge(int a, int b, int c, int w) {
			we = w;
			u = a; v = b;
			col = c;
		}
	}
	
	class BIT {
		int n, tree[];
		BIT(int a) {
			n = a;
			tree = new int[n+1];
		}
		int sum(int i) {
			int res = 0;
			while(i > 0) {
				res += tree[i];
				i -= i & -i;
			}
			return res;
		}
		void upd(int i, int v) {
			while(i <= n) {
				tree[i] += v;
				i += i & -i;
			}
		}
	}

	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}
		
	}

}