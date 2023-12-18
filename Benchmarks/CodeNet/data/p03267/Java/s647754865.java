import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long L;
		L = sc.nextLong();
		solve(L);
	}

	static void solve(long L) {
		StringBuilder sb = new StringBuilder();
		long n = 0;
		long a = 1;
		while (a <= L) {
			a *= 2;
			n++;
		}
		a /= 2;

		sb.append(n).append(" ");
		List<long[]> es = new ArrayList<>();
		int b = 1;
		for (long i = 1; i < n; i++) {
			es.add(new long[]{i, i + 1, 0});
			es.add(new long[]{i, i + 1, b});
			b *= 2;
		}

		long x = 1;
		long t = n - 1;
		for (int i = 0; i < t; i++) {
			x *= 2;
		}


		while (t >= 0) {
			if (L - x >= a) {
				es.add(new long[]{t + 1, n, L - x});
				L -= x;
			}
			x /= 2;
			t--;
		}

		sb.append(es.size()).append("\n");
		for (int i = 0; i < es.size(); i++) {
			sb.append(es.get(i)[0]).append(" ")
					.append(es.get(i)[1]).append(" ")
					.append(es.get(i)[2]).append("\n");
		}

		System.out.print(sb.toString());
	}
}
