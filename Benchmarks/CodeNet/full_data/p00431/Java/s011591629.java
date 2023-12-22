import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> g;
	static int ans;
	static final int memoN = 10;
	static HashSet<State> searched = new HashSet<State>();

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			g = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < 100; ++i) {
				g.add(new ArrayList<Integer>());
			}
			ans = 0;
			searched.clear();
			for (int i = 0; i < N; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				if (!g.get(a).contains(b)) g.get(a).add(b);
				if (!g.get(b).contains(a)) g.get(b).add(a);
			}
			State st = new State();
			for (int i = 0; i < 100; ++i) {
				st.move(i);
				dfs(i, st, 1);
				st.back(0);
			}
			System.out.println(ans);
		}
	}

	static void dfs(int pos, State st, int len) {
		if (len == memoN) {
			if (searched.contains(st)) return;
			searched.add(st.clone());
		}
		int prev = st.pos();
		for (int n : g.get(pos)) {
			if (!st.used(n)) {
				st.move(n);
				dfs(n, st, len + 1);
				st.back(prev);
			}
		}
		ans = Math.max(ans, len);
	}

	static class State {

		long v1, v2;

		public State clone() {
			State st = new State();
			st.v1 = v1;
			st.v2 = v2;
			return st;
		}

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (v1 ^ (v1 >>> 32));
			result = prime * result + (int) (v2 ^ (v2 >>> 32));
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj) return true;
			State other = (State) obj;
			return this.v1 == other.v1 && this.v2 == other.v2;
		}

		boolean used(int v) {
			if (v < 64) {
				return (v1 & (1L << v)) != 0;
			} else {
				return (v2 & (1L << (v - 64))) != 0;
			}
		}

		void move(int v) {
			v2 &= ((1L << 40) - 1);
			v2 |= ((long) v) << 40;
			if (v < 64) {
				v1 |= (1L << v);
			} else {
				v2 |= (1L << (v - 64));
			}
		}

		void back(int v) {
			int clear = pos();
			v2 &= ((1L << 40) - 1);
			v2 |= ((long) v) << 40;
			if (clear < 64) {
				v1 ^= (1L << clear);
			} else {
				v2 ^= (1L << (clear - 64));
			}
		}

		int pos() {
			return (int) (v2 >> 40);
		}

	}
}