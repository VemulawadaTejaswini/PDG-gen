import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		City[] arr = new City[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			City o = new City();
			o.i = i;
			o.x = Integer.parseInt(sa[0]);
			o.y = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		List<Road> list = new ArrayList<Road>(2 * n);

		Arrays.parallelSort(arr, new Comparator<City>() {
			public int compare(City o1, City o2) {
				return o1.x - o2.x;
			}
		});
		for (int i = 1; i < arr.length; i++) {
			City o1 = arr[i - 1];
			City o2 = arr[i];
			Road e = new Road();
			e.i = o1.i;
			e.j = o2.i;
			e.c = o2.x - o1.x;
			list.add(e);
		}

		Arrays.parallelSort(arr, new Comparator<City>() {
			public int compare(City o1, City o2) {
				return o1.y - o2.y;
			}
		});
		for (int i = 1; i < arr.length; i++) {
			City o1 = arr[i - 1];
			City o2 = arr[i];
			Road e = new Road();
			e.i = o1.i;
			e.j = o2.i;
			e.c = o2.y - o1.y;
			list.add(e);
		}

		Collections.sort(list, new Comparator<Road>() {
			public int compare(Road e1, Road e2) {
				return e1.c - e2.c;
			}
		});

		int[] parent = new int[n];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}

		long ans = 0;
		for (Road e : list) {
			if (find(parent, e.i) != find(parent, e.j)) {
				union(parent, e.i, e.j);
				ans += e.c;
			}
		}
		System.out.println(ans);
	}

	static class City {
		int i, x, y;
	}

	static class Road {
		int i, j, c;
	}

	static void union(int[] parent, int x, int y) {
		int px = find(parent, x);
		int py = find(parent, y);
		if (px != py) {
			parent[px] = py;
		}
	}

	static int find(int[] parent, int x) {
		if (parent[x] == x) {
			return x;
		}
		parent[x] = find(parent, parent[x]);
		return parent[x];
	}
}
