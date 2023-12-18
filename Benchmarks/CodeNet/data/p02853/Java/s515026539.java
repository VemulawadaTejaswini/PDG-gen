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
		int X = Integer.parseInt(strArr[0]);
		int Y = Integer.parseInt(strArr[1]);
		int ans = 0;
		if (X == 1)
			ans += 300000;
		else if (X == 2)
			ans += 200000;
		else if (X == 3)
			ans += 100000;
		if (Y == 1)
			ans += 300000;
		else if (Y == 2)
			ans += 200000;
		else if (Y == 3)
			ans += 100000;
		if (X == 1 && Y == 1)
			ans += 400000;
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
