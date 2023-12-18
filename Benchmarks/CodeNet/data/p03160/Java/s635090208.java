import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		int[] minCost = new int[N];
		Arrays.fill(minCost, (int)2e9);
		minCost[0] = 0;
		for(int i = 0; i < N; i++) {
			if(i+2 < N) minCost[i+2] = Math.min(minCost[i+2], minCost[i]+Math.abs(h[i+2]-h[i]));
			if(i+1 < N) minCost[i+1] = Math.min(minCost[i+1], minCost[i]+Math.abs(h[i+1]-h[i]));
		}
		
		pw.println(minCost[N-1]);
		pw.close();
		
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
