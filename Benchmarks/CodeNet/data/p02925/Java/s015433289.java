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

	private static void solve(int n, int[][] a) {
		for (int i = 0; i < n; i++)
			lv.put(a[i][0], 0);
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n - 1; j++)
				if (!store(a[i][j - 1], a[i][j])) {
					System.out.println(-1);
					return;
				}
		ArrayList<Integer> t = new ArrayList<>();
		for (int p : lv.keySet())
			t.add(p);
		for (int p : t)
			setLv(p);
		System.out.println(max + 1);
	}

	static int max = 0;

	private static void setLv(int t) {
		if (!nx.containsKey(t))
			return;
		for (int n : nx.get(t)) {
			if (!lv.containsKey(n))
				lv.put(n, lv.get(t) + 1);
			else if (lv.get(n) > lv.get(t))
				continue;
			else
				lv.replace(n, lv.get(t) + 1);
			if (max < lv.get(t) + 1)
				max = lv.get(t) + 1;
			setLv(n);
		}
	}

	static HashMap<Integer, ArrayList<Integer>> nx = new HashMap<>();

	private static boolean store(int x, int y) {
		if (hasNext(y, x))
			return false;
		if (nx.containsKey(x))
			nx.get(x).add(y);
		else {
			ArrayList<Integer> e = new ArrayList<>();
			e.add(y);
			nx.put(x, e);
		}
		lv.remove(y);
		return true;
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
