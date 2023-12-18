import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readL(in.readLine());
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

	public void readL(String str) {
		String[] strArr = str.split("\\s+");
		HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int l = Integer.parseInt(strArr[i]);
			if (hist.containsKey(l))
				hist.put(l, hist.get(l) + 1);
			else
				hist.put(l, 1);
		}

		// for (int l : hist.keySet())
		// System.out.println(l + " " + hist.get(l));
		int[] side = new int[hist.size()];
		int idx = 0;
		for (int l : hist.keySet()) {
			side[idx] = l;
			idx++;
		}
		Arrays.sort(side);
		long ans = 0;
		// 三辺の長さが異なる三角形
		for (int a = 0; a < hist.size() - 2; a++) {
			for (int b = a + 1; b < hist.size() - 1; b++) {
				for (int c = b + 1; c < hist.size(); c++) {
					if (side[a] + side[b] <= side[c])
						break;
					ans += ((long) hist.get(side[a]) * (long) hist.get(side[b]) * (long) hist.get(side[c]));
				}
			}
		}

		// 正三角形を除く二等辺三角形
		for (int a = 0; a < hist.size() - 1; a++) {
			for (int b = a + 1; b < hist.size(); b++) {
				ans += (long) hist.get(side[a]) * (long) hist.get(side[b]) * ((long) hist.get(side[b]) - 1) / 2;
				if (side[a] + side[a] > side[b])
					ans += (long) hist.get(side[b]) * (long) hist.get(side[a]) * ((long) hist.get(side[a]) - 1) / 2;
			}
		}

		// 正三角形
		for (int a = 0; a < hist.size(); a++)
			ans += (long) hist.get(side[a]) * ((long) hist.get(side[a]) - 1) * ((long) hist.get(side[a]) - 2) / 6;

		System.out.println(ans);
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
