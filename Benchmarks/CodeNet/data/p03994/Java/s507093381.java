import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FS reader = new FS();
		String s = reader.next();
		int K = reader.nextInt();
		solver(s, K);
	}

	public static void solver(String s, int K) {
		// a = 97
		// z = 122
		String ans = "";
		for (int i=0; i<s.length(); i++) {
			if(i == s.length()-1) {
				ans += String.valueOf((char) (((int)s.charAt(i) - 97 + K) % 26 + 97));
			} else if((int)s.charAt(i) == 97) {
				ans += "a";
			} else {
				int diff = 123 - (int)s.charAt(i);
				if (diff <= K) {
					K -= diff;
					ans += "a";
				} else {
					ans += String.valueOf(s.charAt(i));
				}
			}
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