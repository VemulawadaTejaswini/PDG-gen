import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

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
		// String[] strArr = str.split("\\s+");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		HashMap<Character, Integer> hist = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (hist.containsKey(c)) {
				hist.put(c, hist.get(c) + 1);
			} else {
				hist.put(c, 1);
			}
		}
		if (hist.size() == 2 && hist.get(str.charAt(0)) == 2)
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
