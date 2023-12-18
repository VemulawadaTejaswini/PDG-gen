import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		long N = sc.nextLong();
		long[] list = new long[5];
		long min = Long.MAX_VALUE;
		for(int i = 0; i < 5; i++){
			list[i] = sc.nextLong();
			min = Math.min(min, list[i]);
		}
		
		System.out.println(((N-1) / min) + 5);
		
		
		/*
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		ArrayList<Long> AB = new ArrayList<Long>();
		for(int i = 0; i < X; i++) A[i] = sc.nextLong();
		for(int i = 0; i < Y; i++) B[i] = sc.nextLong();
		for(int i = 0; i < Z; i++) C[i] = sc.nextLong();
		
		for(int i = 0; i < X; i++){
			for(int j = 0; j < Y; j++){
				AB.add(A[i] + B[j]);
			}
		}
		Collections.sort(AB);
		Arrays.sort(C);
		
		System.out.println(AB.size());
		
		int indexC = Z-1;
		int indexAB = AB.size()-1;
		for(int i = 0; i < K; i++){
			long sum = C[indexC] + AB.get(indexAB);
			System.out.println(sum);
			if(indexC == 0) indexAB--;
			else if(indexAB == 0) indexC--;
			else if((C[indexC] - C[indexC-1]) > (AB.get(indexAB) - AB.get(indexAB-1))){
				indexAB--;
			}else indexC--;
		}
		*/
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

class UnionFind{
	int[] par;
	int[] rank;
	int[] size;
	//親ノードとの重さの差分
	int[] diffWeight;
	int group;
	
	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		size = new int[n];
		diffWeight = new int[n];
		group = n;
		for(int i = 0; i < n; i++){
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
			diffWeight[i] = 0;
		}
	}
	
	//経路圧縮しながらrootを求める
	int find(int x){
		if(par[x] == x){
			return x;
		}else{
			int f = find(par[x]);
			//累積和を計算する
			diffWeight[x] += diffWeight[par[x]];
			return par[x] = f;
		}
	}
	
	int weight(int x){
		find(x);
		return diffWeight[x];
	}
	
	//xのほうがrootに近ければ(ポテンシャルが低ければ)値は正になる
	int diff(int x, int y){
		return weight(y) - weight(x);
	}
	
	//ランクの小さいほうにつなげる
	boolean union(int x, int y, int w){
		w += weight(x);
		w -= weight(y);
		x = find(x);
		y = find(y);
		if(x == y) return false;
		
		if(rank[x] < rank[y]){
			int tmp = x; x = y; y = tmp;
			w = -w;
		}
		
		//y(のroot)をx(のroot)の下にくっつける
		//yのほうが重くなる(ポテンシャルが高くなる)
		if(rank[x] == rank[y]) rank[x]++;
		group--;
		par[y] = x;
		size[x] += size[y];
		diffWeight[y] = w;
		
		return true;
	}
	
	boolean union(int x, int y){
		return union(x, y, 0);
	}
	
	boolean isSame(int x, int y){
		return find(x) == find(y);
	}
}

class Edge implements Comparable<Edge>{
	int from;
	int to;
	int cost;
	public Edge(int f, int t, int c){
		from = f;
		to = t;
		cost = c;
	}
	@Override
	public int compareTo(Edge o) {
		if(this.cost == o.cost) return 0;
		else{
			return (this.cost < o.cost) ? -1 : 1;
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