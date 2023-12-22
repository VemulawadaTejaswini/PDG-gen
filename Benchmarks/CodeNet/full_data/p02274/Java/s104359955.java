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
        int[] a = sc.nextintArray(n);
        
        out.println(InversionNumber.invNum(a));
        
        out.flush();
    }

}

class InversionNumber {
	static long invNum(int[] a){
		int n = a.length;
        int[] oa = order(a);
        int[] tf = new int[n];
        BITforIN bit = new BITforIN(new int[n]);
        
        for(int j=0;j<n;j++){
        	tf[j] = bit.sum(oa[j]);
        	bit.add(oa[j],1);
        }
        
        long inv = 0;
        
        for(int j=0;j<n;j++){
        	inv += j-tf[j];
        }
        
        return inv;
	}
	
	static int[] order(int[] a){
		int[] b = new int[a.length];
		int[] sa = a.clone();
		Arrays.sort(sa);
		
		for(int i=0;i<a.length;i++){
			b[i] = Arrays.binarySearch(sa,a[i]);
		}
		
		return b;
	}
}

class BITforIN {
	int[] data;
	int[] tree;
	int N;
	
	//演算（結合法則の成立が必要）
	int ope(int x, int y){
		return x+y;
	}
	
	//単位元
	int identityElement(){
		return 0;
	}
	
	//初期化
	BITforIN(int[] data){
		this.data = data;
		this.N = data.length; 
		this.tree = new int[N + 1]; // index range is from 1 to N
		buildTree();
	}
	
	void buildTree(){
		for (int i = 0; i < N; i++) {
			add(i, data[i]);
		}
	}
	
	//indexの値を加算
	void add(int index, int value){
		for (int i = index+1; i <= N; i += i & -i) {
			tree[i] = ope(tree[i],value);
		}
	}
	
	//初項からindexまでの和
	int sum(int index){
		int sum = 0;
		for (int i = index+1; i > 0; i -= i & -i) {
			sum = ope(sum,tree[i]);
		}
		return sum;
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
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
