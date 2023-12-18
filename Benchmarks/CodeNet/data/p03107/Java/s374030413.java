import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		// System.out.println(N);
		ArrayList<Integer> cube = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				cube.add(1);
			else
				cube.add(0);
		}

		for (int idx = 0; cube.size() > idx + 1;) {
			if (cube.get(idx) != cube.get(idx + 1)) {
				cube.remove(idx);
				cube.remove(idx);
				idx--;
				if (idx < 0)
					idx = 0;
			} else
				idx++;
		}
		System.out.println(str.length() - cube.size());

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
