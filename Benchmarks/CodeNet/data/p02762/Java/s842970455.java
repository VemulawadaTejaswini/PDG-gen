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
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
 		int n = ni(), m = ni(), k = ni();
		DJSet uf = new DJSet(n);

		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i=0; i<m; i++) {
			int t1 = ni(), t2 = ni();
			int a = Math.min(t1, t2);
			int b = Math.max(t1, t2);
			a--;
			b--;
			uf.union(a, b);
			map.putIfAbsent(a, new HashSet<>());
			map.get(a).add(b);
			map.putIfAbsent(b, new HashSet<>());
			map.get(b).add(a);
		}

		for (int i=0; i<k; i++) {
			int t1 = ni(), t2 = ni();
			int a = Math.min(t1, t2);
			int b = Math.max(t1, t2);
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
	private int ni() {return Integer.parseInt(reader.next());}
	private String ns() {return reader.next();}
}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
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
