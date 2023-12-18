import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readH(in.readLine());
		solver.readW(in.readLine());
		solver.readN(in.readLine());
		// solver.readHead(in.readLine());
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
		H = Integer.parseInt(str);
	}

	public void readW(String str) {
		W = Integer.parseInt(str);
	}

	int H;
	int W;

	public void readN(String str) {
		N = Integer.parseInt(str);
		int ans = 0;
		int cntH = 0;
		int cntV = 0;
		for (int p = 0; p < N; ans++) {
			if (H - cntH > W - cntV) {
				p += (H - cntH);
				cntV++;
			} else {
				p += (W - cntV);
				cntH++;
			}
		}
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
