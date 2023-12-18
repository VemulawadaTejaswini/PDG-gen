import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

class Main implements Runnable {
	private final FastScanner sc;
	private final PrintWriter out;
	//private final long MOD = 1000000007;
	//private final int[] d8x = {-1,0,1,1,1,0,-1,-1};
	//private final int[] d8y = {-1,-1,-1,0,1,1,1,0};
	//private final int[] d4x = {0,1,0,-1};
	//private final int[] d4y = {-1,0,1,0};
	int n;
	int[][] A;

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16L * 1024 * 1024).start();
	}

	Main() {
		sc = new FastScanner();
		out = new PrintWriter(System.out);
	}

	private void init() throws Exception {
		n = sc.nextInt();
		A = new int[2][n];
		for(int i=0;i<2;i++){
			for(int j=0;j<n;j++){
				A[i][j] = sc.nextInt();
			}
		}
	}

	private void solve() throws Exception{
		int max = -1;
		Queue<Data> q = new ArrayDeque<Data>();
		q.offer(new Data(0,0,A[0][0]));
		while(q.size()>0){
			Data d = q.poll();
			if(d.getTate()+1<2) q.offer(new Data(d.getTate()+1,d.getYoko(),d.getAme()+A[d.getTate()+1][d.getYoko()]));
			if(d.getYoko()+1<n) q.offer(new Data(d.getTate(),d.getYoko()+1,d.getAme()+A[d.getTate()][d.getYoko()+1]));
			max = Math.max(max, d.getAme());
		}
		out.println(max);
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
	private int tate;
	private int yoko;
	private int ame;
	public Data(int tate,int yoko,int ame){
		this.tate = tate;
		this.yoko = yoko;
		this.ame = ame;
	}
	public int getTate(){
		return tate;
	}
	public int getYoko(){
		return yoko;
	}
	public int getAme(){
		return ame;
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
