import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

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
	int M;
	int cnt;

	public void init() {
		N = 0;
		M = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < M + 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		if (cnt == 0) {
			P = new int[N + 1];
			SwapTab = new HashMap<Integer, HashSet<Integer>>();
			String[] strArr = str.split(" ");
			for (int i = 0; i < N; i++) {
				P[i + 1] = Integer.parseInt(strArr[i]);
			}
		} else {
			String[] strArr = str.split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			addSwapTab(a, b);
			addSwapTab(b, a);
		}
		cnt++;
	}

	private int[] P;
	private HashMap<Integer, HashSet<Integer>> SwapTab;

	private void addSwapTab(int left, int right) {
		if (!SwapTab.containsKey(left))
			SwapTab.put(left, new HashSet<Integer>());
		SwapTab.get(left).add(right);
	}

	public void solve() {
		// print();
		int ans = 0;
		Path = new HashSet<Integer>();
		for (int i = 1; i <= N; i++) {
			Path.clear();
			if (i == P[i] || isSwapable(i, P[i])) {
				ans++;
			}
		}
		// print();
		System.out.println(ans);
	}

	HashSet<Integer> Path;

	private boolean isSwapable(int left, int right) {
		if (!SwapTab.containsKey(left))
			return false;
		if (SwapTab.get(left).contains(right))
			return true;

		boolean ans = false;
		Path.add(left);
		for (int nextLeft : SwapTab.get(left)) {
			if (Path.contains(nextLeft))
				continue;
			ans = isSwapable(nextLeft, right);
			if (ans)
				break;
		}
		Path.remove(left);
		if (ans) {
			addSwapTab(left, right);
			addSwapTab(right, left);
		}
		return ans;
	}

	private void print() {
		for (int i = 1; i <= N; i++)
			System.out.print(" " + P[i]);
		System.out.println();
		for (int left : SwapTab.keySet()) {
			System.out.print(left + ":");
			for (int num : SwapTab.get(left))
				System.out.print(" " + num);
			System.out.println();
		}
	}

}
