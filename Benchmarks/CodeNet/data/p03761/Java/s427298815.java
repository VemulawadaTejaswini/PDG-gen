import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

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
	String[] S;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		S = new String[N];
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		S[cnt] = str;
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
		TreeMap<Character, Integer> cmapShare = calcMap(S[0]);
		for (int i = 1; i < N; i++) {
			TreeMap<Character, Integer> cmap = calcMap(S[i]);
			for (char c : cmapShare.keySet()) {
				if (cmap.containsKey(c)) {
					if (cmapShare.get(c) > cmap.get(c))
						cmapShare.put(c, cmap.get(c));
				} else {
					cmapShare.put(c, 0);
				}
			}
		}
		for (char c : cmapShare.keySet()) {
			for (int i = 0; i < cmapShare.get(c); i++) {
				System.out.print(c);
			}
		}
		System.out.println();
	}

	private TreeMap<Character, Integer> calcMap(String str) {
		TreeMap<Character, Integer> cmap = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (cmap.containsKey(c))
				cmap.put(c, cmap.get(c) + 1);
			else
				cmap.put(c, 1);
		}
		return cmap;
	}
}
