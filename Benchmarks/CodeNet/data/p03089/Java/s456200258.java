import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] vals = new int[N];
		boolean can = true;
		for (int i = 0; i < vals.length; i++) {
			vals[i] = sc.nextInt() - 1;
			if (vals[i] > i) can = false;
		}
		if (!can) {
			out.println(-1);
		} else {
			List<Integer> ans = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				for (int j = N - 1 - i; j >= 0; j--) {
					if (vals[j] == j) {
						ans.add(j + 1);
						for (int k = j; k + 1 < N; k++) {
							vals[k] = vals[k+1];
						}
						break;
					}
				}
			}
			Collections.reverse(ans);
			for (Integer value : ans) {
				out.println(value);
			}
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
