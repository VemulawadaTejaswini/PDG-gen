import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		char[] dir = sc.next().toCharArray();
		
		int[][] dp = new int[N][3002];
		Arrays.fill(dp[0], 1); dp[0][0] = 0;
		
		for(int i = 1; i < N; i++) {
			for(int j = 1; j <= i+1; j++) {
				if(dir[i-1] == '>') {
					dp[i][j] += dp[i-1][3001] - dp[i-1][j-1];
				} else {
					dp[i][j] += dp[i-1][j-1] - dp[i-1][0];
				}
			}
			for(int j = 1; j < 3002; j++) {
				dp[i][j] += dp[i][j-1];
			}
		}
		/*
		for(int i = 0; i < N; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
		pw.println(dp[N-1][3001]);
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
