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

		long r1 = 0;
		long r2 = 0;
		if (a > b) {
			r1 = a - 1;
			r2 = n - b;
		} else {
			r1 = b - 1;
			r2 = n - a;
		}
		if (r1 > r2)
			r1 = r2;
		if ((a - b) % 2 == 0) {
			if (a > b) {
				r2 = (a - b) / 2;
			} else {
				r2 = (b - a) / 2;
			}
			if (r1 > r2)
				r1 = r2;
		}
		System.out.println(r1);
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
