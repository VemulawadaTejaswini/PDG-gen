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
		Arrays.fill(memo, -1L);
		memo[0] = 1L;

		shifts = new ArrayList<>();
		for (int i = 0; i < K; ++i) {
			for (int j = L[i]; j <= R[i]; ++j) {
				shifts.add(j);
			}
		}
		Collections.sort(shifts);
	}

	long get(int index) {
		if (memo[index] >= 0) {
			return memo[index];
		} else {
			long result = 0L;
			for (int i = 0; i < shifts.size(); ++i) {
				int shift = shifts.get(i);
				int prev = index - shift;
				if (prev >= 0) {
					result += get(prev);
					result %= MOD;
				}
			}
			memo[index] = result;
			return result;
		}
	}

	void calc() {
		System.out.println(get(N - 1));
	}

	void showResult() {
	}
}