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

	int N;
	long[] A;
	long[] sums;
	long MOD = 1000000007L;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}

		sums = new long[N];
		sums[N - 1] = A[N - 1];
		for (int i = N - 2; i >= 0; --i) {
			sums[i] = sums[i + 1] + A[i];
			sums[i] %= MOD;
		}
	}

	void calc() {
		long result = 0;
		for (int i = 0; i + 1 < N; ++i) {
			result += A[i] * sums[i + 1];
			result %= MOD;
		}
		System.out.println(result);
	}

	void showResult() {
	}
}
