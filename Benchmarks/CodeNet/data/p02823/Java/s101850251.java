import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		long n = Long.parseLong(strArr[0]);
		long a = Long.parseLong(strArr[1]);
		long b = Long.parseLong(strArr[2]);

		long ans = 0;
		long v = 0;

		ans = b - 1;
		v = n - a;
		if (ans > v)
			ans = v;

		if ((b - a) % 2 == 0) {
			v = (b - a) / 2;
			if (ans > v)
				ans = v;
		} else {
			v = (a - 1) + 1 + ((b - a - 1) / 2);
			if (ans > v)
				ans = v;
			v = (n - b) + 1 + ((b - a - 1) / 2);
			if (ans > v)
				ans = v;
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
