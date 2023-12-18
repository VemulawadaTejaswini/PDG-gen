import java.util.*;
import java.io.*;

public class Main {
	final static int MOD = 1000000007;
	final static int intMax = 1000000000;
	final static int intMin = -1000000000;
	final static int[] dx = { 0, 0, -1, 1 };
	final static int[] dy = { -1, 1, 0, 0 };

	static int T;

	static class Reader {
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
			byte[] buf = new byte[360]; // line length
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
	}
	
	static ArrayList<Integer>[] adj;
	static ArrayList<Integer>[] oppo;
	
	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int N = in.nextInt();
		int M = in.nextInt();
		adj = new ArrayList[N];
		oppo = new ArrayList[N];
		for(int i = 0; i < N; ++i) {
			adj[i] = new ArrayList<Integer>();
			oppo[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < M; ++i) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			adj[x].add(y);
			oppo[y].add(x);
		}
		int[] dp = new int[N];
		for(int i = 0; i < N; ++i) {
			if(oppo[i].size() > 0) continue;
			Stack<Integer> q = new Stack<Integer>();
			q.add(i);
			while(!q.isEmpty()) {
				int cur = q.pop();
				for(Integer j : adj[cur]) {
					if(dp[cur] + 1 > dp[j]) {
						q.add(j);
						dp[j] = dp[cur] + 1;
					}
				}
			}
		}
		int mx = 0;
		for(int i = 0; i < N; ++i) {
			mx = Math.max(mx, dp[i]);
		}
		System.out.println(mx);
		in.close();
	}
}