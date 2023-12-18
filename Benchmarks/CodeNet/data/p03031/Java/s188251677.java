import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int m;
	static int[] k;
	static ArrayList<ArrayList<Integer>> s;
	static int[] p;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = new int[m];
		s = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			k[i] = sc.nextInt();
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int j = 0; j < k[i]; j++) {
				tmp.add(sc.nextInt());
			}
			s.add(tmp);
		}
		p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}
		ans = 0;
		dfs(0, new boolean[n]);
		System.out.println(ans);
	}
	static void dfs(int index, boolean[] on) {
		if (index == n) {
			count(on);
		} else {
			dfs(index + 1, on);
			on[index] = true;
			dfs(index + 1, on);
			on[index] = false;
		}
	}

	static void count(boolean[] on) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			int tmp = 0;
			for (int j = 0; j < k[i]; j++) {
				if (on[s.get(i).get(j) - 1]) {
					tmp++;
				}
			}
			if (tmp % 2 == p[i]) {
				count++;
			}
		}
		if (count == m) {
			ans++;
		}
	}
}

