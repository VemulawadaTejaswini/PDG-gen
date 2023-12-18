import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.read1(in.readLine());
		solver.read2(in.readLine());
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

	public void read1(String str) {
		String[] strArr = str.split("\\s+");
		m1 = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	int m1;

	public void read2(String str) {
		String[] strArr = str.split("\\s+");
		int m2 = Integer.parseInt(strArr[0]);
		if (m1 == m2)
			System.out.println("0");
		else
			System.out.println("1");
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
