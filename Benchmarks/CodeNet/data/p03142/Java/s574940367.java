import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	static TreeMap<Integer, We> w = new TreeMap<>();
	static TreeMap<Integer, List<Integer>> idx = new TreeMap<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Set<Integer> from = new TreeSet<>();
		Set<Integer> to = new TreeSet<>();
		for (int i = 0; i < n - 1 + m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			from.add(a);
			to.add(b);

			List<Integer> list = idx.get(a);
			if (list == null) {
				list = new ArrayList<>();
				idx.put(a, list);
			}
			list.add(b);
		}

		from.removeAll(to);
		Integer root = from.iterator().next();
		hoge(root, 0, 0);

		for (Map.Entry<Integer, We> e : w.entrySet()) {
			System.out.println(e.getValue().val);
		}

		in.close();
	}

	public static void hoge(int root, int parent, int level) {
		w.merge(root, new We(level, parent), (old, v) -> {
			if (v.level > old.level) {
				return v;
			} else {
				return old;
			}
		});
		level++;
		List<Integer> list = idx.get(root);
		if (list != null) {
			for (Integer i : list) {
				hoge(i, root, level);
			}
		}
	}

}

class We {
	int level;
	int val;
	public We(int level, int val) {
		this.level = level;
		this.val = val;
	}
}