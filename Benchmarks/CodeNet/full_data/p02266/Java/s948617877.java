import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Alds1_3_d {
	public static void main(String[] args) {
		FS r = new FS();
		String str = r.next();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int tmpsum = 0;
		int sum = 0;
		Deque<int[]> pond = new ArrayDeque<int[]>();
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case '\\':
					stack.addLast(i);
					break;
				case '/':
					if(!stack.isEmpty()) {
						int t = stack.pollLast();
						sum += i-t;
						if(pond.isEmpty()) {
							int[] data = {i, t, i-t};
							pond.addLast(data);
						} else {
							int tmppond = i-t;
							while(!pond.isEmpty()) {
								int[] tmp = pond.peekLast();
								if(tmp[0] < t) break;
								tmppond += tmp[2];
								pond.removeLast();
							}
							int[] data = {i, t, tmppond};
							pond.addLast(data);
						}
					}
					break;
				default:
					break;
			}
		}
		System.out.println(sum);
		if(pond.size() == 0) {
			System.out.println(0);
		} else {
			int size = pond.size();
			System.out.print(size + " ");
			for(int i=0; i<size; i++) {
				if(i == size-1) System.out.print(pond.pollFirst()[2]);
				else System.out.print(pond.pollFirst()[2] + " ");
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