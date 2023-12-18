import java.util.*;

public class Main {

	static final int mod = 998244353;
	// 木の集合
	static List<Integer> tree[];

	static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
		private static final long serialVersionUID = 6411527075103472113L;

		public Pair(final K key, final V value) {
			super(key, value);
		}
	}

	public static long dfs(int value) {
		long res = 1;
		for (int v : tree[value]) {
			res *= dfs(v);
			res %= (long) mod;
		}
		return (res + 1) % (long) mod;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair<Integer, Integer> robot[] = new Pair[n];
		tree = new List[n];
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			robot[i] = new Pair<Integer, Integer>(x, d);
		}
		sc.close();

		// xでソート
		Arrays.sort(robot, new Comparator<Pair<Integer, Integer>>() {
			public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
				return o1.getKey() - o2.getKey();
			}
		});

		// 木の頂点集合 但し、keyでソートされて保持される集合にする
		Set<Pair<Integer, Integer>> set = new TreeSet<Pair<Integer, Integer>>(new Comparator<Pair<Integer, Integer>>() {
			public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
				return o1.getKey() - o2.getKey();

			}
		});

		// 木の頂点集合＆部分木集合の構成
		for (int i = n - 1; i >= 0; --i) {
			int x = robot[i].getKey(), d = robot[i].getValue();
			tree[i] = new ArrayList<Integer>();
			while (!set.isEmpty()) {
				Pair<Integer, Integer> next = set.iterator().next();
				if (next.getKey() >= x + d)
					break;
				tree[i].add(next.getValue());
				set.remove(next);
			}
			set.add(new Pair<Integer, Integer>(x, i));
		}

		// 木dp
		long ans = 1;
		for (Pair<Integer, Integer> p : set) {
			int v = p.getValue();
			ans *= dfs(v);
			ans %= (long) mod;
		}
		System.out.println(ans);
	}
}
