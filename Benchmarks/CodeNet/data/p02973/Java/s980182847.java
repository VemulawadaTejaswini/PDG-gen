import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
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
		NumList = new LinkedBlockingDeque<Integer>();
	}

	public boolean hasNext() {
		return cnt < N;
	}

	Deque<Integer> NumList;

	public void readBody(String str) {
		// System.out.println(str);
		NumList.addLast(Integer.parseInt(str));
		cnt++;
	}

	public void solve() {
		int ans = 0;
		for (; !NumList.isEmpty();) {
			// for (int n : NumList)
			// System.out.print(n + " ");
			// System.out.println();

			ans++;
			int lastNum = NumList.pollLast();
			Deque<Integer> next = new LinkedBlockingDeque<Integer>();
			for (; !NumList.isEmpty();) {
				int n = NumList.pollLast();
				if (n >= lastNum)
					next.addFirst(n);
			}
			NumList = next;
		}
		System.out.println(ans);
	}
}
