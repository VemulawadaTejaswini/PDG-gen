import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readP(in.readLine());
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
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public void readP(String str) {
		String[] strArr = str.split("\\s+");
		int cnt = 0;
		for (int i = 1; i < N - 1; i++) {
			int a = Integer.parseInt(strArr[i - 1]);
			int b = Integer.parseInt(strArr[i]);
			int c = Integer.parseInt(strArr[i + 1]);
			if ((a < b && b < c) || (a > b && b > c))
				cnt++;
		}
		System.out.println(cnt);
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
