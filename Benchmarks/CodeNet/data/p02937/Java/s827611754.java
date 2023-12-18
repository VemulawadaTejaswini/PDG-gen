import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		// String[] strArr = str.split("\\s+");
		// System.out.println(N);
		s = str;
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		t = str;
	}

	String s;
	String t;

	public void solve() {
		HashMap<Character, ArrayList<Long>> sTab = new HashMap<Character, ArrayList<Long>>();
		for (char c = 'a'; c <= 'z'; c++)
			sTab.put(c, new ArrayList<Long>());
		for (int i = 0; i < s.length(); i++)
			sTab.get(s.charAt(i)).add((long) (i + 1));
		// for (char c : sTab.keySet())
		// System.out.println(c + " " + sTab.get(c));
		long idx = 0;
		for (int i = 0; i < t.length(); i++) {
			idx++;
			char c = t.charAt(i);
			if (sTab.get(c).size() < 1) {
				idx = -1;
				break;
			}
			long idxS = 0;
			for (long j : sTab.get(c)) {
				if (j >= idx % s.length()) {
					idxS = j;
					break;
				}
			}
			if (idxS > 0) {
				idx = (idx / s.length()) * s.length() + idxS;
			} else {
				idx = (idx / s.length() + 1) * s.length() + sTab.get(c).get(0);
			}
		}
		System.out.println(idx);
	}

}
