import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int n, m;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();

		boolean ret = exec(n - 1);
		if (!ret) {
			throw new Exception();
		}
	}

	static boolean exec(int start) {
		boolean[] used = new boolean[n + 1];
		Set<Integer> set = new HashSet<>();
		int cnt = 0;
		int j = start;
		List<String> list = new ArrayList<>(m);
		for (int i = 1; i <= n; i++) {
			if (used[i]) {
				continue;
			}
			for ( ; j >= 0; j--) {
				if (j == 0) {
					j = n - 1;
				}
				if (set.contains(j)) {
					continue;
				}
				int i2 = i + j;
				if (i2 > n) {
					i2 -= n;
				}
				if (used[i2]) {
					continue;
				}
				if (j == n - j) {
					continue;
				}
				if (!set.contains(n - j)) {
					set.add(j);
					set.add(n - j);
					used[i] = true;
					used[i2] = true;
					list.add(Math.min(i, i2) + " " + Math.max(i, i2));
					cnt++;
					if (cnt == m) {
//						if (set.size() != m * 2) {
//							throw new RuntimeException();
//						}
//						int t = 0;
//						for (int k = 1; k <= n; k++) {
//							if (used[k]) {
//								t++;
//							}
//						}
//						if (t != m * 2) {
//							throw new RuntimeException();
//						}
						PrintWriter pw = new PrintWriter(System.out);
						for (int k = 0; k < m; k++) {
							pw.println(list.get(k));
						}
						pw.flush();
						return true;
					}
					break;
				}
			}
		}
		return false;
	}
}
