
import java.io.*;

import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.InternationalFormatter;

import java.math.*;

 class solve {

	public static PrintWriter out;
	static long a, b;
	static long [][]dp;

	public static void main(String[] args) throws IOException {
		
		  Reader scn = new Reader();
		  
		   int n = scn.nextInt();
		   
		   int []a= scn.nextIntArray(n);
		   
		   long []dp = new long[n];
		   
		   dp[n-1] = 0;
		   dp[n-2] = Math.abs(a[n-2] - a[n-1]);
		   
		   
		   for(int i=n-3; i>=0; i--){
			   
			    dp[i] = Math.min(dp[i+1] + Math.abs(a[i] - a[i+1]), dp[i+2]+Math.abs(a[i] - a[i+2]));
		   }
		
		   System.out.println(dp[0]);
		   
	}


	// _________________________TEMPLATE_____________________________________________________________

	// private static int gcd(int a, int b) {
	// if(a== 0)
	// return b;
	//
	// return gcd(b%a,a);
	// }

	// static class comp implements Comparator<pair> {
	//
	// @Override
	// public int compare(pair o1, pair o2) {
	// return o2.b - o1.b;
	// }
	//
	// }

	static class pair implements Comparable<pair> {
		int min;
		int max;
		int ans;

		pair(int a, int b) {
			min = a;
			max = b;
		}

		@Override
		public int compareTo(pair o) {

			return (int) (this.min - o.max);

		}
	}

	public static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[100000 + 1]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public int[][] nextInt2DArray(int m, int n) throws IOException {
			int[][] arr = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}

	}

}