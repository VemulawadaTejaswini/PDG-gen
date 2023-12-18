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
	// int N;
	int cnt;

	public void init() {
		// N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);
		if (N >= 3 && M >= 3) {
			System.out.println((N - 2) * (M - 2));
			return;
		}
		if (N == 2 || M == 2) {
			System.out.println(0);
			return;
		}
		if (N == 1) {
			if (M == 1)
				System.out.println(1);
			else if (M == 2)
				System.out.println(0);
			else
				System.out.println(M - 2);
			return;
		}

		if (M == 1) {
			if (N == 1)
				System.out.println(1);
			else if (N == 2)
				System.out.println(0);
			else
				System.out.println(N - 2);
			return;
		}
	}

	public boolean hasNext() {
		// return cnt < N;
		return false;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
	}
}
