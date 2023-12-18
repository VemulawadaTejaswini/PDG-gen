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
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		int cntEAll = 0;
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) == 'E')
				cntEAll++;
		}
		int ans = N;
		int cntE = 0;
		for (int i = 0; i < N; i++) {
			int turn = N;
			if (str.charAt(i) == 'E') {
				turn = (i - cntE) + (cntEAll - cntE - 1);
				cntE++;
			} else {
				turn = (i - cntE) + (cntEAll - cntE);
			}
			if (turn < ans)
				ans = turn;
		}
		System.out.println(ans);
		cnt++;
	}

	public void solve() {

	}
}
