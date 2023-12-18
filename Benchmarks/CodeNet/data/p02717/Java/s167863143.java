import java.util.*;
import java.io.*;

public class Main {
	public void run() throws Exception {
		FastReader file = new FastReader();
		int a = file.nextInt(), b = file.nextInt(), c = file.nextInt();
		int d = a;
		a = b;
		b = d;
		int e = c;
		c = a;
		a = e;
		System.out.println(a + " " + b + " " + c);
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
