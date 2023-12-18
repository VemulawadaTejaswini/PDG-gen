import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int H = reader.nextInt();
		int W = reader.nextInt();
		boolean[][] matrix = new boolean[H][W];
		for(int x=0; x<H; x++) {
		    String input = reader.next();
		    for(int y=0; y<W; y++) {
		        if (input.charAt(y) == '#') matrix[x][y] = false;
		        else matrix[x][y] = true;
		    }
		}
		solver(H, W, matrix);
	}
	
	public static void solver(int H, int W, boolean[][] matrix) {
		// write logic
		boolean[] horizon = new boolean[H];
		boolean[] vertical = new boolean[W];
		for(int i=0; i<H; i++) {
		    horizon[i] = true;
		}
		for(int i=0; i<W; i++) {
		    vertical[i] = true;
		}

		for(int x=0; x<H; x++) {
		    for(int y=0; y<W; y++) {
		        vertical[y] &= matrix[x][y];
		        horizon[x]  &= matrix[x][y];
		    }
		}
		
		for(int x=0; x<H; x++) {
		    if (horizon[x]) continue;
		    for(int y=0; y<W; y++) {
		        if(!vertical[y]) {
		            String out = matrix[x][y] ? "." : "#";
		            System.out.print(out);
		        }
		    }
		    System.out.println();
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
