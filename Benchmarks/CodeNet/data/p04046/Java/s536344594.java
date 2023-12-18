
import java.io.BufferedReader;
import java.io.InputStreamReader;

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

	long solve(long h, long w, long a, long b) {
		assert a <= h && b <= w : "failure";
		long[] ways = new long[(int) (h - a)];
		long sum = 0;
		for (long i = a + 1; i <= h; i++) {
			ways[(int) (i - a - 1)] = perm(b - 1 + h - i, b - 1, h - i) * perm(i - 1 + w - b - 1, i - 1, w - b - 1);
		}
		for (long i : ways) {
			sum += i;
			if (sum > mod)
				sum -= mod;
		}
		return sum;

	}

	long fact(long a) {
		long fac = 1;
		if (a <= 1)
			return fac;
		while (a > 0) {
			fac *= a;
			a--;
			if (fac >= mod)
				fac %= mod;
		}
		return fac;
	}

	private long perm(long n, long a, long b) {
		return fact(n) / (fact(a) * fact(b));
	}

}
