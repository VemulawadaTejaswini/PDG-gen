import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[][] a = new int[n][n - 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = getMatch(n, i + 1, in.nextInt());
			}
		solve(n, a);
		in.close();
	}

	static HashMap<Integer, Integer> lv = new HashMap<>();
	static HashMap<Integer, ArrayList<Integer>> nx = new HashMap<>();

	private static void solve(int n, int[][] a) {
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n - 1; j++)
				if (!store(a[i][j - 1], a[i][j])) {
					System.out.println(-1);
					return;
				}
		int last = 0;
		for (int d : lv.values())
			if (last < d)
				last = d;
		System.out.println(last);
	}

	private static boolean store(int x, int y) {
		if (nx.containsKey(x)) // add relation
			nx.get(x).add(y);
		else {
			ArrayList<Integer> t = new ArrayList<>();
			t.add(y);
			nx.put(x, t);
		}

		if (lv.containsKey(x)) {
			int xd = lv.get(x);
			if (lv.containsKey(y)) { // both matches exist
				int yd = lv.get(y);
				if (xd > yd) {
					if (hasNext(y, x)) // impossible
						return false;
				}
				if (xd >= yd) { // delay
					lv.replace(y, xd + 1);
					shift(y);
				}
			} else // following Match is new one
				lv.put(y, xd + 1);
		} else {
			if (lv.containsKey(y)) { // previous match is new one
				lv.put(x, 1);
				if (lv.get(y) == 1)
					shift(x);
			} else { // both matches are new
				lv.put(x, 1);
				lv.put(y, 2);
			}
		}
		return true;
	}

	private static void shift(int p) {
		if (!nx.containsKey(p))
			return;
		int pd = lv.get(p);
		for (int c : nx.get(p))
			if (lv.get(c) <= pd) {
				lv.replace(c, pd + 1);
				shift(c);
			}
	}

	private static boolean hasNext(int r, int t) {
		if (r == t)
			return true;
		if (!nx.containsKey(r))
			return false;
		for (int n : nx.get(r))
			if (hasNext(n, t))
				return true;
		return false;
	}

	private static int getMatch(int n, int x, int y) {
		if (x < y)
			return (x - 1) * n + y - x * (x + 1) / 2;
		else
			return (y - 1) * n + x - y * (y + 1) / 2;
	}
}
