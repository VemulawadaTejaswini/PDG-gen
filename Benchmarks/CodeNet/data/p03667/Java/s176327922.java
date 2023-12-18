import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;

	private void solve() throws IOException {
		int count = nextInt(), queries = nextInt();
		int[] values = new int[count];
		for (int i = 0; i < count; i++) {
			values[i] = nextInt() - 1;
		}
		//int[] sorted = new int[count];
		int[] result = new int[count];
		boolean[] taken = new boolean[count];
		for (int q = 0; q < queries; q++) {
			int index = nextInt() - 1;
			int value = nextInt() - 1;
			values[index] = value;
			//System.arraycopy(values, 0, sorted, 0, count);
			//Arrays.sort(sorted);
			//out.println(Arrays.toString(values));
			Arrays.fill(result, -1);
			Arrays.fill(taken, false);
			for (int i = 0; i < count; i++) {
				int v = values[i];
				if (result[v] == -1) {
					result[v] = v;
					taken[i] = true;
				}
			}
			int penalty = 0;
			//out.println(Arrays.toString(result));
			for (int i = 0; i < count; i++) {
				if (!taken[i]) {
					int v = values[i];
					int cursor = v;
					while (cursor >= 0 && result[cursor] == v) {
						--cursor;
					}
					if (cursor >= 0 && result[cursor] == -1) {
						result[cursor] = v;
					} else {
						++penalty;
					}
				}
			}
			//out.println(Arrays.toString(result));
			out.println(penalty);
		}
		
	}


	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			rnd = new Random();

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = in.readLine();

			if (line == null)
				return null;

			st = new StringTokenizer(line);
		}

		return st.nextToken();
	}

	private int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}