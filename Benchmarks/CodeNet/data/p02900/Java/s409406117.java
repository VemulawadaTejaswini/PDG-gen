import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		// solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split("\\s+");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		long A = Long.parseLong(strArr[0]);
		long B = Long.parseLong(strArr[1]);
		long a = A;
		HashSet<Long> ap = new HashSet<Long>();
		if (a % 2147483647L == 0) {
			a = a / 2147483647L;
			ap.add(2147483647L);
		}
		if (a % 6700417L == 0) {
			a = a / 6700417L;
			ap.add(6700417L);
		}
		for (long d = 2; a > 1;) {
			if (a % d == 0) {
				// System.out.println(a + " " + d);
				a = a / d;
				ap.add(d);
			} else
				d++;
		}
		long b = B;
		HashSet<Long> bp = new HashSet<Long>();
		if (b % 2147483647L == 0) {
			b = b / 2147483647L;
			bp.add(2147483647L);
		}
		if (b % 6700417L == 0) {
			b = b / 6700417L;
			bp.add(6700417L);
		}
		for (long d = 2; b > 1;) {
			if (b % d == 0) {
				// System.out.println(b + " " + d);
				b = b / d;
				bp.add(d);
			} else
				d++;
		}
		// System.out.println(ap);
		// System.out.println(bp);
		int ans = 1;
		for (long n : ap) {
			if (bp.contains(n))
				ans++;
		}
		System.out.println(ans);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {

	}
}
