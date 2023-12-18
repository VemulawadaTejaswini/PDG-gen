
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			PriorityQueue<Integer> l1 = new PriorityQueue<Integer>(Collections.reverseOrder());
			PriorityQueue<Integer> r1 = new PriorityQueue<Integer>();

			PriorityQueue<Integer> l2 = new PriorityQueue<Integer>(Collections.reverseOrder());
			PriorityQueue<Integer> r2 = new PriorityQueue<Integer>();

			for (int i = 0; i < n; i++) {
				int li = in.nextInt();
				int ri = in.nextInt();
				l1.add(li);
				r1.add(ri);
				l2.add(li);
				r2.add(ri);
			}


			// 右 -> 左 -> 右 ...
			long ans1 = 0;
			long now1 = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					int t = l1.poll();
					ans1 += t - now1;
					now1 = t;
				} else {
					int t = r1.poll();
					ans1 += now1 - t;
					now1 = t;
				}
			}
			if (n % 2 == 0) {
				ans1 += 0 - now1;
			} else {
				ans1 += now1 - 0;
			}


			// 左 -> 右 -> 左 ...
			long ans2 = 0;
			long now2 = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 1) {
					int t = l2.poll();
					ans2 += t - now2;
					now2 = t;
				} else {
					int t = r2.poll();
					ans2 += now2 - t;
					now2 = t;
				}
			}
			if (n % 2 == 1) {
				ans2 += 0 - now2;
			} else {
				ans2 += now2 - 0;
			}

			out.println(Math.max(ans1, ans2));


		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}
