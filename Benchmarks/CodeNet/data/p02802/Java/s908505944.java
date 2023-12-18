import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.*;
import java.lang.*;

public class Main {
	public void run() throws Exception {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int corr = 0;
		int pen = 0;
		for (int i = 0; i<k; i++) {
			int num = sc.nextInt()-1;
			String s = sc.next();
			if (arr[num] == -1) continue;
			else if (s.equals("WA")) {
				arr[num] +=1;
			}
			else {
				corr++;
				pen+=arr[num];
				arr[num] = -1;
			}
		}
		System.out.println(corr + " " + pen);
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