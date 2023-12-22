import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class Main {
	public static int[][] warshall(int n, int[][]matrix) {
		int[][] ans = matrix;
		for(int i=0; i<n; i++) {
			ans[i][i] = 0;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(ans[j][i] == Integer.MAX_VALUE || ans[i][k] == Integer.MAX_VALUE) continue;
					ans[j][k] = Math.min(ans[j][k], ans[j][i]+ans[i][k]);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		FS r = new FS();
		int v = r.nextInt();
		int e = r.nextInt();
		int[][] matrix = new int[v][v];
		for(int i=0; i<v; i++) {
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}
		for(int i=0; i<e; i++) {
			int s = r.nextInt();
			int t = r.nextInt();
			int d = r.nextInt();
			matrix[s][t] = d;
		}
		int[][] ans = warshall(v, matrix);
		for(int i=0; i<v; i++) {
			if(ans[i][i] < 0) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		}
		for(int i=0; i<v; i++) {
			String[] print = new String[v];
			for(int j=0; j<v; j++) {
				if(matrix[i][j] == Integer.MAX_VALUE) print[j] = "INF";
				else print[j] = Integer.toString(matrix[i][j]);
			}
			System.out.println(String.join(" ", print));
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