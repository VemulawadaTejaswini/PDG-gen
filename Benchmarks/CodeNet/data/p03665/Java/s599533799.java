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
	int P;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		P = Integer.parseInt(strArr[1]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int evenCnt = 0;
		int oddCnt = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(strArr[i]);
			if (a % 2 == 0)
				evenCnt++;
			else
				oddCnt++;
		}
		// System.out.println(evenCnt + " " + oddCnt);

		if (P == 1 && evenCnt == 0) {
			System.out.println(0);
			return;
		}

		long evenCombi = 0;
		for (int i = 0; i <= evenCnt; i++) {
			evenCombi += combin(evenCnt, i);
		}
		long oddCombi = 0;
		for (int i = 0; i <= oddCnt; i++) {
			if (i % 2 == P)
				oddCombi += combin(oddCnt, i);
		}
		long ans = evenCombi * oddCombi;

		System.out.println(ans);

	}

	private long combin(int t, int c) {
		if (t == c)
			return (1);
		else if (c == 0)
			return (1);
		else if (c == 1)
			return (t);
		return (combin(t - 1, c - 1) + combin(t - 1, c));
	}

	public void solve() {

	}
}
