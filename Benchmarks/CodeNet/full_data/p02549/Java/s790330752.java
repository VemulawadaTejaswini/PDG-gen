import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N, K;
	int[] L, R;
	long MOD = 998244353L;
	long[] memo;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		L = new int[K];
		R = new int[K];
		for (int i = 0; i < K; ++i) {
			tokens = in.readLine().split(" ");
			L[i] = Integer.parseInt(tokens[0]);
			R[i] = Integer.parseInt(tokens[1]);
		}
		memo = new long[N];
		Arrays.fill(memo, 0L);
		memo[0] = 1L;
	}

	void calc() {
		long[] diffs = new long[N];
		Arrays.fill(diffs, 0L);
		diffs[1] = -1L;
		for (int i = 0; i + 1 < N; ++i) {
			for (int k = 0; k < K; ++k) {
				int l = i + L[k];
				int r = i + R[k] + 1;
				if (l < N) {
					diffs[l] += memo[i];
				}
				if (r < N) {
					diffs[r] -= memo[i];
				}
			}
			memo[i + 1] = memo[i] + diffs[i + 1];
			memo[i + 1] += MOD;
			memo[i + 1] %= MOD;
		}
	}

	void showResult() {
		System.out.println(memo[N - 1]);
	}
}
