import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int A = reader.nextInt();
		int B = reader.nextInt();
		long[] V = new long[N];
		for (int i=0; i<N; i++) {
		    V[i] = reader.nextLong();
		}
		solver(N, A, B, V);
	}
	
	public static void solver(int N, int A, int B, long[] V) {
		// write logic
		// DP:dpv[i][j] max value when choose i items till item j
		//    dpc[i][j] count of max value pattern
		// order:50*50
		long[][] dpv = new long[N+1][N+1];
		long[][] dpc = new long[N+1][N+1];
		for (int i=0; i<N+1; i++) {
		    for (int j=0; j<N+1; j++) {
		        dpv[i][j] = 0;
		        dpc[i][j] = 0;
		    }
    		dpc[i][0] = 1;
		}

		for (int i=1; i<N+1; i++) {
		    for (int j=1; j<i+1; j++) {
		        if (dpv[i-1][j] < dpv[i-1][j-1]+V[i-1]) {
		            dpc[i][j] = dpc[i-1][j-1];
		        } else if (dpv[i-1][j] > dpv[i-1][j-1]+V[i-1]) {
		            dpc[i][j] = dpc[i-1][j];
		        } else { // (dpv[i-1][j] == dpv[i-1][j-1]+V[i-1])
		            dpc[i][j] = dpc[i-1][j] + dpc[i-1][j-1];
		        }
		        dpv[i][j] = Math.max(dpv[i-1][j], dpv[i-1][j-1]+V[i-1]);
		    }
		}

		double ans = 0.0;
		long anscnt = 0;
		for (int i=A; i<B+1; i++) {
		    double check = (double)dpv[N][i]/(double)i;
		    if (ans < check) {
		        anscnt = dpc[N][i];
		    } else if (ans == check) {
		        anscnt += dpc[N][i];
		    }
		    ans = Math.max(ans, (double)dpv[N][i]/(double)i);
		}

		System.out.println(ans);
		System.out.println(anscnt);
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
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
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
