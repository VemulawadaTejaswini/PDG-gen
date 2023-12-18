import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
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
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		Nums = new ArrayDeque<Integer>();
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	ArrayDeque<Integer> Nums;

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0)
				Nums.addLast(Integer.parseInt(strArr[i]));
			else
				Nums.addFirst(Integer.parseInt(strArr[i]));
		}

		String sep = "";
		for (int i = 0; i < N; i++) {
			if (N % 2 == 0)
				System.out.print(sep + Nums.poll());
			else
				System.out.print(sep + Nums.pollLast());

			if ("".equals(sep))
				sep = " ";
		}
		System.out.println();
	}

	public void solve() {

	}
}
