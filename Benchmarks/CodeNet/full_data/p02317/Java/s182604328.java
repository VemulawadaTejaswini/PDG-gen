import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		int N = (int)reader.nextLong();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = (int)reader.nextLong();
		}
		solver(N, A);
	}

	public static void solver(int N, int[] A) {
		ArrayList<Integer> L = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			if (L.size() == 0) {
				L.add(A[i]);
			} else if (L.size() == 1){
				if (A[i] <= L.get(0)) L.set(0, A[i]);
				else L.add(A[i]);
			} else if(L.get(L.size() - 1) < A[i]){
				L.add(A[i]);
			} else {
				int n = BSearch(A[i], L, 0, L.size()-1);
				L.set(n, A[i]);
			}
		}
		System.out.println(L.size());
	}

	public static int BSearch(int Ai, ArrayList<Integer> L, int begin, int end) {
		int mid = (int)(begin + end) / 2;
		if (Ai < L.get(mid)) {
			if (begin == 0) return 0;
			else return BSearch(Ai, L, begin, mid);
		} else if (L.get(mid + 1) < Ai) {
			return BSearch(Ai, L, mid, end);
		} else {
			return mid+1;
		}
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