import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		List<Set<Integer>> listP = new ArrayList<Set<Integer>>();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int xi = -1;
			int yi = -1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).contains(x)) {
					xi = j;
					break;
				}
			}
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).contains(y)) {
					yi = j;
					break;
				}
			}
			if (xi == -1) {
				if (yi == -1) {
					Set<Integer> set = new HashSet<Integer>();
					set.add(x);
					set.add(y);
					list.add(set);
					Set<Integer> setP = new HashSet<Integer>();
					setP.add(p[x]);
					setP.add(p[y]);
					listP.add(setP);
				} else {
					list.get(yi).add(x);
					listP.get(yi).add(p[x]);
				}
			} else {
				if (yi == -1) {
					list.get(xi).add(y);
					listP.get(xi).add(p[y]);
				} else {
					list.get(xi).addAll(list.get(yi));
					list.remove(yi);
					listP.get(xi).addAll(listP.get(yi));
					listP.remove(yi);
				}
			}
		}
		sc.close();

		int ans = 0;
		for (int j = 0; j < list.size(); j++) {
			for (Integer i : list.get(j)) {
				if (listP.get(j).contains(i)) {
					ans++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				boolean flg = false;
				for (int j = 0; j < list.size(); j++) {
					if (listP.get(j).contains(i)) {
						flg = true;
						break;
					}
				}
				if (!flg) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
