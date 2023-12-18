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
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int A = Integer.parseInt(strArr[0]);
		int B = Integer.parseInt(strArr[1]);
		int C = Integer.parseInt(strArr[2]);
		int X = Integer.parseInt(strArr[3]);
		int Y = Integer.parseInt(strArr[4]);
		int ans = Integer.MAX_VALUE;
		for (int c = 0; c / 2 <= X || c / 2 <= Y; c += 2) {
			int amt = 0;
			if (c / 2 < X) {
				amt += ((X - c / 2) * A);
			}
			if (c / 2 < Y) {
				amt += ((Y - c / 2) * B);
			}
			amt += c * C;
			if (amt < ans)
				ans = amt;
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
