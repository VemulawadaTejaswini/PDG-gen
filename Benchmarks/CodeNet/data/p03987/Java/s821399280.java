import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	public static class Mountain {
		int begin;
		int end;
		int height;
		public Mountain(int begin, int end) {
			this.begin = begin;
			this.end = end;
			this.height = end - begin + 1;
		}

		public int counter(int n) {
			return (n-this.begin+1) * (this.end-n+1);
		}

		public Mountain[] devide(int n) {
			Mountain[] res = new Mountain[2];
			res[0] = new Mountain(this.begin, n-1);
			res[1] = new Mountain(n+1, this.end);
			return res;
		}
	}

	public static void main(String[] args) {
		FS reader = new FS();
		int N = reader.nextInt();
		int[] a = new int[N+1];
		for (int i=1; i<N+1; i++) {
			a[reader.nextInt()] = i;
		}
		long sum = 0;
		ArrayList<Mountain> mountains = new ArrayList<Mountain>();
		Mountain m = new Mountain(1, N);
		mountains.add(m);
		for(int i=1; i<=N; i++) {
			for(int j=0; j<mountains.size(); j++) {
				Mountain checkM = mountains.get(j);
				if (checkM.begin <= a[i] && a[i] <= checkM.end) {
					sum += checkM.counter(a[i]) * i;
					// System.out.println(i + " : " + checkM.counter(a[i]) + " x " + i);
					mountains.remove(j);
					Mountain[] lst = checkM.devide(a[i]);
					for(int x=0; x<2; x++) {
						if(lst[x].height != 0) {
							mountains.add(lst[x]);
						}
					}
					continue;
				}
			}
		}
		System.out.println(sum);
	}

	public static void solver() {
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