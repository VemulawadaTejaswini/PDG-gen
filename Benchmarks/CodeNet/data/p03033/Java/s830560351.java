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
	//final int INF = Integer.MAX_VALUE / 2;
	final long INF = Long.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = sc.nextInt();
		int Q = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		
		int[] S = new int[N], T = new int[N], X = new int[N];
		for(int i = 0; i < N; i++){
			S[i] = sc.nextInt(); T[i] = sc.nextInt()-1;
			X[i] = sc.nextInt();
			set.add(S[i]-X[i]); set.add(T[i]-X[i]);
		}
		
		int[] D = new int[Q];
		for(int i = 0; i < Q; i++){
			D[i] = sc.nextInt();
			set.add(D[i]);
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; !set.isEmpty(); i++) map.put(set.pollFirst(), i);
		
		DualSegmentTree seg = new DualSegmentTree(map.size());
		for(int i = 0; i < N; i++) seg.setSegment(map.get(S[i] - X[i]), map.get(T[i] - X[i]) + 1, X[i]);
		
		/*
		for(int i = 0; i < Q; i++){
			long x = seg.getPoint(map.get(D[i]));
			if(x != Long.MAX_VALUE) System.out.println(x);
			else System.out.println(-1);
		}
		*/
		
		long[] get = seg.get();
		for(int i = 0; i < Q; i++){
			long x = get[map.get(D[i])];
			if(x != Long.MAX_VALUE) System.out.println(x);
			else System.out.println(-1);
		}
		
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
			System.out.printf("%8d ms\n", (G-S));
		}
	}
	
	/* end main */
}
/* end Main */

class DualSegmentTree{
	int sz;
	int n;
	long[] node;
	
	/*作用素で使える単位元*/
	private long e = Long.MAX_VALUE;
	
	/*結合律が成り立ち、更新が可換であるような、各要素への作用素*/
	private long f(long nodeVal, long val){
		return Math.min(nodeVal, val);
	}
	
	/* 単位元で初期化 */
	public DualSegmentTree(int sz){
		this.sz = sz;
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n];
		Arrays.fill(node, e);
	}
	
	/* 元配列vでセグメント木を初期化 */
	public DualSegmentTree(long[] v){
		this(v.length);
		for(int i = 0; i < v.length; i++){
			node[i+n] = v[i];
		}
	}
	
	/* 0-indexed:xの要素を取得する */
	public long getPoint(int x){
		x += n;
		long res = node[x];
		while(x > 1){
			x = x / 2;
			res = f(res, node[x]);
		}
		return res;
	}
	
	/* 指定した区間[L,R)に含まれるすべての要素に作用素を適用するクエリ */
	public void setSegment(int L, int R, long val){
		L += n;
		R += n;
		while (L < R) {
			if ((L & 1) != 0){
				node[L] = f(node[L], val);
				L++;
			}
			if ((R & 1) != 0){
				--R;
				node[R] = f(node[R], val);
			}
			L >>= 1;
			R >>= 1;
		}
	}
	
	public long[] get(){
		long[] tmp = new long[2*n];
		tmp[1] = e;
		for(int i = 1; i < n; i++){
			tmp[2*i] = f(tmp[i], node[2*i]);
			tmp[2*i+1] = f(tmp[i], node[2*i+1]);
		}
		long[] res = new long[sz];
		for(int i = 0; i < sz; i++) res[i] = tmp[i+n];
		return res;
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