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
		String[] strArr = str.split("\\s+");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
		AC = new int[N + 1];
		WA = new int[N + 1];
	}

	int M;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < M;
	}

	int[] AC;
	int[] WA;

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		int p = Integer.parseInt(strArr[0]);
		if (AC[p] == 0) {
			if ("AC".equals(strArr[1]))
				AC[p] = 1;
			else {
				WA[p]++;
			}
		}
		cnt++;
	}

	public void solve() {
		int a = 0;
		int w = 0;
		for (int i = 1; i <= N; i++) {
			if (AC[i] > 0) {
				a++;
				w += WA[i];
			}
		}
		System.out.println(a + " " + w);
	}
}
