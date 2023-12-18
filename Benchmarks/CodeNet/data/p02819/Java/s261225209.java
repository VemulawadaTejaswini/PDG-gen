import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	public boolean isPrime(int n) {
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	public void run() throws Exception {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		for (int i =n; i<Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				return;
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
//	public void run() throws Exception
//	{
//		System.out.println("Hi");
//	}
	public static void main (String[] args) throws Exception {
		new Main().run();
	}
}