import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static String S;
	boolean flg = false;

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		String S = sc.next();
		List<String[]> ary = getRunLength(S);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ary.size(); i += 2) {
			int R = Integer.parseInt(ary.get(i)[1]);
			int L = Integer.parseInt(ary.get(i + 1)[1]);
			for (int j = 0; j < R - 1; j++) {
				sb.append(" ");
				sb.append("0");
			}
			int[] Rret = judgeEven(R);
			int[] Lret = judgeEven(L);
			sb.append(" ");
			sb.append(String.valueOf(Rret[1] + Lret[0]));
			sb.append(" ");
			sb.append(String.valueOf(Rret[0] + Lret[1]));
			for (int j = 0; j < L - 1; j++) {
				sb.append(" ");
				sb.append("0");
			}
		}
		String str = sb.toString();
		System.out.print(str.substring(1));
	}

	public static int[] judgeEven(int Num) {
		int ret[] = new int[2];
		ret[0] = Num / 2;
		ret[1] = ret[0];
		int amari = Num % 2;
		if (amari != 0) {
			ret[1]++;
		}
		return ret;

	}

	public static List<String[]> getRunLength(String str) {
		List<String[]> list = new ArrayList<String[]>();
		char back = 'm';
		for (int i = 0; i < str.length(); i++) {
			if (back != str.charAt(i)) {
				String[] hairetu = new String[2];
				hairetu[0] = String.valueOf(str.charAt(i));
				hairetu[1] = "1";
				list.add(hairetu);
				back = str.charAt(i);
			} else {
				String[] hairetu = list.get(list.size() - 1);
				hairetu[1] = String.valueOf(Integer.parseInt(hairetu[1]) + 1);
				list.set(list.size() - 1, hairetu);
			}
		}
		return list;
	}

}

class FScanner {
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

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}