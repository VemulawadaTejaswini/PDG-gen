import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n, m, q;
	static int[] a, b, c, d;
	static int ans = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();
		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		sc.close();

		List<Integer> list = new ArrayList<>();
		list.add(1);
		dfs(list);
		System.out.println(ans);
	}

	static void dfs(List<Integer> list) {
		if (list.size() == n + 1) {
			int val = 0;
			for (int i = 0; i < q; i++) {
				if (list.get(b[i]) - list.get(a[i]) == c[i]) {
					val += d[i];
				}
			}
			ans = Math.max(ans, val);
			return;
		}
		int start = list.get(list.size() - 1);
		for (int i = start; i <= m; i++) {
			list.add(i);
			dfs(list);
			list.remove(list.size() - 1);
		}
	}
}
