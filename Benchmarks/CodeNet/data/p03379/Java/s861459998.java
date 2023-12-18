import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {
	//FastScannerクラス、普通の Scannerクラスだとメモリと時間を大幅に喰らうので高速化する内部クラス。
	
	public static void main(String[]args) {
		FastScanner sc = new FastScanner(System.in);
		int N = Integer.valueOf(sc.next());
		Integer []x = new Integer[N];
		Integer []X = new Integer[N];
		
		for(int i = 0;i<N;i++) {
			x[i] = Integer.valueOf(sc.next());
			X[i] = x[i];
		}
		
		Arrays.sort(x,Collections.reverseOrder());//降順にソート
		
		for(int i = 0;i<N;i++) {
			//System.out.print(x[i]);
			//System.out.print(" ");
			//System.out.println(X[i]);
		}
		
		int num = (N-1+1)/2;
		
		for(int i = 0;i<N;i++) {
			if(X[i]<x[num-1])
				System.out.println(x[num-1]);
			else
				System.out.println(x[num-1+1]);
		}
		
		
	}
		
	}
	
	static class FastScanner {
		 
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
 
		public FastScanner(InputStream source) {
			in = source;
		}
 
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
 
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
 
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
 
		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		}
 
		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
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
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}


