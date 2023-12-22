import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	private static final long MOD = 1000000007;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int S = scanner.nextInt();
		
		long DP[][] = new long[670][S+1];
		DP[0][0] = 1;
		
		for (int i = 0; i < 669; i++) {
			for (int s = 0; s < S-2; s++) {
				DP[i+1][s+3] = (DP[i+1][s+3] + DP[i][s]) % MOD;
			}
			
			long SUM = 0;
			for (int s = 0; s <= S; s++) {
				SUM = (SUM + DP[i+1][s])%MOD;
				DP[i+1][s] = SUM;
			}
		}
		
		long Ans = 0;
		for (int i = 1; i < 670; i++) {
			Ans = (Ans + DP[i][S])%MOD;
		}
		
		System.out.println(Ans);
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
