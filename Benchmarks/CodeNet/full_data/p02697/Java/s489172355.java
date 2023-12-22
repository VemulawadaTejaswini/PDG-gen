import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		boolean[] used = new boolean[n + 1];
		Set<Integer> set = new HashSet<>();
		int start = 1;
		int cnt = 0;
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i <= n; i++) {
			if (used[i]) {
				continue;
			}
			for (int j = start; j < n; j++) {
				if (set.contains(j)) {
					start = j + 1;
				}
				int i2 = i + j;
				i2 %= n;
				if (used[i2]) {
					continue;
				}
				int i3 = i + n;
				if (!set.contains(i3 - i2)) {
					set.add(j);
					set.add(i3 - i2);
					used[i] = true;
					used[i2] = true;
					pw.println(i + " " + i2);
					cnt++;
					if (cnt == m) {
						pw.flush();
						return;
					}
					break;
				}
			}
		}
	}
}
