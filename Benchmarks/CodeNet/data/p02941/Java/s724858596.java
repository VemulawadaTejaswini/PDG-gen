import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
		    A[i] = reader.nextInt();
		}
		for(int i=0; i<N; i++) {
		    B[i] = reader.nextInt();
		}
		solver(N, A, B);
	}
	
	public static void solver(int N, int[] A, int[] B) {
		// write logic
		int ans = 0;
		int i   = 0;
		int ok  = 0;
		int noopcnt = 0;
		boolean[] check = new boolean[N];
		for(int k=0; k<N; k++) check[k] = false;
		while(ok != N) {
		    if(noopcnt == N) {
		        ans = -1;
		        break;
		    }
		    if(check[i]) {
		        i = (i+1)%N;
		        noopcnt++;
		        continue;
		    }
		    if(B[i] > B[(N+i-1)%N]+B[(N+i+1)%N]) {
		        B[i] -= B[(N+i-1)%N]+B[(N+i+1)%N];
		        ans++;
		        noopcnt = 0;
		        if(B[i] == A[i]) {
		            check[i] = true;
		            ok++;
		        }
		    } else {
		        noopcnt++;
		    }
		    i = (i+1)%N;
		}
		System.out.println(ans);
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
