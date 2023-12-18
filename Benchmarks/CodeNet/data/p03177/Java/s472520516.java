import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {
	
	static int N;
	
	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		N = sc.nextInt();
		long K = sc.nextLong();
		
		long arr[][] = new long[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		arr = fast_exp(arr, K);
		
		long tot = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				tot += arr[i][j];
				tot %= 1000000007;
			}
		}
		
		pw.println(tot);
		pw.close();
		
	}
	
	
	
	static long[][] fast_exp(long[][] base, long exponent) {
		long[][] ret = new long[N][N];
		for(int i = 0; i < N; i++) ret[i][i] = 1;
		while(exponent > 0) {
			if(exponent % 2 == 1) ret = mult(ret, base);
			base = mult(base, base);
			exponent /= 2;
		}
		return ret;
	}
	
	static long[][] mult(long[][] a, long[][] b) {
		long[][] ret = new long[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					ret[i][j] += a[i][k]*b[k][j];
					ret[i][j] %= 1000000007;
				}
			}
		}
		
		return ret;
	}

	static class FastIO {

		//Is your Fast I/O being bad?

		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;

		public FastIO(String fileName) throws Exception {
			dis = new FileInputStream(fileName);
		}

		public FastIO(InputStream is) throws Exception {
			dis = is;
		}

		int nextInt() throws Exception {
			int ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		long nextLong() throws Exception {
			long ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		byte nextByte() throws Exception {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}

		String next() throws Exception {
			StringBuffer ret = new StringBuffer();

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}

			return ret.toString();
		}

	}
}
