import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	/* solve */
	void solve(){
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Pair> edge = new ArrayList<>();
		for(int i = 0; i < M; i++){
			edge.add(new Pair(sc.nextInt()-1, sc.nextInt()-1));
		}
		
		ArrayList<Long> ans = new ArrayList<>();
		long sum = (long)N * (N - 1) / 2;
		UnionFind uf = new UnionFind(N);
		
		for(int i = M-1; i >= 0; i--){
			ans.add(sum);
			Pair p = edge.get(i);
			if(uf.same(p.A, p.B)) continue;
			long sizeA = uf.size[uf.find(p.A)];
			long sizeB = uf.size[uf.find(p.B)];
			sum += sizeA * (sizeA - 1) / 2 + sizeB * (sizeB - 1) / 2;
			uf.unite(p.A, p.B);
			long size = uf.size[uf.find(p.A)];
			sum -= size * (size - 1) / 2;
		}
		
		for(int i = ans.size()-1; i >= 0; i--) System.out.println(ans.get(i));
 	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws IOException {
		new Main().m();
	}
	
	void m() throws IOException {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		//out = new PrintWriter(System.out);
		solve();
		//out.flush();
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
	int group;
	
	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		size = new int[n];
		group = n;
		for(int i = 0; i < n; i++){
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
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
		if(rank[x] > rank[y]){
			par[x] = y;
			size[y] += size[x];
		}else{
			par[y] = x;
			size[x] += size[y];
			if(rank[x] == rank[y]){
				rank[x]++;
			}
		}
	}
	boolean same(int x, int y){
		return find(x) == find(y);
	}
}

class Pair{
	int A, B;
	public Pair(int a, int b){
		A = a; B = b;
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
