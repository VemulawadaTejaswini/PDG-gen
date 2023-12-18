import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NoSuchElementException;

class Main implements Runnable {
	private final FastScanner sc;
	private final PrintWriter out;
	//private final long MOD = 1000000007;
	//private final int[] d8x = {-1,0,1,1,1,0,-1,-1};
	//private final int[] d8y = {-1,-1,-1,0,1,1,1,0};
	//private final int[] d4x = {0,1,0,-1};
	//private final int[] d4y = {-1,0,1,0};
	int n,m,q;
	int[] a,b,c,d;

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16L * 1024 * 1024).start();
	}

	Main() {
		sc = new FastScanner();
		out = new PrintWriter(System.out);
	}

	private void init() throws Exception {
		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();
		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];
		for(int i=0;i<q;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
	}

	private void solve() throws Exception{
		int max = 0;
		Deque<Data> stack = new ArrayDeque<Data>();
		for(int i=1;i<=m;i++){
			stack.push(new Data(new ExIntVector(10),i));
		}
		while(stack.size()>0){
			Data d = stack.pop();
			if(d.getA().size()<n){
				for(int i=d.getMax();i<=m;i++){
					stack.push(new Data(d.getA(),i));
				}
			} else {
				max = Math.max(max,score(d.getA().toArray()));
			}
		}
		out.println(max);
	}

	private int score(int[] A) {
		int score = 0;
		for(int i=0;i<q;i++){
			if(A[b[i]-1]-A[a[i]-1]==c[i]){
				score += d[i];
			}
		}
		return score;
	}

	public void run() {
		try {
			init();
			sc.close();
			solve();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		out.flush();
		out.close();
	}
}

class Data {
	private ExIntVector A;
	public Data(ExIntVector A,int x){
		this.A = new ExIntVector(10);
		for(int i=0;i<A.size();i++){
			this.A.add(A.get(i));
		}
		this.A.add(x);
	}
	public ExIntVector getA(){
		return A;
	}
	public int getMax(){
		return A.getLast();
	}
}

class ExIntVector {
	private int[] a;
	private int cnt;
	public ExIntVector(int max){
		a = new int[max];
		cnt = 0;
	}
	public int size(){
		return cnt;
	}
	public void add(int x){
		a[cnt++] = x;
	}
	public int get(int i){
		return a[i];
	}
	public int getLast(){
		return a[cnt-1];
	}
	public int[] toArray(){
		return a;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() {
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
			return true;
		}
	}

	private boolean hasNext() {
		while (read() && !isVisibleChar(buffer[ptr]))
			ptr++;
		return read();
	}

	private int getNextChar() {
		if (read()) {
			ptr++;
			return buffer[ptr - 1];
		} else {
			return -1;
		}
	}

	private static boolean isVisibleChar(int code) {
		return code >= 33 && code <= 126;
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = getNextChar();
		while (isVisibleChar(b)) {
			sb.appendCodePoint(b);
			b = getNextChar();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean sign = true;
		int b = getNextChar();
		if (b == '-') {
			sign = false;
			b = getNextChar();
		}
		if (b < '0' || b > '9') {
			throw new NumberFormatException();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isVisibleChar(b)) {
				return sign ? n : -n;
			} else {
				throw new NumberFormatException();
			}
			b = getNextChar();
		}
	}

	public int nextInt() {
		long n = nextLong();
		if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) n;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		int b = getNextChar();
		while (!isVisibleChar(b)) {
			b = getNextChar();
		}
		return (char) b;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class IntQueue {
	protected int[] a;
	protected int head, tail;

	public IntQueue(int max) {
		a = new int[max];
	}

	public void offer(int x) {
		a[tail++] = x;
	}

	public int poll() {
		return a[head++];
	}

	public int peek() {
		return a[head];
	}
	
	public int size() {
		return tail - head;
	}
}
