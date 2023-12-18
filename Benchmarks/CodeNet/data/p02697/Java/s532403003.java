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
			exec(n - 2);
		}
	}

	static boolean exec(int start) {
		boolean[] used = new boolean[n + 1];
		Set<Integer> set = new HashSet<>();
		int cnt = 0;
		List<String> list = new ArrayList<>(m);
		for (int i = 1; i <= n; i++) {
			if (used[i]) {
				continue;
			}
			for (int j = start; j > 0; j--) {
				if (set.contains(j)) {
					start = j - 1;
					continue;
				}
				int i2 = i + j;
				int i3 = i + n;
				if (i2 > n) {
					i2 -= n;
					i3 -= n;
				}
				if (used[i2]) {
					continue;
				}
				if (!set.contains(i3 - i2)) {
					set.add(j);
					set.add(i3 - i2);
					used[i] = true;
					used[i2] = true;
					list.add(i + " " + i2);
					cnt++;
					if (cnt == m) {
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
