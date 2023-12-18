import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readH(in.readLine());
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

	public void readH(String str) {
		if (N == 1) {
			System.out.println(0);
			return;
		}

		String[] strArr = str.split("\\s+");
		H = new int[N];
		for (int i = 0; i < N; i++)
			H[i] = Integer.parseInt(strArr[i]);

		int cnt = 0;
		int max = 0;
		for (int i = N - 2; i >= 0; i--) {
			if (H[i] >= H[i + 1]) {
				cnt++;
				if (cnt > max)
					max = cnt;

			} else {
				cnt = 0;
			}
		}
		System.out.println(max);
	}

	int[] H;

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
