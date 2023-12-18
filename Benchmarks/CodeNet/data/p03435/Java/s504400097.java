import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		// solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;
	int[][] C;

	public void init() {
		N = 0;
		cnt = 0;
		C = new int[3][3];
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 3;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		for (int i = 0; i < 3; i++)
			C[cnt][i] = Integer.parseInt(strArr[i]);
		cnt++;
	}

	public void solve() {
		if (judge())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private boolean judge() {
		if (C[0][1] - C[0][0] != C[1][1] - C[1][0])
			return false;
		if (C[0][1] - C[0][0] != C[2][1] - C[2][0])
			return false;
		if (C[0][2] - C[0][0] != C[1][2] - C[1][0])
			return false;
		if (C[0][2] - C[0][0] != C[2][2] - C[2][0])
			return false;
		if (C[1][0] - C[0][0] != C[1][1] - C[0][1])
			return false;
		if (C[1][0] - C[0][0] != C[1][2] - C[0][2])
			return false;
		if (C[2][0] - C[0][0] != C[2][1] - C[0][1])
			return false;
		if (C[2][0] - C[0][0] != C[2][2] - C[0][2])
			return false;
		return true;
	}
}
