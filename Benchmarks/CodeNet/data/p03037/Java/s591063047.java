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
		M = Integer.parseInt(strArr[1]);
		L = 1;
		R = N;
	}

	int M;
	int L;
	int R;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < M;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int l = Integer.parseInt(strArr[0]);
		int r = Integer.parseInt(strArr[1]);
		if (l > L)
			L = l;
		if (r < R)
			R = r;
		cnt++;
	}

	public void solve() {
		int ans = 0;
		if (L <= R)
			ans = R - L + 1;
		System.out.println(ans);

	}
}
