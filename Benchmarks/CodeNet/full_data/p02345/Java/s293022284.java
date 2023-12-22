import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
    	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        AbstractSegmentTree t = new AbstractSegmentTree(n);
        
        for(int i=0;i<q;i++){
        	int c = sc.nextInt();
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	if(c==0){
        		t.update(x, new Monoid(y));
        	}
        	else{
        		out.println(t.sum(x, y+1).value);
        	}
        }
        
        out.flush();
    }

}

class AbstractSegmentTree {
	
	Monoid[] tree;
	
	//要素数で初期化
	public AbstractSegmentTree(int n){
		int num = 1;
		while(num<n){
			num = num*2;
		}
		tree = new Monoid[num*2-1];
		Arrays.fill(tree,identityElement);
	}
	
	//配列で初期化
	public AbstractSegmentTree(Monoid[] start){
		int num = 1;
		while(num<start.length){
			num = num*2;
		}
		tree = new Monoid[num*2-1];
		
		for(int i=0;i<start.length;i++){
			update(i,start[i]);
		}
	}
	
	//演算
	Monoid ope(Monoid x, Monoid y){
		return new Monoid(Math.min(x.value, y.value));
	}
	
	//単位元
	static Monoid identityElement = new Monoid(Integer.MAX_VALUE);
		
	//インデックス数
	int inum(){
		return (tree.length+1)/2;
	}
	
	//i番目の値をnに更新
	void update(int i, Monoid x){
		i = inum() + i - 1; //単体のa_iが格納されているindex
		tree[i] = x;
		while (i > 0) {
			i = (i - 1) / 2; //1つ上の区間和が格納されているindex
			tree[i] = ope(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}

	//O(logN)で[start,goal)の区間和
	Monoid sum(int start, int end) {
		return sum(start, end, 0, 0, inum());
	}

	//[a,b)の区間和, kは自分のいるセグ木のインデックス、対象範囲は[l,r)
	private Monoid sum(int a, int b, int k, int l, int r) {
		
		// 要求区間と対象区間が交わらない -> 適当に返す
		if(r <= a || b <= l){
			return identityElement;
		}
			
		// 要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a<=l && r<=b){
			return tree[k];
		}
		else{
			Monoid lv = sum(a, b, 2*k+1, l, (l+r)/2);
			Monoid rb = sum(a, b, 2*k+2, (l+r)/2, r);
			return ope(lv, rb);
		}
	}
	
}

//モノイド
class Monoid{
	long value;
	
	public Monoid(long value){
		this.value = value;
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
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
