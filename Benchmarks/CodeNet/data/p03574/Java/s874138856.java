import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Main implements Runnable {
	public static final long MOD = 1000000007;
	private final FastScanner sc;
	private final PrintWriter out;
	private final int[] cx = {-1,0,1,1,1,0,-1,-1};
	private final int[] cy = {-1,-1,-1,0,1,1,1,0};
	int h,w;
	char[][] field;
	

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16L * 1024 * 1024).start();
	}

	Main() {
		sc = new FastScanner();
		out = new PrintWriter(System.out);
	}

	private void init() throws Exception {
		h = sc.nextInt();
		w = sc.nextInt();
		field = new char[h][w];
		StringBuilder sb;
		for(int i=0;i<h;i++){
			sb = new StringBuilder(sc.next());
			for(int j=0;j<w;j++){
				field[i][j] = sb.charAt(j);
			}
		}
	}

	private void solve() throws Exception{
		int cnt;
		for(int y=0;y<h;y++){
			for(int x=0;x<w;x++){
				if(field[y][x]!='#'){
					cnt = 0;
					for(int i=0;i<8;i++){
						try {
							if (field[y + cy[i]][x + cx[i]] == '#')
								cnt++;
						} catch (ArrayIndexOutOfBoundsException e) {}
					}
					field[y][x] = (char) ('0'+cnt);
				}
				out.printf("%c",field[y][x]);
			}
			out.println();
		}
	}

	/*
	 * private void exit(int status){ out.flush(); out.close();
	 * System.exit(status); } //
	 */
	public void run() {
		try {
			init();
			solve();
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.flush();
		out.close();
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
}
