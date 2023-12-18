
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arg = br.readLine().split(" ");
		long h = Long.parseLong(arg[0]);
		long w = Long.parseLong(arg[1]);
		long a = Long.parseLong(arg[2]);
		long b = Long.parseLong(arg[3]);
		Solver s = new Solver();

		System.out.print(s.solve(h, w, a, b));
	}

}

class Solver {
	long mod = 1000000007L;
	BigInteger modb = BigInteger.valueOf(mod);
	long factorials[] = new long[200001];

	void preComputeFacts() {

		int i = 200000;
		factorials[0] = 1;
		long temp = 1;
		for (int j = 1; j <= i; j++) {

			temp *= j;
			if (temp > mod) {
				temp %= mod;
			}
			factorials[j] = temp;

		}

	}

	long solve(long h, long w, long a, long b) {
		assert a <= h && b <= w : "failure";
		preComputeFacts();
		long sum = 0;
		for (long i = a + 1; i <= h; i++) {
			sum += perm(b - 1 + h - i, b - 1, h - i).multiply(perm(i - 1 + w - b - 1, i - 1, w - b - 1)).mod(modb)
					.longValue();
			if (sum > mod)
				sum %= mod;
		}
		return sum;

	}

	private BigInteger perm(long n, long a, long b) {
		return BigInteger.valueOf(factorials[(int) n])
				.multiply(BigInteger.valueOf(factorials[(int) a]).modInverse(modb))
				.multiply(BigInteger.valueOf(factorials[(int) b]).modInverse(modb)).mod(modb);
	}

}
