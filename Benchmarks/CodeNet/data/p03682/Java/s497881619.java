import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		PriorityQueue<Edge> graph = new PriorityQueue<>((e1, e2)->e1.comp(e2));
		Pair[] points = new Pair[N];
		for(int i = 0; i < N; i++){
			points[i] = new Pair(i, sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(points, (p1, p2)->p1.x-p2.x);
		for(int i = 0; i < N-1; i++){
			int f = points[i].num;
			int t = points[i+1].num;
			long c = Math.abs(points[i+1].x - points[i].x);
			graph.add(new Edge(f, t, c));
		}
		
		Arrays.sort(points, (p1, p2)->p1.y-p2.y);
		for(int i = 0; i < N-1; i++){
			int f = points[i].num;
			int t = points[i+1].num;
			long c = Math.abs(points[i+1].y - points[i].y);
			graph.add(new Edge(f, t, c));
		}
		
		UnionFind union = new UnionFind(N);
		long ans = 0;
		for(Edge e : graph){
			if(!union.same(e.from, e.to)){
				union.unite(e.from, e.to);
				ans += e.cost;
			}
		}
		System.out.println(ans);
	}
}

class Pair{
	int num;
	int x;
	int y;
	public Pair(int n, int x, int y){
		this.num = n;
		this.x = x;
		this.y = y;
	}
}

class Edge{
	int from;
	int to;
	long cost;
	public Edge(int f, int t, long c){
		from = f;
		to = t;
		cost = c;
	}
	
	public int comp(Edge e){
		if(this.cost == e.cost) return 0;
		else if(this.cost > e.cost) return 1;
		else return -1;
	}
}

class UnionFind{
	int[] par;
	int[] rank;
	int group;
	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		group = n;
		for(int i = 0; i < n; i++){
			par[i] = i;
			rank[i] = 0;
		}
	}
	//経路圧縮しながらrootを求める
	int find(int x){
		if(par[x] == x) return x;
		return par[x] = find(par[x]);
	}
	void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y) return;
		group--;
		if(rank[x] > rank[y]) par[x] = y;
		else{
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	boolean same(int x, int y){
		return find(x) == find(y);
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
