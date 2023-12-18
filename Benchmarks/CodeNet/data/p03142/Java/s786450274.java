import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	static TreeMap<Integer, We> w = new TreeMap<>();
	static TreeSet<E> idx = new TreeSet<>();

	public static void main(String[] args) throws IOException {
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

			idx.add(new E(a, b));
		}

		from.removeAll(to);
		Integer root = from.iterator().next();
		hoge(root, 0, 0);

		BufferedOutputStream out = new BufferedOutputStream(System.out);
		OutputStreamWriter wri = new OutputStreamWriter(out);

		for (Map.Entry<Integer, We> e : w.entrySet()) {
			wri.write(String.valueOf(e.getValue().val) + "\n");
		}

		wri.flush();
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
		SortedSet<E> set = idx.subSet(new E(root, -1), new E(root + 1, -1));
		if (set != null) {
			for (E e : set) {
				hoge(e.to, root, level);
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

@SuppressWarnings("rawtypes")
class E implements Comparable {
	int from;
	int to;
	public E(int from, int to) {
		this.from = from;
		this.to = to;
	}
	@Override
	public int compareTo(Object o) {
		int d = Integer.compare(this.from, ((E)o).from);
		if (d != 0) {
			return d;
		}
		return Integer.compare(this.to, ((E)o).to);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		E other = (E) obj;
		if (from != other.from)
			return false;
		if (to != other.to)
			return false;
		return true;
	}


}