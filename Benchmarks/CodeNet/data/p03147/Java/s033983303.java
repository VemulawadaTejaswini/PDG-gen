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
		h = new int[N];
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++)
			h[i] = Integer.parseInt(strArr[i]);

	}

	int[] h;

	public void solve() {
		int ans = 0;
		for (;;) {
			// for (int i = 0; i < N; i++)
			// System.out.print(" " + h[i]);
			// System.out.println();

			int l = 0;
			for (; l < N && h[l] <= 0; l++) {
			}
			if (l >= N)
				break;

			ans++;
			for (int r = l; r < N; r++) {
				if (h[r] > 0)
					h[r]--;
				else
					break;
			}

		}

		System.out.println(ans);
	}
}
