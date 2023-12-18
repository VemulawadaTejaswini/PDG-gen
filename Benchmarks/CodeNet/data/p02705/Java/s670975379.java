import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Main implements Runnable {
	public static final long MOD = 1000000007;
	private final FastScanner sc;
	private final PrintWriter out;
	int r;

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
		new Thread(null,new Main(),"",16L*1024*1024).start();
	}

	Main() {
		sc = new FastScanner();
		out = new PrintWriter(System.out);
		init();
	}
	
	private void init(){
		r = sc.nextInt();
	}
	private void solve(){
		out.print(2*r*Math.PI);
	}
	
	/*
	private void exit(int status){
		out.flush();
		out.close();
		System.exit(status);
	}
	//*/
	public void run() {
		try{
		solve();
		}catch(Exception e){
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

	// 入力の受け取り 及び 文字が読み込めたらTRUE
	// 前回の受け取りが未処理であれば新規入力はしない
	private boolean read() {
		if (ptr < buflen) {
			return true;
		} else {
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

	// 読込可能判定
	private boolean hasNext() {
		// 読込可能かつ文字以外ならポインタ加算
		while (read() && !isVisibleChar(buffer[ptr]))
			ptr++;
		// 文字が来た or EOF で結果表示
		return read();
	}

	// 次の１バイトを読む
	private int getNextChar() {
		if (read()) {
			ptr++;
			return buffer[ptr - 1];
		} else {
			return -1;
		}
	}

	// ASCIIの制御文字以外でTRUE
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
