import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.*;
import java.lang.*;

//AtCoder:

public class Main {
	public void run() throws Exception {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		Arrays.fill(num, -1);
		for (int i = 0; i<m; i++) {
			int pos = sc.nextInt()-1;
			int dig = sc.nextInt();
			if (num[pos] != -1 && num[pos] != dig) {
				System.out.println(-1);
				return;
			}
			else num[pos] = dig;
		}
	//	System.out.println(Arrays.toString(num));
		if (n == 1) System.out.println(num[0]);
		else if (num[0] == -1 || num[0] == 0) {
			System.out.println(-1); return;
		}
		else {
			for (int i =0; i<n; i++) {
				if (num[i] == -1) System.out.print(0);
				else System.out.print(num[i]);
			}
		}
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}