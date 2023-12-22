import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int N;
	static int S;
	static int[] A;
	static long t = (long) (1<<30) % 998244353;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	static class Set {
		List<Integer> list = new ArrayList();

		public void add(int item) {
			list.add(item);
		}

		@Override
		public String toString() {
			return "Set [list=" + list + "]";
		}

		public Set copy() {
			Set res = new Set();
			res.list.addAll(this.list);
			return res;
		}

	}

	static class ListSet {
		List<Set> list = new ArrayList<>();

		public ListSet() {
		}

		public void addSet(Set set) {
			list.add(set);
		}

		public void union(ListSet listset) {
			if (listset == null) {
				return;
			}
			for (Set set : listset.list) {
				this.list.add(set.copy());
			}
		}

		public static ListSet unionSet(ListSet L, ListSet Q) {
			if (L == null && Q == null) {
				return null;
			}
			ListSet res = new ListSet();
			res.union(L);
			res.union(Q);
			return res;
		}

		public ListSet clone() {
			ListSet listset = new ListSet();
			for (Set set : this.list) {
				listset.list.add(set.copy());
			}
			return listset;
		}

		public static ListSet unionEle(ListSet L, int elment) {
			if (L == null) {
				return null;
			}
			ListSet res = L.clone();
			for (Set set : res.list) {
				set.add(elment);
			}
			if (res.list.isEmpty()) {
				Set set = new Set();
				set.add(elment);
				res.list.add(set);
			}
			return res;
		}

		@Override
		public String toString() {
			return "ListSet [list=" + list + "]";
		}

	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split(" ");
		N = Integer.parseInt(word[0]);
		S = Integer.parseInt(word[1]);
		word = br.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(word[i]);
		}
		ListSet[][] F = new ListSet[N][S + 1];

		for (int s = 0; s <= S; s++) {
			F[0][s] = null;
		}
		F[0][0] = new ListSet();
		Set set = new Set();
		set.add(0);
		ListSet listset = new ListSet();
		listset.addSet(set);

		if (A[0] <= S)
			F[0][A[0]] = listset;

		for (int i = 1; i < N; i++) {
			F[i][0] = new ListSet();
			for (int j = 1; j <= S; j++) {
				ListSet Q = null;
				if (j >= A[i]) {
					Q = ListSet.unionEle(F[i - 1][j - A[i]], i);
				}
				F[i][j] = ListSet.unionSet(F[i - 1][j], Q);
			}
		}
		List<Set> tmp = F[N - 1][S] == null ? new ArrayList<Set>() : F[N - 1][S].list;
		long res = 0;
		for (Set settmp : tmp) {
			int size = settmp.list.size();
			int leftsize = N - size;
			res = (res + mypower(2, leftsize)) % 998244353;
		}
		System.out.println(res);
		br.close();
	}

	public static long mypower(int base, int power) {
		int i = 0;
		long res = 1;
		while (i < power) {
			i = i + 30;

			if (i > power) {
				res = (res * (long) Math.pow(2, power - (i - 30))) % 998244353;
			} else {
				res = (res *t) % 998244353;
			}

		}

		return res;
	}

}
