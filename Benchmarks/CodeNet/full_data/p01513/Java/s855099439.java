import java.util.HashSet;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			@SuppressWarnings("rawtypes")
			HashSet[] set = new HashSet[n + 1];
			for (int i = 1; i <= n; i++) {
				int m = sc.nextInt();
				set[i] = new HashSet<Integer>();
				for (int j = 0; j < m; j++) {
					int p = sc.nextInt();
					set[i].add(p);
				}
			}
			int k = sc.nextInt();
			int[] list = new int[k];
			for (int i = 0; i < k; i++) {
				list[i] = sc.nextInt();
			}
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				boolean flag = true;
				for (int j = 0; j < k; j++) {
					if (!set[i].contains(list[j])) {
						flag = false;
						break;
					}
				}
				if (flag) {
					if (ans == 0)
						ans = i;
					else {
						ans = -1;
						break;
					}
				}
			}
			if (ans == 0)
				ans = -1;
			System.out.println(ans);
		}
	}
}