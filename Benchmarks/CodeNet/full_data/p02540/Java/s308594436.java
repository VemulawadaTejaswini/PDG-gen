import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int[] x, y;
	List<Tuple> list;
	Set<Tuple> set;
	Map<Integer, Integer> counts;

	static class Tuple {
		int id, x, y, gid;
		Set<Integer> conns;

		Tuple(int id, int x, int y) {
			this.gid = -1;
			this.id = id;
			this.x = x;
			this.y = y;
			this.conns = new HashSet<>();
		}

		void showConns() {
			for (Integer conn : conns) {
				System.out.print(" " + conn);
			}
			System.out.println();
		}
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			x[i] = Integer.parseInt(tokens[0]);
			y[i] = Integer.parseInt(tokens[1]);
		}
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			list.add(new Tuple(i, x[i], y[i]));
		}
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.x, o2.x);
			}
		});
		set = new HashSet<>();
	}

	void mark(int id, int gid, int parent) {
		if (list.get(id).gid >= 0) {
			return;
		}
		list.get(id).gid = gid;
		for (Integer next : list.get(id).conns) {
			if (next != parent) {
				mark(next, gid, id);
			}
		}
	}

	void calc() {
		set.add(list.get(0));
		for (int i = 1; i < list.size(); ++i) {
			Tuple tuple = list.get(i);
			// setの中から，yが小さいやつを見つける
			Tuple target = null;
			for (Tuple t : set) {
				if (t.y < tuple.y) {
					target = t;
					break;
				}
			}
			if (target == null) {
				// 新しい要素
				set.add(tuple);
			} else {
				// 見つけたものとつなぐ
				target.conns.add(tuple.id);
				tuple.conns.add(target.id);
				// target.y > tuple.yの場合，置換する
				if (target.y > tuple.y) {
					set.remove(target);
					set.add(tuple);
				}
			}
		}

		set.clear();
		set.add(list.get(list.size() - 1));
		for (int i = list.size() - 2; i >= 0; --i) {
			Tuple tuple = list.get(i);
			// setの中から，yが大きいやつを見つける
			Tuple target = null;
			for (Tuple t : set) {
				if (t.y > tuple.y) {
					target = t;
					break;
				}
			}
			if (target == null) {
				// 新しい要素
				set.add(tuple);
			} else {
				// 見つけたものとつなぐ
				target.conns.add(tuple.id);
				tuple.conns.add(target.id);
				// target.y < tuple.yの場合，置換する
				if (target.y < tuple.y) {
					set.remove(target);
					set.add(tuple);
				}
			}
		}

		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.id, o2.id);
			}
		});

		// gidをmarkする
		int gid = 0;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).gid < 0) {
				mark(i, gid, -1);
				++gid;
			}
		}

		counts = new HashMap<>();
		for (int i = 0; i < list.size(); ++i) {
			int g = list.get(i).gid;
			if (counts.containsKey(g)) {
				counts.put(g, counts.get(g) + 1);
			} else {
				counts.put(g, 1);
			}
		}

	}

	void showResult() {
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(counts.get(list.get(i).gid));
		}
		// list.get(0).showConns();
	}
}