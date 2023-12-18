import java.io.*;
import java.util.Arrays;

public class Main {
	private static final int mod = (int) 1E9 + 7, bufsize = (1 << 13);
	private static int iNextByte, iNextIndex, iReadByteCount, oNextIndex;
	private static final byte ibuf[] = new byte[bufsize], obuf[] = new byte[bufsize];
	private static InputStream input = System.in;
	private static OutputStream output = System.out;
	private static PrintStream err = System.err;

	private Main() throws Exception {
		if (local) input = new FileInputStream(new File("").getAbsolutePath() + "/src/zzz_data/input");
		if (local) output = new FileOutputStream(new File("").getAbsolutePath() + "/src/zzz_data/output");
		readByte();
		solve();
		input.close();
		flushOutBuf();
	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int readByte() throws IOException {
		if (iNextIndex >= iReadByteCount) {
			iReadByteCount = input.read(ibuf, 0, bufsize);
			if (iReadByteCount == -1) return (iNextByte = -1);
			iNextIndex = 0;
		}
		return (iNextByte = ibuf[iNextIndex++]);
	}

	private char nc() throws IOException {
		while (iNextByte <= ' ') readByte();
		char res = (char) iNextByte;
		readByte();
		return res;
	}

	private int ni() throws IOException {
		int res = 0;
		while (iNextByte <= ' ') readByte();
		boolean minus = (iNextByte == '-');
		if (minus) readByte();
		if (iNextByte < '0' || iNextByte > '9') throw new RuntimeException();
		do {res = (res << 1) + (res << 3) + iNextByte - '0';} while (readByte() >= '0' && iNextByte <= '9');
		return minus ? -res : res;
	}

	private long nl() throws IOException {
		long res = 0;
		while (iNextByte <= ' ') readByte();
		boolean minus = (iNextByte == '-');
		if (minus) readByte();
		if (iNextByte < '0' || iNextByte > '9') throw new RuntimeException();
		do {res = (res << 1) + (res << 3) + iNextByte - '0';} while (readByte() >= '0' && iNextByte <= '9');
		return minus ? -res : res;
	}

	private double nd() throws IOException {
		double pre = 0.0, suf = 0.0, div = 1.0;
		while (iNextByte <= ' ') readByte();
		boolean minus = (iNextByte == '-');
		if (minus) readByte();
		if (iNextByte < '0' || iNextByte > '9') throw new RuntimeException();
		do {pre = 10 * pre + (iNextByte - '0');} while (readByte() >= '0' && iNextByte <= '9');
		if (iNextByte == '.') while (readByte() >= '0' && iNextByte <= '9') suf += (iNextByte - '0') / (div *= 10);
		return minus ? -(pre + suf) : (pre + suf);
	}

	private String ns() throws IOException {
		while (iNextByte <= ' ') readByte();
		StringBuilder sb = new StringBuilder();
		while (iNextByte > ' ') {
			sb.append((char) iNextByte);
			readByte();
		}
		return sb.toString();
	}

	private char[] nc(int n) throws IOException {
		char a[] = new char[n];
		for (int i = 0; i < n; ++i) a[i] = nc();
		return a;
	}

	private char[][] nc(int r, int c) throws IOException {
		char a[][] = new char[r][c];
		for (int i = 0; i < r; ++i) a[i] = nc(c);
		return a;
	}

	private int[] ni(int n) throws IOException {
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) a[i] = ni();
		return a;
	}

	private int[][] ni(int r, int c) throws IOException {
		int a[][] = new int[r][c];
		for (int i = 0; i < r; ++i) a[i] = ni(c);
		return a;
	}

	private long[] nl(int n) throws IOException {
		long a[] = new long[n];
		for (int i = 0; i < n; ++i) a[i] = nl();
		return a;
	}

	private long[][] nl(int r, int c) throws IOException {
		long a[][] = new long[r][c];
		for (int i = 0; i < r; ++i) a[i] = nl(c);
		return a;
	}

	private double[] nd(int n) throws IOException {
		double a[] = new double[n];
		for (int i = 0; i < n; ++i) a[i] = nd();
		return a;
	}

	private double[][] nd(int r, int c) throws IOException {
		double a[][] = new double[r][c];
		for (int i = 0; i < r; ++i) a[i] = nd(c);
		return a;
	}

	private String[] ns(int n) throws IOException {
		String a[] = new String[n];
		for (int i = 0; i < n; ++i) a[i] = ns();
		return a;
	}

	private String[][] ns(int r, int c) throws IOException {
		String a[][] = new String[r][c];
		for (int i = 0; i < r; ++i) a[i] = ns(c);
		return a;
	}

	private void flushOutBuf() {
		try {
			if (oNextIndex <= 0) return;
			output.write(obuf, 0, oNextIndex);
			output.flush();
			oNextIndex = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> void print(T ob) {
		String s = ob + "";
		for (int i = 0, N = s.length(); i < N; ++i) {
			obuf[oNextIndex++] = (byte) s.charAt(i);
			if (oNextIndex >= bufsize) flushOutBuf();
		}
	}

	private <T> void println(T ob) {
		print(ob + "\n");
	}

	private <T> void debug(T obj) {
		err.print(obj);
	}

	private <T> void debugln(T obj) {
		err.println(obj);
	}

	private static final boolean local = false;

	private void solve() throws Exception {
		int A = ni(), B = ni();
		println(((A % 2 == 1) && (B % 2 == 1))? "yes" : "no");
	}
}
