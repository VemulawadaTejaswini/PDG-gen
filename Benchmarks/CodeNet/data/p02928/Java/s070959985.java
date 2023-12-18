import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		Long K = Long.parseLong(tokens[1]);
		int[] A = new int[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		long[] upperNums = new long[N];
		long[] beforeUpperNums = new long[N];
		Arrays.fill(upperNums, 0L);
		Arrays.fill(beforeUpperNums, 0L);
		for (int i = 0; i < N; ++i) {
			int val = A[i];
			for (int j = 0; j <= i - 1; ++j) {
				if (val > A[j]) {
					++beforeUpperNums[j];
				}
			}
			for (int j = i + 1; j < N; ++j) {
				if (val > A[j]) {
					++upperNums[i];
				}
			}
		}
		long result = 0;
		long MOD = 1000000007L;
		long addVal = (K * (K + 1) / 2) % MOD;
		for (int i = 0; i < N; ++i) {
			result += upperNums[i] * addVal;
			result %= MOD;
		}
		addVal = (K * (K - 1) / 2) % MOD;
		for (int i = 0; i < N; ++i) {
			result += beforeUpperNums[i] * addVal;
			result %= MOD;
		}
		System.out.println(result);

	}
}