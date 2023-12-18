import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
		String[] strArr = str.split("\\s+");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
		KeyCnt = new int[N + 1];
		Keys = new ArrayList<Key>();
	}

	int M;
	int[] KeyCnt;

	public boolean hasNext() {
		return cnt < M * 2;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		if (cnt % 2 == 0) {
			Key key = new Key(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
			Keys.add(cnt / 2, key);
		} else {
			Key key = Keys.get(cnt / 2);
			for (int i = 0; i < key.b; i++) {
				key.c[i] = Integer.parseInt(strArr[i]);
			}
		}
		cnt++;
	}

	public void solve() {
		int ans = 0;
		for (Key key : Keys) {
			for (int idx : key.c) {
				KeyCnt[idx]++;
			}
			ans += key.a;
		}
		if (!chkKeyCnt()) {
			System.out.println(-1);
			return;
		}
		// printKeyCnt();
		// System.out.println(KeyCntToString());
		mem = new HashMap<Integer, HashMap<String, Integer>>();
		int cut = chk(0);
		ans -= cut;
		System.out.println(ans);
	}

	HashMap<Integer, HashMap<String, Integer>> mem;

	private int chk(int idx) {
		if (idx >= M)
			return 0;
		String strKeyCnt = KeyCntToString();
		if (mem.containsKey(idx) && mem.get(idx).containsKey(strKeyCnt)) {
			return mem.get(idx).get(strKeyCnt);
		}
		Key key = Keys.get(idx);
		boolean excludable = true;
		for (int i : key.c) {
			if (KeyCnt[i] <= 1) {
				excludable = false;
				break;
			}
		}
		int res = 0;
		if (excludable) {
			int resNoCut = chk(idx + 1);
			for (int i : key.c)
				KeyCnt[i]--;
			int resCut = chk(idx + 1) + key.a;
			for (int i : key.c)
				KeyCnt[i]++;
			res = Integer.max(resNoCut, resCut);

		} else {
			res = chk(idx + 1);
		}
		if (!mem.containsKey(idx))
			mem.put(idx, new HashMap<String, Integer>());
		mem.get(idx).put(strKeyCnt, res);
		return res;
	}

	@SuppressWarnings("unused")
	private void printKeyCnt() {
		for (int i = 1; i <= N; i++)
			System.out.print(" " + KeyCnt[i]);
		System.out.println();
	}

	private boolean chkKeyCnt() {
		for (int i = 1; i <= N; i++) {
			if (KeyCnt[i] < 1)
				return false;
		}
		return true;
	}

	private String KeyCntToString() {
		String str = "";
		for (int i = 1; i <= N; i++) {
			str = str + String.format("%04d", KeyCnt[i]);
		}
		return str;
	}

	private class Key {
		int a;
		int b;
		int[] c;

		public Key(int a, int b) {
			super();
			this.a = a;
			this.b = b;
			this.c = new int[b];
		}

		@Override
		public String toString() {
			return "Key [a=" + a + ", b=" + b + ", c=" + Arrays.toString(c) + "]";
		}

	}

	ArrayList<Key> Keys;
}
