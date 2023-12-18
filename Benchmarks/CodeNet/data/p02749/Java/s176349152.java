import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	static int n;
	static List<List<Integer>> list;
	static int[] ans;
	static int[] cnt = new int[3];;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		int[] rem = new int[4];
		int n2 = n / 3;
		rem[1] = n2;
		rem[2] = n2;
		rem[3] = n2;
		int n3 = n % 3;
		if (n3 > 0) rem[1]++;
		if (n3 > 1) rem[2]++;

		ans = new int[n];
		dfs(0, -1, new Obj());

		for (int i = 0; i < n; i++) {
			if (rem[ans[i]] > 0) {
				rem[ans[i]]--;
				ans[i] = rem[ans[i]] * 3 + ans[i];
			} else {
				ans[i] = rem[3] * 3;
				rem[3]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static Obj dfs(int x, int p, Obj op) {
		Set<Integer> set = op.set3;
		if (set.contains(1)) {
			if (set.contains(2)) {
				ans[x] = 3;
			} else {
				ans[x] = 2;
				cnt[2]++;
			}
		} else {
			if (set.contains(2)) {
				ans[x] = 1;
				cnt[1]++;
			} else {
				if (cnt[1] <= cnt[2] + 1) {
					ans[x] = 1;
					cnt[1]++;
				} else {
					ans[x] = 2;
					cnt[2]++;
				}
			}
		}

		op.set3 = op.set2;
		op.set2 = op.set1;
		op.set1 = new HashSet<>();
		op.set1.add(ans[x]);
		Obj oc = new Obj();
		for (int c : list.get(x)) {
			if (c == p) continue;
			Obj oc2 = dfs(c, x, clone(op));
			oc.set2.addAll(oc2.set1);
			oc.set3.addAll(oc2.set2);
			op.set2.addAll(oc2.set1);
			op.set3.addAll(oc2.set2);
		}
		oc.set1 = new HashSet<>();
		oc.set1.add(ans[x]);
		return oc;
	}

	static class Obj {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
	}

	static Obj clone(Obj o) {
		Obj no = new Obj();
		no.set1.addAll(o.set1);
		no.set2.addAll(o.set2);
		no.set3.addAll(o.set3);
		return no;
	}
}
