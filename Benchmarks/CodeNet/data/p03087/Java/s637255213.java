import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readS(in.readLine());
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
		Q = Integer.parseInt(strArr[1]);
	}

	int Q;

	public void readS(String str) {
		CNT = new int[N + 1];
		CNT[1] = 0;
		for (int i = 1; i < N; i++) {
			CNT[i + 1] = CNT[i];
			if (str.charAt(i - 1) == 'A' && str.charAt(i) == 'C') {
				CNT[i + 1]++;
			}
		}
	}

	int[] CNT;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < Q;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int l = Integer.parseInt(strArr[0]);
		int r = Integer.parseInt(strArr[1]);
		System.out.println((CNT[r] - CNT[l]));
		cnt++;
	}

	public void solve() {

	}
}
