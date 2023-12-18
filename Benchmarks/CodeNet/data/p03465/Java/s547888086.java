import java.io.*;
import java.util.*;

public class Main {

	static class BitsetLong {

		static final int LOG = 6;
		static final int SIZE = 1 << LOG;
		static final int MASK = SIZE - 1;

		private long[] data;
		
		int n;

		public BitsetLong(int n) {
			this.n = n;
			data = new long[(n >> LOG) + 2];
		}

		void set(int i) {
			data[i >> LOG] |= 1L << (i & MASK);
		}

		void unset(int i) {
			data[i >> LOG] &= ~(1L << (i & MASK));
		}

		void flip(int i) {
			data[i >> LOG] ^= 1L << (i & MASK);
		}

		int get(int i) {
			return (int) ((data[i >> LOG] >>> (i & MASK)) & 1);
		}

		/**
		 * pads with zeroes if end of word is outside of range
		 */
		long getWord(int i) {
			
			if (i <= -SIZE || i >= n) {
				return 0;
			}
			
			int rem = i & MASK;
			int idx = i >> LOG;
			
			if (i < 0) {
				return (data[idx + 1] & ((1L << rem) - 1)) << (SIZE - rem);
			}

			if (rem == 0) {
				return data[idx];
			}

			long head = data[idx] >>> rem;
			long tail = data[idx + 1] & ((1L << rem) - 1);

			return head | (tail << (SIZE - rem));
		}
	}

	int solve(int[] a) {
		int sum = 0;
		
		BitsetLong cur = new BitsetLong(sum + 1);
		cur.set(0);
		
		for (int x : a) {
			sum += x;
			
			BitsetLong now = new BitsetLong(sum + 1);
			for (int i = 0; i < now.data.length; i++) {
				now.data[i] = cur.getWord(i << BitsetLong.LOG) | cur.getWord((i << BitsetLong.LOG) - x);  
			}
			cur = now;
		}
		
		int seek = (sum + 1) / 2;
		while (cur.get(seek) == 0) {
			seek++;
		}
		return seek;
	}

	void submit() {
		int n = nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}

		out.println(solve(a));
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {
		int n = 2000;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = n;
		}
		out.println(solve(a));
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
//		 test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
