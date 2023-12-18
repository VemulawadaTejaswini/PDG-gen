import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			count.put(tmp, count.getOrDefault(tmp, 0) + 1);
		}
		boolean can = true;
		if (N % 3 != 0) can = false;
		int hav = N / 3;
		int xor = 0;
		for (Map.Entry<Integer, Integer> e : count.entrySet()) {
			int cc = e.getValue();
			if (cc % hav != 0) can = false;
			
			while (cc > 0) {
				xor ^= e.getKey();
				cc -= hav;
			}
		}
		if (xor != 0) can = false;
		out.println(can ? "Yes" : "No");
		
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
