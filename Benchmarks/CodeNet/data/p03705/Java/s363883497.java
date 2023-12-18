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
		int n = Integer.parseInt(strArr[0]);
		int a = Integer.parseInt(strArr[1]);
		int b = Integer.parseInt(strArr[2]);
		System.out.println(cal(n, a, b));
	}

	private long cal(int n, int a, int b) {
		if (a > b)
			return 0;
		if (n < 1)
			return 0;
		if (n == 1 && a != b)
			return 0;
		if (n <= 2)
			return 1;
		return 2 * (long) b - 2 * (long) a + 1;
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}
}
