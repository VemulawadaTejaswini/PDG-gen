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
	String[] pass;

	public void init() {
		N = 0;
		cnt = 0;
		pass = new String[2];
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < 2;
	}

	public void readBody(String str) {
		pass[cnt] = str;
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
		for (int i = 0; i < pass[0].length(); i++) {
			System.out.print(pass[0].charAt(i));
			if (i < pass[1].length())
				System.out.print(pass[1].charAt(i));
		}
		System.out.println();
	}
}
