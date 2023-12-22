import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int K = sc.nextInt();
		int[] vals = new int[K + 1];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
		for (int i = 1; i <= K; i++) {
			vals[i] = sc.nextInt();
			min = Math.min(min, vals[i]);
			max = Math.max(max, vals[i]);
			sum += vals[i];
		}
		if (max <= 2 * min) {
			int idx = 0;
			int[] ret = new int[sum];
			while (max - 1 <= 2 * (min - 1)) {
				for (int i = 1; i <= K; i++) {
					ret[idx++] = i;
					vals[i]--;
				}
				if (max - 1 <= 2 * (vals[1] - 1)) {
					ret[idx++] = 1;
					vals[1]--;
				}
				min = Integer.MAX_VALUE;
				max = Integer.MIN_VALUE;
				for (int i = 1; i <= K; i++) {
					min = Math.min(min, vals[i]);
					max = Math.max(max, vals[i]);
				}
			}
			while (min > 0) {
				max--;
				min--;
				max = Math.min(max, 2 * min);
				for (int i = 1; i <= K; i++) {
					vals[i]--;
				}
				boolean[] dup = new boolean[K + 1];
				int firstDup = -1, lastDup = -1, lastNoDup = -1;;
				for (int i = 1; i <= K; i++) {
					if (vals[i] == min) lastNoDup = i;
					if (vals[i] > 2 * min && firstDup == -1) firstDup = i;
					if (vals[i] > 2 * min) lastDup = i;
				}
				for (int i = 1; i <= K; i++) {
					if (i < lastNoDup && vals[i] > min || vals[i] > 2 * min) {
						dup[i] = true;
						vals[i]--;
					}
				}
				if (!dup[1] && vals[1] > min) {
					vals[1]--;
					dup[1] = true;
				}
				for (int i = 1; i <= K; i++)
					if (dup[i]) {
						ret[idx++] = i;
					}
				for (int i = 1; i <= K; i++)
					if (!dup[i]) {
						ret[idx++] = i;
					}
				for (int i = 1; i <= K; i++)
					if (dup[i]) {
						ret[idx++] = i;
					}
				
				min = Integer.MAX_VALUE;
				max = Integer.MIN_VALUE;
				for (int i = 1; i <= K; i++) {
					min = Math.min(min, vals[i]);
					max = Math.max(max, vals[i]);
				}
			}
			
			for (int i = 0; i < sum; i++) {
				if (i > 0) {
					out.print(" ");
				}
				out.print(ret[i]);
			}
			out.println();
		} else {
			out.println(-1);
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
