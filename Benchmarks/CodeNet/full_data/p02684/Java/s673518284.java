import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (k > n) {
			int pos = 1;
			int count = 1;
			int[] start = new int[n];
			start[pos - 1] = count++;
			while (true) {
				pos = arr[pos - 1];
				if (start[pos - 1] > 0)
					break;

				start[pos - 1] = count++;
			}

			long cycle = count - start[pos - 1];
			long stop = k % cycle;
			pos = 1;
			for (int i = 0; i < stop; i++) {
				pos = arr[pos - 1];
			}
			System.out.println(pos);
		} else {
			int pos = 1;
			for (int i = 0; i < k; i++) {
				pos = arr[pos - 1];
			}
			System.out.println(pos);
		}
	}

	static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
