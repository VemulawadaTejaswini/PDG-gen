//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	int mod = (int)1e9+7;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}

	private void run_case() {
		int[] arr = strToIntArray(scanner.nextLine());
		int n = arr[0], m = arr[1], k = arr[2];

		boolean[][] vis = new boolean[n][n];

		// int[] res = new int[n];
		// Arrays.fill(res, n-1);

		DJSet uf = new DJSet(n);

		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i=0; i<m; i++) {
			arr = strToIntArray(scanner.nextLine());
			int a = Math.min(arr[0], arr[1]);
			int b = Math.max(arr[0], arr[1]);
			a--;
			b--;

			if (vis[a][b]) continue;
			vis[a][b] = true;
			uf.union(a, b);
			map.putIfAbsent(a, new HashSet<>());
			map.get(a).add(b);
			map.putIfAbsent(b, new HashSet<>());
			map.get(b).add(a);
		}

		for (int i=0; i<k; i++) {
			arr = strToIntArray(scanner.nextLine());
			int a = Math.min(arr[0], arr[1]);
			int b = Math.max(arr[0], arr[1]);
			a--;
			b--;
			map.putIfAbsent(a, new HashSet<>());
			map.get(a).add(b);
			map.putIfAbsent(b, new HashSet<>());
			map.get(b).add(a);
		}

		int[] res = new int[n];
		for (int i=0; i<n; i++) {
			int t = uf.getSize(i) - 1;
			if (map.get(i) != null) {
				for (int u: map.get(i)) {
					if (uf.equiv(i, u)) t--;
				}
			}
			res[i] = t;
		}

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(String.valueOf(res[i]) + " ");
		}
		System.out.println(sb.toString().trim());
		return;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

class DJSet {
	public int[] upper;
    public int[] size;

	public DJSet(int n) {
		upper = new int[n];
		Arrays.fill(upper, -1);

        size = new int[n];
        Arrays.fill(size, 1);
	}

	public int find(int x) {
		return upper[x] < 0 ? x : (upper[x] = find(upper[x]));
	}

	public boolean equiv(int x, int y) {
		return find(x) == find(y);
	}

	public boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			if (upper[y] < upper[x]) {
				int d = x;
				x = y;
				y = d;
			}
            size[x] += size[y];
			upper[x] += upper[y];
			upper[y] = x;
		}
		return x == y;
	}

	public int count() {
		int ct = 0;
		for (int u : upper)
			if (u < 0)
				ct++;
		return ct;
	}

    public int getSize(int x) {
        return size[find(x)];
    }
}


// 1 2 3 4
//
//  1 0 2
