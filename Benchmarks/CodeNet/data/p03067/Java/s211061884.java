import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Support only ASCII code (8-bit char) for IO.
 */
public class Main {
	private static final int MOD = (int) 1E9 + 7;
	private static final int BUFFER_SIZE = (1 << 13);
	private static final int WHITE_SPACE = 32;
	private static final byte[] IN_BUFFER = new byte[BUFFER_SIZE];
	private static final byte[] OUT_BUFFER = new byte[BUFFER_SIZE];

	private int inNextByte;
	private int inNextIndex;
	private int inReadByteCount;
	private int outNextIndex;
	private InputStream in = System.in;
	private OutputStream out = System.out;
	private PrintStream err = System.err;

	private boolean isShowDebugInfo;
	private boolean isRunOnEditor;
	private boolean isLocalFileInput;
	private boolean isLocalFileOutput;

	public Main(String[] args) {
		if (args != null) {
			if (args.length > 0) {
				isShowDebugInfo = Boolean.parseBoolean(args[0]);
			}
			if (args.length > 1) {
				isRunOnEditor = Boolean.parseBoolean(args[1]);
			}
			if (args.length > 2) {
				isLocalFileInput = Boolean.parseBoolean(args[2]);
			}
			if (args.length > 3) {
				isLocalFileOutput = Boolean.parseBoolean(args[3]);
			}
		}
	}

	private void start() throws Exception {
		if (isLocalFileInput) {
			char fs = File.separatorChar;
			String root = new File("").getAbsolutePath();
			String inPath = String.format("%s%c%s", root, fs, "in.txt");
			if (isRunOnEditor) {
				inPath = String.format("%s%c%s%c%s", root, fs, "src", fs, "in.txt");
			}
			in = new FileInputStream(inPath);
			if (isShowDebugInfo) {
				err.printf("Input: %s\n", inPath);
			}
		}
		else if (isShowDebugInfo) {
			err.println("Input: Console\n");
		}

		if (isLocalFileOutput) {
			char fs = File.separatorChar;
			String root = new File("").getAbsolutePath();
			String outPath = String.format("%s%c%s", root, fs, "out.txt");
			if (isRunOnEditor) {
				outPath = String.format("%s%c%s%c%s", root, fs, "src", fs, "out.txt");
			}
			out = new FileOutputStream(outPath);
			if (isShowDebugInfo) {
				err.printf("Output: %s\n", outPath);
			}
		}
		else if (isShowDebugInfo) {
			err.println("Output: Console\n");
		}

		long now = 0;
		if (isShowDebugInfo) {
			now = System.currentTimeMillis();
		}

		readByte();
		solve();
		in.close();
		flushOutBuf();

		if (isShowDebugInfo) {
			long elapsed = System.currentTimeMillis() - now;
			long second = elapsed / 1000;
			long millis = elapsed - 1000 * second;
			err.printf("\nSolve completed in %d s %d ms\n", second, millis);
		}
	}

	public static void main(String[] args) {
		try {
			new Main(args).start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int readByte() throws IOException {
		if (inNextIndex >= inReadByteCount) {
			inReadByteCount = in.read(IN_BUFFER, 0, BUFFER_SIZE);
			if (inReadByteCount == -1) {
				return (inNextByte = -1);
			}
			inNextIndex = 0;
		}
		return (inNextByte = IN_BUFFER[inNextIndex++]);
	}

	private char nc() throws IOException {
		while (inNextByte <= WHITE_SPACE) {
			readByte();
		}
		char res = (char) inNextByte;
		readByte();
		return res;
	}

	private int ni() throws IOException {
		int res = 0;
		while (inNextByte <= WHITE_SPACE) {
			readByte();
		}
		boolean minus = (inNextByte == '-');
		if (minus) {
			readByte();
		}
		if (inNextByte < '0' || inNextByte > '9') {
			throw new RuntimeException();
		}
		do {
			res = (res << 1) + (res << 3) + inNextByte - '0';
		}
		while (readByte() >= '0' && inNextByte <= '9');

		return minus ? -res : res;
	}

	private long nl() throws IOException {
		long res = 0;
		while (inNextByte <= WHITE_SPACE) {
			readByte();
		}
		boolean minus = (inNextByte == '-');
		if (minus) {
			readByte();
		}
		if (inNextByte < '0' || inNextByte > '9') {
			throw new RuntimeException();
		}
		do {
			res = (res << 1) + (res << 3) + inNextByte - '0';
		}
		while (readByte() >= '0' && inNextByte <= '9');

		return minus ? -res : res;
	}

	private double nd() throws IOException {
		double pre = 0.0, suf = 0.0, div = 1.0;
		while (inNextByte <= WHITE_SPACE) {
			readByte();
		}
		boolean minus = (inNextByte == '-');
		if (minus) {
			readByte();
		}
		if (inNextByte < '0' || inNextByte > '9') {
			throw new RuntimeException();
		}
		do {
			pre = 10 * pre + (inNextByte - '0');
		}
		while (readByte() >= '0' && inNextByte <= '9');

		if (inNextByte == '.') {
			while (readByte() >= '0' && inNextByte <= '9') {
				suf += (inNextByte - '0') / (div *= 10);
			}
		}
		return minus ? -(pre + suf) : (pre + suf);
	}

	private String ns() throws IOException {
		while (inNextByte <= WHITE_SPACE) {
			readByte();
		}
		StringBuilder sb = new StringBuilder();
		while (inNextByte > WHITE_SPACE) {
			sb.append((char) inNextByte);
			readByte();
		}
		return sb.toString();
	}

	private char[] nc(int n) throws IOException {
		char a[] = new char[n];
		for (int i = 0; i < n; ++i) {
			a[i] = nc();
		}
		return a;
	}

	private char[][] nc(int r, int c) throws IOException {
		char a[][] = new char[r][c];
		for (int i = 0; i < r; ++i) {
			a[i] = nc(c);
		}
		return a;
	}

	private int[] ni(int n) throws IOException {
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = ni();
		}
		return a;
	}

	private int[][] ni(int r, int c) throws IOException {
		int a[][] = new int[r][c];
		for (int i = 0; i < r; ++i) {
			a[i] = ni(c);
		}
		return a;
	}

	private long[] nl(int n) throws IOException {
		long a[] = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = nl();
		}
		return a;
	}

	private long[][] nl(int r, int c) throws IOException {
		long a[][] = new long[r][c];
		for (int i = 0; i < r; ++i) {
			a[i] = nl(c);
		}
		return a;
	}

	private double[] nd(int n) throws IOException {
		double a[] = new double[n];
		for (int i = 0; i < n; ++i) {
			a[i] = nd();
		}
		return a;
	}

	private double[][] nd(int r, int c) throws IOException {
		double a[][] = new double[r][c];
		for (int i = 0; i < r; ++i) {
			a[i] = nd(c);
		}
		return a;
	}

	private String[] ns(int n) throws IOException {
		String a[] = new String[n];
		for (int i = 0; i < n; ++i) {
			a[i] = ns();
		}
		return a;
	}

	private String[][] ns(int r, int c) throws IOException {
		String a[][] = new String[r][c];
		for (int i = 0; i < r; ++i) {
			a[i] = ns(c);
		}
		return a;
	}

	private void flushOutBuf() {
		try {
			if (outNextIndex <= 0) {
				return;
			}
			out.write(OUT_BUFFER, 0, outNextIndex);
			out.flush();
			outNextIndex = 0;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void print(String s) {
		if (s == null) {
			s = "null";
		}
		for (int i = 0, N = s.length(); i < N; ++i) {
			OUT_BUFFER[outNextIndex++] = (byte) s.charAt(i);
			if (outNextIndex >= BUFFER_SIZE) {
				flushOutBuf();
			}
		}
	}

	private void println(String s) {
		print(s);
		print('\n');
	}

	private void print(Object obj) {
		if (obj == null) {
			print("null");
		}
		else {
			print(obj.toString());
		}
	}

	private void println(Object obj) {
		print(obj);
		print('\n');
	}

	private void print(String format, Object... args) {
		if (args != null) {
			format = String.format(format, args);
		}
		print(format);
	}

	private void println(String format, Object... args) {
		if (args != null) {
			format = String.format(format, args);
		}
		println(format);
	}

	private void solve() throws Exception {
		int[] arr = ni(3);
		println((arr[1] - arr[0]) * (arr[1] - arr[2]) < 0 ? "Yes" : "No");
	}
}

//javac Main.java & java Main true false true false
//javac Main.java ; java Main true false true false
