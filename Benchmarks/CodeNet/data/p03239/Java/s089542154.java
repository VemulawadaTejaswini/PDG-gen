import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
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
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		T = Integer.parseInt(strArr[1]);
	}

	int T;
	int C = 0;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int c = Integer.parseInt(strArr[0]);
		int t = Integer.parseInt(strArr[1]);
		if (t <= T && (C == 0 || c < C))
			C = c;
	}

	public void solve() {
		if (C == 0)
			System.out.println("TLE");
		else
			System.out.println(C);

	}
}
