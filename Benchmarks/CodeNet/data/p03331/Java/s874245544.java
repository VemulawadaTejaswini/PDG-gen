import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
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
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int ans = Integer.MAX_VALUE;
		for (int a = 1; a < N - 1; a++) {
			int ds = digtsum(a) + digtsum(N - a);
			if (ds < ans)
				ans = ds;
		}
		System.out.println(ans);
	}

	private int digtsum(int num) {
		int ans = 0;
		for (int n = num; n > 0; n /= 10) {
			ans += n % 10;
		}
		return ans;
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
