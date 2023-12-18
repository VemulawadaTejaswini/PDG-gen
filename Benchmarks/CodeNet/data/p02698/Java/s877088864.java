import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Tuple[] tree;

	static class Tuple {
		int id;
		long a;
		Set<Integer> conns = new HashSet<>();
	}

	static class Pair {
		int leaf;
		int num;
		long max;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		tokens = in.readLine().split(" ");
		tree = new Tuple[N];
		for (int i = 0; i < N; ++i) {
			Tuple tuple = new Tuple();
			tuple.id = i;
			tuple.a = Long.parseLong(tokens[i]);
			tree[i] = tuple;
		}
		for (int i = 0; i < N - 1; ++i) {
			tokens = in.readLine().split(" ");
			int u = Integer.parseInt(tokens[0]) - 1;
			int v = Integer.parseInt(tokens[1]) - 1;
			tree[u].conns.add(v);
			tree[v].conns.add(u);
		}
	}

	Map<Integer, Pair> search(int current, int parent) {
		Set<Integer> set = new HashSet<>();
		set.addAll(tree[current].conns);
		set.remove(parent);
		if (set.isEmpty()) {
			Map<Integer, Pair> map = new HashMap<>();
			Pair pair = new Pair();
			pair.leaf = current;
			pair.max = tree[current].a;
			pair.num = 1;
			map.put(current, pair);
			return map;
		} else {
			// mapをマージする
			Map<Integer, Pair> map = new HashMap<>();
			for (Integer child : set) {
				Map<Integer, Pair> childMap = search(child, current);
				for (Integer key : childMap.keySet()) {
					map.put(key, childMap.get(key));
				}
			}
			for (Integer key : map.keySet()) {
				if (map.get(key).max > tree[current].a) {
					map.get(key).num++;
					map.get(key).max = tree[current].a;
				}
			}
			Pair pair = new Pair();
			pair.leaf = current;
			pair.max = tree[current].a;
			pair.num = 1;
			map.put(current, pair);
			return map;
		}
	}

	void calc() {
		Map<Integer, Pair> map = search(0, -1);
		List<Integer> keys = new ArrayList<>();
		keys.addAll(map.keySet());
		Collections.sort(keys);
		for (int i = 0; i < keys.size(); ++i) {
			System.out.println(map.get(keys.get(i)).num);
		}
	}

	void showResult() {
	}

}