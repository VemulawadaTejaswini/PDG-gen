import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

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
		Match = new ArrayList<Deque<Integer>>();
		for (int i = 0; i <= N; i++) {
			Match.add(new LinkedList<Integer>());
		}

	}

	ArrayList<Deque<Integer>> Match;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		for (int i = 0; i < N - 1; i++) {
			Match.get(cnt + 1).add(Integer.parseInt(strArr[i]));
		}
		cnt++;
	}

	public void solve() {
		int ans = 1;
		HashSet<Integer> matched = new HashSet<Integer>();
		for (;;) {
			// System.out.println(Match);
			int cnt = 0;
			for (int i = 1; i <= N; i++) {
				cnt += Match.get(i).size();
			}
			if (cnt == 0)
				break;
			boolean ok = false;
			matched.clear();
			for (int i = 1; i <= N; i++) {
				if (matched.contains(i))
					continue;
				if (Match.get(i).size() < 1)
					continue;
				int aite = Match.get(i).peek();
				if (Match.get(aite).peek() == i) {
					matched.add(i);
					matched.add(aite);
					Match.get(i).poll();
					Match.get(aite).poll();
					ok = true;
				}
			}
			if (ok)
				ans++;
			else {
				ans = -1;
				break;
			}
		}
		System.out.println(ans);
	}
}
