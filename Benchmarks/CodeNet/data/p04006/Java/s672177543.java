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
	
	void solve() throws Exception{
		int N = sc.nextInt();
		long x = sc.nextLong();
		int[] aa = new int[2*N];
		for(int i = 0; i < N; i++){
			aa[i] = sc.nextInt();
			aa[i+N] = aa[i];
		}
		SegmentTree tree = new SegmentTree(aa);
		
		long min = Long.MAX_VALUE;
		for(int k = 0; k < N; k++){
			long cost = x * k;
			for(int i = 0; i < N; i++){
				cost += tree.getMin(i+N-k, i+N+1);
			}
			min = Math.min(min, cost);
		}
		System.out.println(min);
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
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

class SegmentTree{
	int n;
	int[] node;
	
	//元配列vをセグメント木で表現する
	public SegmentTree(int[] v){
		int sz = v.length;
		n = 1;
		while(n < sz) n *= 2;
		node = new int[2*n-1];
		
		for(int i = 0; i < sz; i++)
			node[i+n-1] = v[i];
		for(int i = n-2; i >= 0; i--)
			node[i] = Math.min(node[2*i+1], node[2*i+2]);
	}
	
	//x番目の要素をvalに更新
	public void updata(int x, int val){
		x = x + n - 1;
		node[x] = val;
		while(x > 0){
			x = (x - 1) / 2;
			node[x] = Math.min(node[2*x+1], node[2*x+2]);
		}
	}
	
	/*
	 * query
	 * 指定した開区間[a,b)の最小値を求めるクエリ
	 */
	public int getMin(int a, int b){
		return getMin(a, b, 0, 0, n);
	}
	
	/*
	 *要求区間 [a, b)中の要素の最小値を答える
	 *k := 自分がいるノードのインデックス
	 *対象区間は [l, r) にあたる
	 */
	public int getMin(int a, int b, int k, int l, int r){
		//要求区間と対象区間が交わらない -> 適当に返す
		if(r <= a || b <= l) return Integer.MAX_VALUE;
		
		//要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a <= l && r <= b) return node[k];
		
		/*
		 * 要求区間が対象区間の一部を被覆 -> 子について探索を行う
		 * 左側の子を vl ・ 右側の子を vr としている
		 * 新しい対象区間は、現在の対象区間を半分に割ったもの
		 */
		int vl = getMin(a, b, 2*k+1, l, (l+r)/2);
		int vr = getMin(a, b, 2*k+2, (l+r)/2, r);
		return Math.min(vl, vr);
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
