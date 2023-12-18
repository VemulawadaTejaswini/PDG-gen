import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

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

	String S;

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		S = str;
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	int K;

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		K = Integer.parseInt(str);
	}

	public void solve() {
		// System.out.println(S + " " + K);
		SubStr = new TreeSet<String>();
		SubStrPos = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < S.length(); i++) {
			putSubStrPos(S.substring(i, i + 1), i);
		}
		for (int ord = 1; ord < K; ord++) {
			String subs = getOrdStr(ord);
			for (int p : SubStrPos.get(subs)) {
				if (p + subs.length() + 1 <= S.length())
					putSubStrPos(S.substring(p, p + subs.length() + 1), p);
			}
		}
		// for (String s : SubStr) {
		// System.out.print(s + ":");
		// for (int p : SubStrPos.get(s))
		// System.out.print(" " + p);
		// System.out.println();
		// }
		System.out.println(getOrdStr(K));
	}

	TreeSet<String> SubStr;
	HashMap<String, ArrayList<Integer>> SubStrPos;

	private String getOrdStr(int ord) {
		String ret = "";
		int i = 0;
		for (String s : SubStr) {
			if (i == (ord - 1)) {
				ret = s;
				break;
			}
			i++;
		}
		return ret;
	}

	private void putSubStrPos(String subStr, int pos) {
		SubStr.add(subStr);
		if (!SubStrPos.containsKey(subStr))
			SubStrPos.put(subStr, new ArrayList<Integer>());
		SubStrPos.get(subStr).add(pos);
	}
}
