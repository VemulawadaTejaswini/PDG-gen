import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

class UnionFind {
	int[] data;
	UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	boolean unionSet(int x, int y) {
		x = root(x); 
		y = root(y);
		if (x != y) {
			if (data[y] < data[x]) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			data[x] += data[y]; 
			data[y] = x;
		}
		return x != y;
	}
	boolean findSet(int x, int y) {
		return root(x) == root(y);
	}
	int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	int size(int x) {
		return -data[root(x)];
	}
}

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,-1,0,1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static char[] check;
	static int idx;
	
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			if(n == 0 && m == 0 && k == 0) break;
			Edge[] edge = new Edge[m];
			for(int i = 0; i < m; i++) {
				int u = sc.nextInt()-1;
				int v = sc.nextInt()-1;
				int w = sc.nextInt();
				int t = sc.next().charAt(0) == 'A'?1:0;
				edge[i] = new Edge(w,u,v,t);
			}
			int l = -10000;
			int r = 10000;
			int MAX = INF;
			while(l <= r) {
				int c = (l + r) / 2;
				PriorityQueue<Edge> edges = new PriorityQueue<Edge>();
				for(int i = 0; i < m; i++) {
					edges.add(new Edge(edge[i].weight + edge[i].type * c,edge[i].from,edge[i].to,edge[i].type));
				}
				UnionFind uf = new UnionFind(n);
				int cost = 0;
		        int A = 0;
				int sum = 1;
		        while (!edges.isEmpty()) {
		            Edge e = edges.poll();
		            if(A == k && e.type == 1) continue;
		            if (!uf.findSet(e.from, e.to)) {
		            	sum++;
		                cost += e.weight - e.type * c;
		                A += e.type;
		                uf.unionSet(e.from, e.to);
		            }
		        }
		        if(A == k && sum == n) {
		        	MAX = Math.min(MAX, cost);
		        	l++;
		        }
		        else if(A < k) {
		        	r = c-1;
		        }
		        else {
		        	l = c+1;
		        }
			}
			if(MAX == INF) MAX = -1;
			System.out.println(MAX);
		}
		
		
		
		
	}
	static class Edge implements Comparable<Edge>{
		int weight;
		int from;
		int to;
		int type;
		Edge(int a, int b, int c,int d) {
			weight = a;
			from = b;
			to = c;
			type = d;
		}
		@Override
		public int compareTo(Edge o) {
			if(o.weight == this.weight) return o.type - this.type;
			return this.weight - o.weight;
		}
		
	}
	
	

}




class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}