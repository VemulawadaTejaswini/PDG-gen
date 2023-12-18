import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {
	//FastScannerクラス、普通の Scannerクラスだとメモリと時間を大幅に喰らうので高速化する内部クラス。
	
	public static void main(String[]args) {
		FastScanner sc = new FastScanner(System.in);
		int n= Integer.valueOf(sc.next());
		int []a  = new int[n];
		for(int i = 0;i<n;i++)a[i] = Integer.valueOf(sc.next());
		
		Deque<Integer>queue = new ArrayDeque<Integer>();
		
		int uraomo = 0;
		queue.addLast(a[0]);
		for(int i = 1;i<n;i++) {
			if(uraomo==0) {
				queue.addLast(a[i]);
				uraomo=1;
			}else {
				queue.addFirst(a[i]);
				uraomo=0;
			}
		}
		
		for(int i = 0;i<n;i++) {
			System.out.println(uraomo==0?queue.removeFirst():queue.removeLast());
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

}
