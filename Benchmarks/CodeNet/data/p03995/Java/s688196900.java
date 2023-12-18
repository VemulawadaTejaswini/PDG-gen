import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;
	static HashMap<Long, Integer> map = new HashMap<Long, Integer>();

	public static void main(String args[]) {
		int R = ni();
		int C = ni();
		int N = ni();
		boolean check = true;
		int CD = -10000000;
		int RD = -10000000;
		int RR[] = new int[R];
		int Rmin[] = new int[R];
		int CC[] = new int[C];
		int Cmin[] = new int[C];
		for (int i=0;i<R;i++) {
			Rmin[i] = 1000000;
		}
		for (int i=0;i<C;i++) {
			Cmin[i] = 1000000;
		}

		for (int i=0;i<N;i++) {
			int r = ni() - 1;
			int c = ni() - 1;
			int a = ni();

			if (Rmin[r] != 1000000) {
				int s = (Rmin[r] - c);
				int t = RR[r] - a;
				if (checkmod0(t, s) == false) {
					check = false;
				} else {
					int dd = t/s;
					if (RD == -10000000) {
						RD = dd;
					} else if (RD != dd) {
						check = false;
					}
				}
			} else {
				Rmin[r] = c;
				RR[r] = a;
			}

			if (Cmin[c] != 1000000) {
				int s = (Cmin[c] - r);
				int t = CC[c] - a;
				if (checkmod0(t, s) == false) {
					check = false;
				} else {
					int dd = t/s;
					if (CD == -10000000) {
						CD = dd;
					} else if (CD != dd) {
						check = false;
					}
				}
			} else {
				Cmin[c] = r;
				CC[c] = a;
			}
		}

		// minus check
		for (int i=0;i<R;i++) {
			long pos = Rmin[i];
			long val = RR[i];
			long d = RD;
			if (pos == 1000000) continue;
			if (d == -10000000) continue;

			if (val - pos * d < 0) check = false;
			if (val + (R - 1 - pos) * d < 0) check = false;
		}
		for (int i=0;i<C;i++) {
			long pos = Cmin[i];
			long val = CC[i];
			long d = CD;
			if (pos == 1000000) continue;
			if (d == -10000000) continue;

			if (val - pos * d < 0) check = false;
			if (val + (C - 1 - pos) * d < 0) check = false;
		}

		System.out.println(check ? "Yes" : "No");
	}

	private static boolean checkmod0(int a, int b) {
		if (a < 0) a = -a;
		if (b < 0) b = -b;
		
		return (a%b) == 0;
	}
	
	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static double nd() {
		return Double.parseDouble( next() );
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
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}
