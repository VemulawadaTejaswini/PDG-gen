import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readA(in.readLine());
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
		A = new long[N];
	}

	long[] A;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readA(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		long L = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(strArr[i]);
			L += A[i];
		}
		long ans = Long.MAX_VALUE;
		long left = A[0];
		for (int i = 1; i < N; i++) {
			long pad;
			long right = L - left;
			long a = Math.abs(right - left);
			// System.out.println(left + " " + right + " " + a);
			if (a < ans)
				ans = a;
			left += A[i];
		}
		System.out.println(ans);
	}

	public void readBody(String str) {
		// System.out.println(str);
	}

	public void solve() {
	}
}
