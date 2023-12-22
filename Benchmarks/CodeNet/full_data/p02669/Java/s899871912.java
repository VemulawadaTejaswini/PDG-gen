import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static long A, B, C, D;
	
	static int MAX = 50000000;
	static long[] memo = new long[MAX];
	
	static long calc(long val, int number) {
		if (val < MAX && memo[(int)val] != -1) return memo[(int)val];
		if (val == 0) return memo[0] = 0;
		boolean two = false, three = false, five = false;
		if (val >= MAX) {
			if (number == 2) two = true;
			else if (number == 3) three = true;
			else five = true;
		} else {
			two = three = five = true;
		}
		long ret = Long.MAX_VALUE;
		if (Long.MAX_VALUE / val > D) {
			ret = Math.min(ret, D * val);
		}
		for (long i = Math.max(0, val - 1); i <= val + 1; i++) {
			if (two && i % 2 == 0 && i / 2 < val) {
				ret = Math.min(ret, D * Math.abs(i - val) + A + calc(i / 2, number));
			}
			if (three && i % 3 == 0) {
				ret = Math.min(ret, D * Math.abs(i - val) + B + calc(i / 3, number));
			}
		}
		for (long i = Math.max(0, val - 2); i <= val + 2; i++) {
			if (five && i % 5 == 0) {
				ret = Math.min(ret, D * Math.abs(i - val) + C + calc(i / 5, number));
			}
		}
		if (val < MAX) {
			memo[(int)val] = ret;
		}
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = sc.nextInt();
		for (int caze = 0; caze < T; caze++) {
			Arrays.fill(memo, -1);
			long N = sc.nextLong();
			A = sc.nextLong();
			B = sc.nextLong();
			C = sc.nextLong();
			D = sc.nextLong();
			
			long min = Math.min(calc(N, 2), calc(N, 3));
			min = Math.min(min, calc(N, 5));
			out.println(min);
		}
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
	}
}
