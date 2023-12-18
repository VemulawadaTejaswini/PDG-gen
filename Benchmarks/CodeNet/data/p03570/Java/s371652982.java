import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			HashMap<Integer, Integer> hm = new HashMap<>();
			int currentCount = 0;
			for (int i = 0; i < s.length; i++) {
				char c = s[i];
				c -= 'a';
				currentCount ^= (1 << c);
				int count1 = 0;
				for (int k = 0; k < 26; k++) {
					if (((1 << k) & currentCount) != 0) {
						count1++;
					}
				}
				if (count1 <= 1) {
					hm.put(currentCount, 1);
					if (i == s.length - 1) {
						out.println(1);
					}
				} else {
					int min = s.length;
					Integer m = hm.get(currentCount);
					if (m != null) {
						min = Math.min(m + 1, min);
					}
					for (int k = 0; k < 26; k++) {
						m = hm.get(currentCount ^ (1 << k));
						if (m != null) {
							min = Math.min(m + 1, min);
						}
					}
					hm.put(currentCount, min);
					if (i == s.length - 1) {
						out.println(min);
					}
				}
			}
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

		public double nextFloat() {
			return Double.parseDouble(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}