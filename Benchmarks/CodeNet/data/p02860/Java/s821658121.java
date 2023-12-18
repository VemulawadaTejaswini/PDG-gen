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

	public void readS(String str) {
		if (str.length() % 2 != 0) {
			System.out.println("No");
			return;
		}
		String a = str.substring(0, str.length() / 2);
		String b = str.substring(str.length() / 2);
		// System.out.println(a);
		// System.out.println(b);
		if (a.equals(b))
			System.out.println("Yes");
		else
			System.out.println("No");
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
