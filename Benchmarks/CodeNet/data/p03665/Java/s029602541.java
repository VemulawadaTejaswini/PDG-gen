import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;

	private void solve() throws IOException {
		int n = nextInt();
		int p = nextInt();
		
		long zero = 1, one = 0;
		
		for (int i = 0; i < n; i++) {
			int a = nextInt() % 2;
			
			long newZero = 0;
			long newOne = 0;
			
			if (a == 0) {
				newZero = 2 * zero;
				newOne = 2 * one;
			} else {
				newZero = (zero + one);
				newOne = (zero + one);
			}
			
			zero = newZero;
			one = newOne;
		}
		
		long result = (p == 0 ? zero : one);
		out.println(result);
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