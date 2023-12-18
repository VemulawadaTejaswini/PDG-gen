import java.util.*;
import java.io.*;

public class Main {
	public void run() throws Exception {
		FastReader file = new FastReader();
		long n = file.nextLong(), k = file.nextLong();
		long div = n / k;
		System.out.println(Math.min(Math.abs(n - div * k - k), n - div * k));
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
