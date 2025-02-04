import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Obj[] arr = new Obj[n];
		Obj[] arr2 = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.i = i;
			o.x = Integer.parseInt(sa[0]);
			o.y = Integer.parseInt(sa[1]);
			arr[i] = o;
			arr2[i] = o;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> o1.x - o2.x);
		DSU uf = new DSU(n);
		TreeMap<Integer, Obj> map = new TreeMap<>();
		for (Obj o : arr) {
			Integer now = o.y;
			boolean flg = false;
			while (true) {
				Integer key = map.lowerKey(now);
				if (key == null) {
					if (!flg) {
						map.put(o.y, o);
					}
					break;
				}
				map.remove(now);
				Obj v = map.get(key);
				uf.merge(o.i, v.i);
				now = key;
				flg = true;
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (Obj o : arr2) {
			pw.println(uf.size(o.i));
		}
		pw.flush();
	}
}

class Obj {
	int i, x, y;
}

/**
 * Disjoint Set Union（Union Find）
 */
class DSU {
	private int n;
	private int[] parentOrSize;
	private int num;

	/**
	 * n頂点0辺の無向グラフを作る。<br>
	 * O(n)
	 * 
	 * @param n 頂点数
	 */
	public DSU(int n) {
		this.n = n;
		this.parentOrSize = new int[n];
		Arrays.fill(parentOrSize, -1);
		num = n;
	}

	/**
	 * 辺(a, b)を足す。<br>
	 * ならしO(α(n))
	 * 
	 * @param a 頂点番号（0≦a＜n）
	 * @param b 頂点番号（0≦b＜n）
	 * @return 代表元
	 */
	int merge(int a, int b) {
		assert 0 <= a && a < n : "a=" + a;
		assert 0 <= b && b < n : "b=" + b;

		int x = leader(a);
		int y = leader(b);
		if (x == y) {
			return x;
		}
		if (-parentOrSize[x] < -parentOrSize[y]) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		parentOrSize[x] += parentOrSize[y];
		parentOrSize[y] = x;
		num--;
		return x;
	}

	/**
	 * 頂点a, bが連結かどうか。<br>
	 * ならしO(α(n))
	 * 
	 * @param a 頂点番号（0≦a＜n）
	 * @param b 頂点番号（0≦b＜n）
	 * @return true：連結　false：非連結
	 */
	boolean same(int a, int b) {
		assert 0 <= a && a < n : "a=" + a;
		assert 0 <= b && b < n : "b=" + b;

		return leader(a) == leader(b);
	}

	/**
	 * 頂点aの属する連結成分の代表元を返す。<br>
	 * ならしO(α(n))
	 * 
	 * @param a 頂点番号（0≦a＜n）
	 * @return 代表元
	 */
	int leader(int a) {
		assert 0 <= a && a < n : "a=" + a;

		if (parentOrSize[a] < 0) {
			return a;
		} else {
			return parentOrSize[a] = leader(parentOrSize[a]);
		}
	}

	/**
	 * 頂点aの属する連結成分の要素数を返す。<br>
	 * ならしO(α(n))
	 * 
	 * @param a 頂点番号（0≦a＜n）
	 * @return 要素数
	 */
	int size(int a) {
		assert 0 <= a && a < n : "a=" + a;

		return -parentOrSize[leader(a)];
	}

	/**
	 * 連結成分の数を返す。<br>
	 * O(1)
	 * 
	 * @return 連結成分数
	 */
	int num() {
		return num;
	}

	/**
	 * グラフを連結成分に分けた情報を返す。<br>
	 * O(n)
	 * 
	 * @return 「1つの連結成分の頂点番号のリスト」のリスト
	 */
	List<List<Integer>> groups() {
		int[] leaderBuf = new int[n];
		int[] groupSize = new int[n];
		for (int i = 0; i < n; i++) {
			leaderBuf[i] = leader(i);
			groupSize[leaderBuf[i]]++;
		}
		List<List<Integer>> result = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			result.add(new ArrayList<>(groupSize[i]));
		}
		for (int i = 0; i < n; i++) {
			result.get(leaderBuf[i]).add(i);
		}
		result.removeIf(List::isEmpty);
		return result;
	}
}
