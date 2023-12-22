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

	int S;
	long MOD = 1000000007L;
	long[] memo;

	Main(BufferedReader in) throws IOException {
		S = Integer.parseInt(in.readLine());
		int size = Math.max(6, S + 1);
		memo = new long[size];
		Arrays.fill(memo, -1);
		// 初期化
		memo[0] = 0;
		memo[1] = 0;
		memo[2] = 0;
		memo[3] = 1;
		memo[4] = 1;
		memo[5] = 1;
	}

	long getPattern(int val) {
		if (memo[val] >= 0) {
			return memo[val];
		} else {
			long result = 1L;
			for (int i = 3; i + 3 <= val; ++i) {
				result += getPattern(i);
				result %= MOD;
			}
			memo[val] = result;
			return memo[val];
		}
	}

	void calc() {
	}

	void showResult() {
		long result = getPattern(S);
		System.out.println(result);
	}
}