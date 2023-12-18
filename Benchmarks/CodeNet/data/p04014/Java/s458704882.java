import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long s = Long.parseLong(br.readLine());
		Solver sol = new Solver();
		System.out.println(sol.solve(n, s));
	}

}

class Solver {

	long solve(long n, long s) {
		long temp;
		if (s > n)
			return -1;
		if (s == n)
			return n + 1;
		for (long b = 2; b * b <= n; b++) {
			if (findSum(b, n) == s) {
				return b;
			}
		}

		for (long i = (long) Math.sqrt(n) - 1; i >= 1; i--) {
			temp = ((n - s) / i) + 1;
			if (temp > 1 && findSum(temp, n) == s) {
				return temp;
			}
		}
		return -1L;
	}

	long findSum(long b, long n) {
		long temp = 0L;
		while (n >= b) {
			temp += n % b;
			n /= b;
		}
		return temp + n;

	}

}
