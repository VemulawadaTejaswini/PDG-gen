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
		int id;
		List<Long> list;
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

	Map<Integer, List<Long>> search(int current, int parent, List<Long> prevList) {
		Set<Integer> set = new HashSet<>();
		set.addAll(tree[current].conns);
		set.remove(parent);
		List<Long> list = new ArrayList<>();
		list.add(tree[current].a);
		if (set.isEmpty()) {
			Map<Integer, List<Long>> map = new HashMap<>();
			map.put(current, list);
			return map;
		} else {
			// mapをマージする
			Map<Integer, List<Long>> map = new HashMap<>();
			for (Integer child : set) {
				Map<Integer, List<Long>> childMap = search(child, current, list);
				for (Integer key : childMap.keySet()) {
					map.put(key, childMap.get(key));
				}
			}
			map.put(current, list);
			return map;
		}
	}

	void calc() {
		Map<Integer, List<Long>> map = search(0, -1, new ArrayList<Long>());
		List<Integer> keys = new ArrayList<>();
		keys.addAll(map.keySet());
		Collections.sort(keys);
		for (int i = 0; i < keys.size(); ++i) {
			Collections.sort(map.get(keys.get(i)));
			System.out.println(Collections.binarySearch(map.get(keys.get(i)), tree[keys.get(i)].a));
		}
	}

	void showResult() {
	}

}