import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;
	int N;
	long[] A, B;
	long gcd, lcm;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		this.B = new long[N];
	}

	void calc() {
		// 最小公倍数と最大公約数を求める
		gcd = A[0];
		lcm = A[0];
		for (int i = 1; i < N; ++i) {
			gcd = gcd(lcm, A[i]) % MOD;
			lcm = (lcm * A[i] * inv(gcd)) % MOD;
		}
		// Bの一覧を求める
		for (int i = 0; i < N; ++i) {
			B[i] = (lcm * inv(A[i])) % MOD;
		}
	}

	long gcd(long large, long small) {
		if (small > large) {
			return gcd(small, large);
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}

	void showResult() {
		long result = 0L;
		for (int i = 0; i < N; ++i) {
			result += B[i];
			result %= MOD;
		}
		System.out.println(lcm + ", " + gcd);
		System.out.println(result);
	}

	static long inv(long val) {
		long result = 1L;
		long k = MOD - 2L;
		long y = val;
		while (k != 0) {
			if ((k & 1L) > 0) {
				result = (result * y) % MOD;
			}
			y = (y * y) % MOD;
			k /= 2;
		}
		return result;

	}
}
