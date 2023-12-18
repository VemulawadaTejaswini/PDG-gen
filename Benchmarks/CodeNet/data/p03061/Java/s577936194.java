import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextLong();
		long lcm = lcm(A);
		SegmentTree seg = new SegmentTree(A, lcm);
		
		long max = 0;
		for(int i = 0; i < N; i++){
			if(i >= 1) seg.updata(i-1, A[i-1]);
			seg.updata(i, lcm);
			max = Math.max(max, seg.getGcd(0, N));
		}
		System.out.println(max);
	}
	
	long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	
	/*
	 * a,bの最小公倍数を求める
	 */
	long lcm(long a, long b){
		return a / gcd(a, b) * b; //オーバーフローに注意
	}
	
	/*
	 * 配列listの最大公約数を求める
	 */
	long gcd(long[] list){
		if(list.length == 0) return -1;
		if(list.length == 1) return list[0];
		
		long result = list[0];
		for(int i = 1; i < list.length; i++){
			result = gcd(list[i], result);
		}
		return result;
	}
	
	/*
	 *配列listの最小公倍数を求める
	 */
	long lcm(long[] list){
		if(list.length == 0) return -1;
		if(list.length == 1) return list[0];
		
		long result = list[0];
		for(int i = 1; i < list.length; i++){
			result = lcm(list[i], result);
		}
		return result;
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

class SegmentTree{
	int n;
	long[] node;
	long lcm;
	
	long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	
	//元配列vをセグメント木で表現する
	public SegmentTree(long[] v, long lcm){
		this.lcm = lcm;
		int sz = v.length;
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n-1];
		
		for(int i = 0; i < sz; i++)
			node[i+n-1] = v[i];
		for(int i = n-2; i >= 0; i--)
			node[i] = gcd(node[2*i+1], node[2*i+2]);
	}
	
	//0-indexed:xの要素をvalに更新
	public void updata(int x, long val){
		x = x + n - 1;
		node[x] = val;
		while(x > 0){
			x = (x - 1) / 2;
			node[x] = gcd(node[2*x+1], node[2*x+2]);
		}
	}
	
	/*
	 * query
	 * 指定した区間[a,b)の値を求めるクエリ
	 */
	public long getGcd(int a, int b){
		return getGcd(a, b, 0, 0, n);
	}
	
	/*
	 *要求区間 [a, b)中の要素の値を答える
	 *k := 自分がいるノードのインデックス
	 *対象区間は [l, r) にあたる
	 */
	public long getGcd(int a, int b, int k, int l, int r){
		//要求区間と対象区間が交わらない -> 単位元(演算しても、もう一方の値をそのまま返せるような値)を返す
		if(r <= a || b <= l) return this.lcm;
		
		//要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a <= l && r <= b) return node[k];
		
		/*
		 * 要求区間が対象区間の一部を被覆 -> 子について探索を行う
		 * 左側の子を vl ・ 右側の子を vr としている
		 * 新しい対象区間は、現在の対象区間を半分に割ったもの
		 */
		long vl = getGcd(a, b, 2*k+1, l, (l+r)/2);
		long vr = getGcd(a, b, 2*k+2, (l+r)/2, r);
		return gcd(vl, vr);
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