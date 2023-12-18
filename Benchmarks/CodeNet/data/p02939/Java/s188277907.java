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
		String S = reader.next();
		int[] dp1 = new int[S.length()];
		int[] dp2 = new int[S.length()];
		dp1[0] = 1;
		dp2[0] = 0;
		for(int i=1; i<S.length(); i++) {
		    // update dp2
		    if(i==1) {
		        dp2[i] = 1;
		    } else if(i==2) {
		        dp2[i] = Math.max(dp1[i-2]+1, dp2[i-2]+1);
		    } else {
		        if (S.charAt(i-3)==S.charAt(i-1) && S.charAt(i-2) == S.charAt(i)) {
		            dp2[i] = dp1[i-2]+1;
		        } else {
		            dp2[i] = Math.max(dp1[i-2]+1, dp2[i-2]+1);
		        }
		    }
		    // update dp1
		    if (S.charAt(i-1) == S.charAt(i)) {
		        dp1[i] = dp2[i-1]+1;
		    } else {
		        dp1[i] = Math.max(dp1[i-1]+1, dp2[i-1]+1);
		    }
		}
		
		System.out.println(Math.max(dp1[S.length()-1], dp2[S.length()-1]));
	}
	
	public static void solver(int H, int W, int N, int[] A) {
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
