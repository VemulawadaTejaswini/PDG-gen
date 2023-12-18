import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

class Main implements Runnable {
	private final FastScanner sc;
	private final PrintWriter out;
	private final long MOD = 1000000007;
	//private final int[] d8x = {-1,0,1,1,1,0,-1,-1};
	//private final int[] d8y = {-1,-1,-1,0,1,1,1,0};
	//private final int[] d4x = {0,1,0,-1};
	//private final int[] d4y = {-1,0,1,0};
	StringBuilder s;

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16L * 1024 * 1024).start();
	}

	Main() {
		sc = new FastScanner();
		out = new PrintWriter(System.out);
	}

	private void init() throws Exception {
		s = new StringBuilder(sc.next());
	}

	private void solve() throws Exception{
		int cnt = 0;
		for(int i=s.length()-4;i>=0;i--){
			for(int j=s.length()-1;j-i>=3;j--){
				if(Long.parseLong(s.substring(i, j+1).toString())%2019==0){
					cnt++;
				}
			}
		}
		out.println(cnt);
	}

	/*
	private void exit(){ out.flush(); out.close();
	System.exit(0); } 
   //*/
	public void run() {
		try {
			init();
			sc.close();
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
