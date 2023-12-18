import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readRSP(in.readLine());
		solver.readT(in.readLine());
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
		K = Integer.parseInt(strArr[1]);
	}

	public void readRSP(String str) {
		String[] strArr = str.split("\\s+");
		R = Integer.parseInt(strArr[0]);
		S = Integer.parseInt(strArr[1]);
		P = Integer.parseInt(strArr[2]);
	}

	int K;
	int R;
	int S;
	int P;

	public void readT(String str) {
		int ans = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < N; i++) {
			if (i >= K && arr[i] == arr[i - K]) {
				arr[i] = 'x';
				continue;
			}
			if (arr[i] == 'r')
				ans += P;
			else if (arr[i] == 's')
				ans += R;
			else if (arr[i] == 'p')
				ans += S;
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
