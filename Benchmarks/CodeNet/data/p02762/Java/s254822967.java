import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		List<TreeSet<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new TreeSet<>());
		}
		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
			uf.union(a, b);
		}
		List<TreeSet<Integer>> list2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list2.add(new TreeSet<>());
		}
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			int c = Integer.parseInt(sa[0]) - 1;
			int d = Integer.parseInt(sa[1]) - 1;
			list2.get(c).add(d);
			list2.get(d).add(c);
		}
		br.close();

		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			int size = uf.size(i);
			size -= list.get(i).size();
			Set<Integer> set2 = list2.get(i);
			for (Integer o : set2) {
				if (uf.same(i, o)) {
					size--;
				}
			}
			ans[i] = size - 1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static class UnionFind {
		int[] parent, size;
		int num = 0; // 連結成分の数。頂点初登場時に+1

		UnionFind(int n) {
			parent = new int[n];
			size = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				size[i] = 1;
			}
		}

		void union(int x, int y) {
			int px = find(x);
			int py = find(y);
			if (px != py) {
				parent[px] = py;
				size[py] += size[px];
				num--;
			}
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			}
			parent[x] = find(parent[x]);
			return parent[x];
		}

		/**
		 * xとyが同一連結成分か
		 */
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		/**
		 * xを含む連結成分のサイズ
		 */
		int size(int x) {
			return size[find(x)];
		}
	}
}
