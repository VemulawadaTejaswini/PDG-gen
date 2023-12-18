import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long gcd = gcd(a, b);
		char[] aVals = sc.next().toCharArray();
		char[] bVals = sc.next().toCharArray();
		long len = a * b / gcd;
		boolean can = true;
		long first = len / a;
		long second = len / b;
		long ff = 0, ss = 0;
		int fi = 0, si = 0;
		while (ff < len && ss < len && can) {
			if (ff == ss) {
				if (aVals[fi] != bVals[si]) can = false;
				ff += first;
				ss += second;
				fi++;
				si++;
			} else if (ff < ss) {
				ff += first;
				fi++;
			} else {
				ss += second;
				si++;
			}
		}
		out.println(can ? len : -1);
		
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
