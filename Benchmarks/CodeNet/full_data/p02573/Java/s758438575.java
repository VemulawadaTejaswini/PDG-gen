import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var numbers = new ArrayList<Integer>();
		for (var i = 0; i < n; i++) {
			numbers.add(i + 1);
		}
		var uf = new Main().new UnionFind(numbers);
		for (var i = 0; i < m; i++) {
			uf.union(sc.nextInt(), sc.nextInt());
		}
		sc.close();

		var hashMap = new HashMap<Integer, Integer>();
		for (var i = 0; i < n; i++) {
			var root = uf.find(i + 1);
			if (!hashMap.containsKey(root)) {
				hashMap.put(root, 0);
			}
			hashMap.put(root, hashMap.get(root) + 1);
		}

		var max = 0;
		for (var v : hashMap.values()) {
			max = Math.max(max, v);
		}
		System.out.println(max);
	}

	public class UnionFind {
		public HashMap<Integer, Integer> parents = new HashMap<Integer, Integer>();
		public HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();

		public UnionFind(List<Integer> numbers) {
			for (var number : numbers) {
				parents.put(number, number);
				ranks.put(number, 0);
			}
		}

		public void union(int number1, int number2) {
			var root1 = find(number1);
			var root2 = find(number2);
			if (root1 != root2) {
				if (ranks.get(root1) < ranks.get(root2)) {
					parents.put(root1, root2);
				} else {
					parents.put(root2, root1);
					if (ranks.get(root1) == ranks.get(root2)) {
						ranks.put(root1, ranks.get(root1) + 1);
					}
				}
			}
		}

		public int find(int number) {
			var parent = parents.get(number);
			if (number == parent) {
				return number;
			}
			var find = find(parent);
			parents.put(number, find);
			return find;
		}
	}
}
