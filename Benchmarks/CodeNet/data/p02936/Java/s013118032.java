import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int Q = reader.nextInt();
		ArrayList<Integer>[] child = new ArrayList[N];
		for(int i=0; i<N; i++) {
		    child[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<N-1; i++) {
	    	int a = reader.nextInt()-1;
	    	int b = reader.nextInt()-1;
	    	child[a].add(b);
		}

		long[] cnt = new long[N];
		for (int i=0; i<Q; i++) {
		    int p = reader.nextInt()-1;
		    int q = reader.nextInt();
		    cnt[p] += q;
		}
		
		for (int i=0; i<N; i++) {
		    int l = child[i].size();
		    for (int j=0; j<l; j++) {
		        cnt[child[i].get(j)] += cnt[i];
		    }
		}

		for(int i=0; i<N; i++) {
		    System.out.print(cnt[i]);
		    if (i != N-1) System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void solver() {
		// write logic
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
