import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static final int LENGTH = 0, POINT = 1;

	public Main() {
		FastScanner scanner = new FastScanner();
		int N  = scanner.nextInt();
		long K = scanner.nextLong();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = scanner.nextInt()-1;
		}
		long[] C = new long[N];
		for (int i = 0; i < N; i++) {
			C[i] = scanner.nextInt();
		}

		long[][] info = new long[N][2];
		for (int start = 0; start < N; start++) {
			int  len = 1;
			int  x = P[start];
			long point = C[x];
			while(x != start){
				x = P[x];
				point += C[x];
				len++;
			}

			info[start][LENGTH] = len;
			info[start][POINT]  = point;
		}

		long R = Long.MIN_VALUE;
		for (int start = 0; start < N; start++) {
			long point = 0;
			if (info[start][POINT] > 0){
				if ( K/info[start][LENGTH] >= 1){
					point = (K / info[start][LENGTH] - 1) * info[start][POINT];
					int temp = (int)(K - (K/info[start][LENGTH]-1L)*info[start][LENGTH]);
					long max = Long.MIN_VALUE, tempPoint = 0;
					int x = start;
					for (int i = 0; i < temp; i++) {
						x = P[x];
						tempPoint += C[x];
						max = Math.max(max, tempPoint);
					}
					point += max;
				} else {
					long max = Long.MIN_VALUE, tempPoint = 0;
					int x = start;
					for (int i = 0; i < K; i++) {
						x = P[x];
						tempPoint += C[x];
						max = Math.max(max, tempPoint);
					}
					point += max;
				}
			} else {
				long max = Long.MIN_VALUE, tempPoint = 0;
				int x = start;
				for (int i = 0; i < info[start][LENGTH]; i++) {
					x = P[x];
					tempPoint += C[x];
					max = Math.max(max, tempPoint);
				}
				point += max;
			}

			R = Math.max(R, point);
		}

		System.out.println(R);
	}

	public static void main(String[] args) {
		new Main();
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
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
