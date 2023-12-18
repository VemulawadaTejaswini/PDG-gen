import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;
	int N;
	long[] A, B, temp;
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
		this.temp = Arrays.copyOf(A, A.length);
	}

	long getDivVal(long[] vals) {
		List<Long> targets = new ArrayList<>();
		for (int i = 0; i < vals.length; ++i) {
			targets.add(vals[i]);
		}
		targets = targets.stream().filter(x -> x > 1).sorted().collect(Collectors.toList());
		if(targets.isEmpty()) {
			return -1;
		}
		long divVal = -1;

		for (long i = 2; i <= targets.get(targets.size() - 1); ++i) {
			int count = 0;
			for (int j = 0; j < targets.size(); ++j) {
				if (targets.get(j) % i == 0) {
					++count;
				}
				if (count >= 2) {
					divVal = i;
					break;
				}
			}
		}
		if (divVal < 0) {
			return -1;
		}
		for (int i = 0; i < vals.length; ++i) {
			if (vals[i] % divVal == 0) {
				vals[i] /= divVal;
			}
		}
		return divVal;

	}

	List<Long> getDivVals(long[] vals) {
		List<Long> divVals = new ArrayList<>();
		while (true) {
			long divVal = getDivVal(vals);
			if (divVal > 0) {
				divVals.add(divVal);
			} else {
				break;
			}
		}
		return divVals;
	}

	void calc() {
		// 最小公倍数と最大公約数を求める
		lcm = lcm(this.temp);
		// Bの一覧を求める
		for (int i = 0; i < N; ++i) {
			B[i] = (lcm * inv(A[i])) % MOD;
		}
	}

	long lcm(long[] vals) {
		List<Long> divVals = getDivVals(vals);
		long result = 1;
		for (int i = 0; i < vals.length; ++i) {
			result *= vals[i];
			result %= MOD;
		}
		for (int i = 0; i < divVals.size(); ++i) {
			result *= divVals.get(i);
			result %= MOD;
		}
		return result;
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