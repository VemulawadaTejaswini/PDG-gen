import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt() - 2;
		values = new long[N];
		long ans = sc.nextLong();
		for (int i = 0; i < N; i++) {
			values[i] = sc.nextLong();
		}
		ans += sc.nextLong();
		recurse((1 << N) - 1, (1 << N) - 1, 0, 0, false);
		ans += best;
		out.println(ans);
		
		out.flush();
	}
	
	static long best = Long.MAX_VALUE, sum = 0;
	static long[] values;
	static int N;
	
	static void recurse(int remainingMask, int availableMask, int myMask, int pos, boolean gotLast) {
		//System.err.println(remainingMask + " " + availableMask + " " + myMask + ", pos: " +  pos + " " + gotLast + " ==>>> " + sum + " | " + Arrays.toString(values));
		if (remainingMask == 0) {
			best = Math.min(best, sum);
			return;
		}
		if (pos == N) {
			if (myMask == 0) return;
			int nextRemainingMask = remainingMask & ~myMask, nextAvailableMask = 0;
			int prev = -1;
			long toNext = -1;
			for (int i = 0; i < N; i++) if (contains(remainingMask, i)) {
				boolean used = contains(myMask, i);
				if (used) {
					if (prev == -1) {
						sum += values[i];
					} else {
						values[prev] += values[i];
						nextAvailableMask |= (1 << prev);
					}
					toNext = values[i];
				} else {
					if (toNext != -1) {
						values[i] += toNext;
						nextAvailableMask |= (1 << i);
						toNext = -1;
					}
				}
				prev = i;
			}
			if (toNext != -1) {
				sum += toNext;
			}
			recurse(nextRemainingMask, nextAvailableMask, 0, 0, false);
			prev = -1;
			toNext = -1;
			for (int i = 0; i < N; i++) if (contains(remainingMask, i)) {
				boolean used = contains(myMask, i);
				if (used) {
					if (prev == -1) {
						sum -= values[i];
					} else {
						values[prev] -= values[i];
					}
					toNext = values[i];
				} else {
					if (toNext != -1) {
						values[i] -= toNext;
						toNext = -1;
					}
				}
				prev = i;
			}
			if (toNext != -1) {
				sum -= toNext;
			}
			return;
		}
		if (contains(remainingMask, pos)) {
			if (!gotLast && contains(availableMask, pos)) recurse(remainingMask, availableMask, myMask | (1<<pos), pos + 1, true);
			recurse(remainingMask, availableMask, myMask, pos + 1, false);
		} else {
			recurse(remainingMask, availableMask, myMask, pos + 1, gotLast);
		}
	}
	
	static boolean contains(int mask, int pos) {
		return (mask & (1 << pos)) != 0;
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
