import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
 
	public static void main(String[] args) {
		FastScanner fScanner = new FastScanner();
		int N = fScanner.nextInt();
		int M = fScanner.nextInt();
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<String>());
				}
			}
		};
		for (int i = 0; i < M; i++) {
			int index = Integer.parseInt(fScanner.next()) - 1;
			list.get(index).add(fScanner.next());
		}
		int ans = 0;
		int penalty = 0;
		for (int i = 0; i < N; i++) {
			int tmpPenalty = 0;
			int correct = 0;
			for (int j = 0; j < list.get(i).size(); j++) {
				if (list.get(i).get(j).equals("WA")) {
					tmpPenalty++;
				}
				if (list.get(i).get(j).equals("AC")) {
					correct++;
					break;
				}
			}
			if (correct == 1) {
				ans++;
				penalty += tmpPenalty;
			}
		}
		System.out.println(ans + " " + penalty);
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
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}