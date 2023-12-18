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
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.readX(in.readLine());
		solver.solve();
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
		Total = 0;
		Song = new HashMap<String, Integer>();
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int Total;
	HashMap<String, Integer> Song;

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		Total += Integer.parseInt(strArr[1]);
		Song.put(strArr[0], Total);
		cnt++;
	}

	public void readX(String str) {
		System.out.println(Total - Song.get(str));
	}

	public void solve() {

	}
}
