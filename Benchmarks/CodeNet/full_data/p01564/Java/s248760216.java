import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 1024L*1024*64).start();
	}
	public void run() {
		IO io = new IO();
		int n = io.nextInt();
		int q = io.nextInt();
		int[] w = io.nextIntArray(n);
		Graph g = new Graph(n);
		for(int i=0;i<n-1;i++) {
			g.addBidirectionalEdge(io.nextInt() - 1, io.nextInt() - 1);
		}
		HLDecomposition hl = g.rootedTree(0).hlDecomposition();
		int m = hl.pathnum;
		RangeSetMaximumSubArrayLong[] st = new RangeSetMaximumSubArrayLong[m];
		for(int i=0;i<m;i++) {
			st[i] = new RangeSetMaximumSubArrayLong(hl.pathSize[i]);
		}
		for(int i=0;i<n;i++) {
			st[hl.pathId[i]].setInitialValue(hl.pathIndex[i], w[i]);
		}
		for(int i=0;i<m;i++) {
			st[i].init();
		}
		for(int i=0;i<q;i++) {
//			System.out.println("----");
			int x = io.nextInt();
			int a = io.nextInt() - 1;
			int b = io.nextInt() - 1;
			int c = io.nextInt();
//			if (x == 2 && a == 88) {
//				System.out.println("!!!");
//			}
//			System.out.println(x + " " + a + " " + b + " " + c);
			if (x == 1) {
//				System.out.println("----");
				for(Query qq:hl.query(a, b)) {
//					System.out.println(qq);
//					System.out.println(st[qq.pathId]);
					st[qq.pathId].set(qq.first, qq.last + 1, c);
//					System.out.println(st[qq.pathId]);
				}
			}else{
				long qmax,qmaxl,qmaxr,qsum;
				ArrayList<Query> al = hl.query(a, b);
				Query qq = al.get(0);
				qmax  = st[qq.pathId].max (qq.first, qq.last + 1);
				qmaxl = qq.flip ? st[qq.pathId].maxr(qq.first, qq.last + 1) : st[qq.pathId].maxl(qq.first, qq.last + 1);
				qmaxr = qq.flip ? st[qq.pathId].maxl(qq.first, qq.last + 1) : st[qq.pathId].maxr(qq.first, qq.last + 1);
				qsum  = st[qq.pathId].sum (qq.first, qq.last + 1); //nouse
//				System.out.println(qmax + "," + qmaxl + "," + qmaxr + "," + qsum);
				long max = Math.max(qmax, qmaxl);
				long sum = qmaxr;
				for(int j=1;j<al.size();j++) {
					qq = al.get(j);
					qmax  = st[qq.pathId].max (qq.first, qq.last + 1);
					qmaxl = qq.flip ? st[qq.pathId].maxr(qq.first, qq.last + 1) : st[qq.pathId].maxl(qq.first, qq.last + 1);
					qmaxr = qq.flip ? st[qq.pathId].maxl(qq.first, qq.last + 1) : st[qq.pathId].maxr(qq.first, qq.last + 1);
					qsum  = st[qq.pathId].sum (qq.first, qq.last + 1);
//					System.out.println(qmax + "," + qmaxl + "," + qmaxr + "," + qsum);
					max = Math.max(max, qmax);
					max = Math.max(max, sum + qmaxl);
					sum = Math.max(qmaxr, sum + qsum);
					max = Math.max(max, sum);
				}
				io.println(max);
//				System.out.println(max);
			}
		}
		io.flush();
	}

}
class RangeSetMaximumSubArrayLong {
	private int size,n;
	private long[] sum;
	private long[] max;
	private long[] maxl;
	private long[] maxr;
	private boolean[] lazy;
	private long[] lazyValue;
	public RangeSetMaximumSubArrayLong(int size) {
		this.size = size;
		n = 1;
		while(n<this.size) {
			n*=2;
		}
		sum = new long[n*2-1];
		max = new long[n*2-1];
		maxl = new long[n*2-1];
		maxr = new long[n*2-1];
		Arrays.fill(max, Integer.MIN_VALUE);
		Arrays.fill(maxl, Integer.MIN_VALUE);
		Arrays.fill(maxr, Integer.MIN_VALUE);
		lazy = new boolean[n*2-1];
		lazyValue = new long[n*2-1];
	}

	public void setInitialValue(int i,long v) {
		sum[n-1+i] = v;
		max[n-1+i] = maxr[n-1+i] = maxl[n-1+i] = v;
	}

	public void init() {
		for(int k=n-2;k>=0;k--) {
			sum[k] = sum[k*2+1] + sum[k*2+2];
			max[k] = Math.max(Math.max(max[k*2+1],max[k*2+2]), maxr[k*2+1] + maxl[k*2+2]);
			maxl[k] = Math.max(maxl[k*2+1], sum[k*2+1] + maxl[k*2+2]);
			maxr[k] = Math.max(maxr[k*2+2], sum[k*2+2] + maxr[k*2+1]);
		}
	}

	private void propagate(int k) {
		if (lazy[k] && k < n - 1) {
			sum[k*2+1] = sum[k*2+2] = sum[k] / 2;
			long maxs = lazyValue[k] > 0 ? sum[k] / 2 : lazyValue[k];
			max[k*2+1] = max[k*2+2] = maxr[k*2+1] = maxr[k*2+2] = maxl[k*2+1] = maxl[k*2+2] = maxs;
			lazy[k*2+1] = lazy[k*2+2] = true;
			lazyValue[k*2+1] = lazyValue[k*2+2] = lazyValue[k];
		}
		lazy[k] = false;
	}

	public void set(int begin,int end,long x) {
		set(begin,end,x,0,0,n);
	}

	private void set(int begin,int end,long x,int k,int l,int r) {
		propagate(k);

		if (r <= begin || end <= l) {
			return;
		}
		if (begin <= l && r <= end) {
			sum[k] = x * (r - l);
			max[k] = maxl[k] = maxr[k] = x > 0 ? sum[k] : x;
			lazy[k] = true;
			lazyValue[k] = x;
			propagate(k);
			return;
		}

		set(begin,end,x,k*2+1,l,(l+r)>>>1);
		set(begin,end,x,k*2+2,(l+r)>>>1,r);
		sum[k] = sum[k*2+1] + sum[k*2+2];
		max[k] = Math.max(Math.max(max[k*2+1],max[k*2+2]), maxr[k*2+1] + maxl[k*2+2]);
		maxl[k] = Math.max(maxl[k*2+1], sum[k*2+1] + maxl[k*2+2]);
		maxr[k] = Math.max(maxr[k*2+2], sum[k*2+2] + maxr[k*2+1]);
	}

	public long max(int begin,int end) {
		return max(begin,end,0,0,n);
	}

	private long max(int begin,int end,int k,int l,int r) {
		propagate(k);

		if (r <= begin || end <= l) {
			return Integer.MIN_VALUE;
		}
		if (begin <= l && r <= end) {
			return max[k];
		}

		long maxx = Math.max(max(begin,end,k*2+1,l,(l+r)/2), max(begin,end,k*2+2,(l+r)/2,r));
		maxx = Math.max(maxx, maxr(begin,end,k*2+1,l,(l+r)>>>1) + maxl(begin,end,k*2+2,(l+r)>>>1,r));
		sum[k] = sum[k*2+1] + sum[k*2+2];
		max[k] = Math.max(Math.max(max[k*2+1],max[k*2+2]), maxr[k*2+1] + maxl[k*2+2]);
		maxl[k] = Math.max(maxl[k*2+1], sum[k*2+1] + maxl[k*2+2]);
		maxr[k] = Math.max(maxr[k*2+2], sum[k*2+2] + maxr[k*2+1]);
		return maxx;
	}

	//call max, then call sum/maxl/maxr
	public long sum(int begin,int end) {
		return sum(begin,end,0,0,n);
	}

	private long sum(int begin,int end,int k,int l,int r) {
		if (r <= begin || end <= l) {
			return 0;
		}
		if (begin <= l && r <= end) {
			return sum[k];
		}
		return sum(begin,end,k*2+1,l,(l+r)>>>1) + sum(begin,end,k*2+2,(l+r)>>>1,r);
	}

	public long maxl(int begin,int end) {
		return maxl(begin,end,0,0,n);
	}

	private long maxl(int begin,int end,int k,int l,int r) {
		if (r <= begin || end <= l) {
			return Integer.MIN_VALUE;
		}
		if (begin <= l && r <= end) {
			return maxl[k];
		}
		int c = (l+r)>>>1;
		return Math.max(maxl(begin,end,k*2+1,l,c), sum(begin,end,k*2+1,l,c) + maxl(begin,end,k*2+2,c,r));
	}

	public long maxr(int begin,int end) {
		return maxr(begin,end,0,0,n);
	}

	private long maxr(int begin,int end,int k,int l,int r) {
		if (r <= begin || end <= l) {
			return Integer.MIN_VALUE;
		}
		if (begin <= l && r <= end) {
			return maxr[k];
		}
		int c = (l+r)>>>1;
		return Math.max(maxr(begin,end,k*2+2,c,r), maxr(begin,end,k*2+1,l,c) + sum(begin,end,k*2+2,c,r));
	}

	//debug
	public String toString() {
		ArrayList<Long> data = new ArrayList<>();
		for(int i=0;i<size;i++) {
			data.add(max(i, i+1));
		}
		return data.toString();
	}
}

//be careful for stack overflow
class Graph {
	int n;
	ArrayList<Integer>[] edge;
	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		edge = new ArrayList[n];
		for(int i=0;i<n;i++) {
			edge[i] = new ArrayList<>();
		}
	}
	public void addBidirectionalEdge(int u,int v) {
		edge[u].add(v);
		edge[v].add(u);
	}
	public RootedTree rootedTree(int root) {
		return new RootedTree(this,root);
	}
}

class RootedTree {
	int n;
	int root;
	ArrayList<Integer>[] child;
	int[] parent;
	int[] in,out;
	int[] subTreeSize;
	@SuppressWarnings("unchecked")
	public RootedTree(Graph g,int root) {
		this.n = g.n;
		this.root = root;
		child = new ArrayList[n];
		for(int i=0;i<n;i++) {
			child[i] = new ArrayList<>();
		}
		parent = new int[n];
		in = new int[n];
		out = new int[n];
		subTreeSize = new int[n];
		k = 0;
		dfs(root,-1,g);
	}
	int k;
	private void dfs(int v,int p,Graph g) {
		in[v] = k++;
		parent[v] = p;
		subTreeSize[v] = 1;
		for(int u:g.edge[v]) {
			if (u == p) {
				continue;
			}
			child[v].add(u);
			dfs(u,v,g);
			subTreeSize[v] += subTreeSize[u];
		}
		out[v] = k++;
	}
	public boolean isAncestor(int parent,int child) {
		return in[parent] <= in[child] && out[child] <= out[parent];
	}
	public HLDecomposition hlDecomposition() {
		return new HLDecomposition(this);
	}
}
class HLDecomposition {
	RootedTree r;
	int[] pathId;
	int[] pathIndex;
	int[] pathRoot;
	int pathnum;
	int[] pathSize;
	public HLDecomposition(RootedTree r) {
		this.r = r;
		int n = r.n;
		pathId = new int[n];
		pathIndex = new int[n];
		pathRoot = new int[n];
		pathSize = new int[n];
		pathnum = 1;
		dfs(r.root,0,0,r.root);
//		System.out.println(Arrays.toString(pathId));
//		System.out.println(Arrays.toString(pathIndex));
//		System.out.println(Arrays.toString(pathRoot));
//		System.out.println(pathnum);
//		System.out.println(Arrays.toString(pathSize));
	}
	private void dfs(int v,int pid,int pindex,int proot) {
		pathId[v] = pid;
		pathIndex[v] = pindex;
		pathRoot[v] = proot;
		if (r.child[v].size() == 0) {
			pathSize[pid] = pindex + 1;
			return;
		}
		int maxsize = -1;
		int maxu = -1;
		for(int u:r.child[v]) {
			if (r.subTreeSize[u] > maxsize) {
				maxsize = r.subTreeSize[u];
				maxu = u;
			}
		}
		for(int u:r.child[v]) {
			if (u == maxu) {
				dfs(u,pid,pindex+1,proot);
			}else{
				dfs(u,pathnum++,0,u);
			}
		}
	}
	public ArrayList<Query> query(int first,int last) {
		ArrayList<Query> head = new ArrayList<>();
		ArrayList<Query> tail = new ArrayList<>();
		while(!r.isAncestor(pathRoot[first], last)) {
			head.add(new Query(pathId[first], pathIndex[first], 0));
			first = r.parent[pathRoot[first]];
		}
		while(!r.isAncestor(pathRoot[last], first)) {
			tail.add(new Query(pathId[last], 0, pathIndex[last]));
			last = r.parent[pathRoot[last]];
		}
		head.add(new Query(pathId[first],pathIndex[first],pathIndex[last]));
		for(int i=tail.size()-1;i>=0;i--) {
			head.add(tail.get(i));
		}
		return head;
	}
	public int lca(int u,int v) {
		while(!r.isAncestor(pathRoot[u], v)) {
			u = r.parent[pathRoot[u]];
		}
		while(!r.isAncestor(pathRoot[v], u)) {
			v = r.parent[pathRoot[v]];
		}
		return r.isAncestor(u, v) ? u : v;
	}
}
class Query {
	int pathId;
	int first,last;
	boolean flip;
	public Query(int pathId,int first,int last) {
		this.pathId = pathId;
		if (first < last) {
			this.first = first;
			this.last = last;
		}else{
			this.first = last;
			this.last = first;
			flip = true;
		}
	}
	public String toString() {
		return pathId + ":[" + first + "," + last + "]";
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}