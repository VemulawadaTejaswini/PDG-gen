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
		// String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(str);
		if (str.length() == 1) {
			System.out.println(str);
		} else if (str.charAt(0) != '9') {
			System.out.println(9 * (str.length() - 1) + (str.charAt(0) - '0') - 1);
		} else {
			int cnt = 0;
			for (int i = 0; i < str.length() && cnt == 0; i++) {
				if (str.charAt(i) != '9')
					cnt++;
			}
			System.out.println(9 * str.length() - cnt);
		}
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
