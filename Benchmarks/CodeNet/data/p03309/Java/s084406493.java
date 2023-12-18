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
		A = new long[N];
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(strArr[i]);
		}
		cnt++;
	}

	long[] A;

	public void solve() {
		long sum = 0;
		for (int i = 0; i < N; i++) {
			sum += (A[i] - i - 1);
		}
		long b1 = sum / N;
		long ans1 = 0;
		for (int i = 0; i < N; i++) {
			ans1 += Math.abs(A[i] - (b1 + i + 1));
		}
		long b2 = b1;
		if (sum < 0)
			b2--;
		else
			b2++;
		long ans2 = 0;
		for (int i = 0; i < N; i++) {
			ans2 += Math.abs(A[i] - (b2 + i + 1));
		}
		if (ans1 < ans2)
			System.out.println(ans1);
		else
			System.out.println(ans2);

	}
}
