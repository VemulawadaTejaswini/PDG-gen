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
	List<Integer> shifts;

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

		shifts = new ArrayList<>();
		for (int i = 0; i < K; ++i) {
			for (int j = L[i]; j <= R[i]; ++j) {
				shifts.add(j);
			}
		}
		Collections.sort(shifts);
	}

	void calc() {
		for (int i = 1; i < N; ++i) {
			for (int j = 0; j < shifts.size(); ++j) {
				int shift = shifts.get(j);
				if (i - shift < 0) {
					break;
				}
				memo[i] += memo[i - shift];
				memo[i] %= MOD;
			}
			memo[i] %= MOD;
		}
		System.out.println(memo[N - 1]);
	}

	void showResult() {
	}
}