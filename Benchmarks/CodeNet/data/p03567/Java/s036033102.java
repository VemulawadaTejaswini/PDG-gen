import java.io.*;

public class Main {
	private static final boolean inFromFile = false, outToFile = false;
	private static final int mod = (int) 1E9 + 7;
	private static int ibufNextByte, ibufNextIndex, ibufReadByteLen, obufNextIndex;
	private static final int ibufsize = (1 << 15), obufsize = (1 << 15);
	private static final byte ibuf[] = new byte[ibufsize], obuf[] = new byte[obufsize];
	private static InputStream is = System.in;
	private static OutputStream os = System.out;

	private Main() throws Exception {
		if (inFromFile) is = new FileInputStream(new File("").getAbsolutePath() + "/in.txt");
		if (outToFile) os = new FileOutputStream(new File("").getAbsolutePath() + "/out.txt");
		nextByte();
		solve();
		is.close();
		flushOutBuf();
	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isDigit(int cp) {
		return '0' <= cp && cp <= '9';
	}

	private boolean isLowercase(int cp) {
		return 'a' <= cp && cp <= 'z';
	}

	private boolean isUppercase(int cp) {
		return 'A' <= cp && cp <= 'Z';
	}

	private boolean isAlphabet(int cp) {
		return ('a' <= cp && cp <= 'z') || ('A' <= cp && cp <= 'Z');
	}

	private boolean isCharacter(int cp) {
		return cp != -1;
	}

	private boolean isWhitespace(int cp) {
		return cp == ' ' || cp == '\r' || cp == '\n' || cp == '\t';
	}

	private boolean isWordSeparator(int cp) {
		return cp == ' ' || cp == '\r' || cp == '\n' || cp == '\t' || (cp == '@') || (cp == ';');
	}

	private boolean isLineSeparator(int cp) {
		return cp == '\n' || cp == '\r';
	}

	private int nextByte() throws IOException {
		if (ibufNextIndex >= ibufReadByteLen) {
			ibufReadByteLen = is.read(ibuf, 0, ibufsize);
			if (ibufReadByteLen == -1) return (ibufNextByte = -1);
			ibufNextIndex = 0;
		}
		return (ibufNextByte = ibuf[ibufNextIndex++]);
	}

	private char nc() throws IOException {
		return (char) nextByte();
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

	private boolean isMinus() throws IOException {
		boolean minus = false;
		while (ibufNextByte == '+' || ibufNextByte == '-') {
			if (ibufNextByte == '-') minus = !minus;
			nextByte();
		}
		return minus;
	}

	private Integer ni() throws IOException {
		while (isWhitespace(ibufNextByte)) nextByte();
		int res = 0;
		boolean minus = isMinus();
		if (!isDigit(ibufNextByte)) return null;
		while (true) {
			res = (res << 1) + (res << 3) + ibufNextByte - '0';
			if (!isDigit(nextByte())) break;
		}
		return minus ? -res : res;
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

	private Long nl() throws IOException {
		while (isWhitespace(ibufNextByte)) nextByte();
		long res = 0;
		boolean minus = isMinus();
		if (!isDigit(ibufNextByte)) return null;
		while (true) {
			res = (res << 1) + (res << 3) + ibufNextByte - '0';
			if (!isDigit(nextByte())) break;
		}
		return minus ? -res : res;
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

	private Double nd() throws IOException {
		while (isWhitespace(ibufNextByte)) nextByte();
		boolean minus = isMinus();
		if (!isDigit(ibufNextByte)) return null;
		StringBuilder sb = new StringBuilder();
		sb.append((char) ibufNextByte);
		while (isDigit(nextByte())) sb.append((char) ibufNextByte);
		if (ibufNextByte == '.') {
			sb.append('.');
			while (isDigit(nextByte())) sb.append((char) ibufNextByte);
		}
		double res = Double.parseDouble(sb.toString());
		return minus ? -res : res;
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

	private String line() throws IOException {
		while (isWhitespace(ibufNextByte)) nextByte();
		StringBuilder sb = new StringBuilder();
		while (isCharacter(ibufNextByte) && !isLineSeparator(ibufNextByte)) {
			sb.append((char) ibufNextByte);
			nextByte();
		}
		return sb.toString();
	}

	private String ns() throws IOException {
		while (isWordSeparator(ibufNextByte)) nextByte();
		StringBuilder sb = new StringBuilder();
		while (isCharacter(ibufNextByte) && !isWordSeparator(ibufNextByte)) {
			sb.append((char) ibufNextByte);
			nextByte();
		}
		return sb.toString();
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
		if (obufNextIndex == 0) return;
		try {
			os.write(obuf, 0, obufNextIndex);
			os.flush();
			obufNextIndex = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeFormat(String format, Object... args) {
		if (args != null) format = String.format(format, args);
		for (int i = 0, n = format.length(); i < n; ++i) {
			obuf[obufNextIndex++] = (byte) format.charAt(i);
			if (obufNextIndex >= obufsize) flushOutBuf();
		}
	}

	private <T> void print(T ob) {
		writeFormat(ob + "");
	}

	private void print(String format, Object... args) {
		writeFormat(format, args);
	}

	private <T> void println(T ob) {
		writeFormat(ob + "\n");
	}

	private void println(String format, Object... args) {
		writeFormat(format + "\n", args);
	}

	private <T> void debug(T ob) {
		writeFormat("\u001B[31m" + ob + "\u001B[0m");
	}

	private <T> void debug(String format, Object... args) {
		writeFormat("\u001B[31m" + format + "\u001B[0m", args);
	}

	private <T> void debugln(T ob) {
		writeFormat("\u001B[31m" + ob + "\u001B[0m\n");
	}

	private void debugln(String format, Object... args) {
		writeFormat("\u001B[31m" + format + "\u001B[0m\n", args);
	}

	private void solve() throws Exception {
		println(ns().contains("AC")? "Yes" :"No");
	}
}
