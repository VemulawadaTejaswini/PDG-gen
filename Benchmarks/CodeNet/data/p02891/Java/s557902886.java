import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[] S = sc.next().toCharArray();
		long K = sc.nextInt();
		List<Integer> sizes = new ArrayList<>();
		int got = 1;
		for (int i = 1; i < S.length; i++) {
			if (S[i] == S[i-1]) got++;
			else {
				sizes.add(got);
				got = 1;
			}
		}
		sizes.add(got);
		long ans = 0;
		if (sizes.size() == 1) {
			long tot = sizes.get(0) * K;
			ans = tot / 2;
		} else if (S[0] == S[S.length - 1]) {
			ans = sizes.get(0) / 2 + sizes.get(sizes.size() - 1) / 2;
			ans += (K - 1) * ((sizes.get(0) + sizes.get(sizes.size() - 1)) / 2);
			for (int i = 1; i + 1 < sizes.size(); i++) {
				ans += K * (sizes.get(i) / 2);
			}
		} else {
			for (Integer size : sizes) {
				ans += K * (size / 2);
			}
		}
		out.println(ans);
		
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
