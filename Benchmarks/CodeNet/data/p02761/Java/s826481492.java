import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			if (ans[s] == -1) {
				ans[s] = c;
			} else if (ans[s] != c) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}
		sc.close();

		if (m == 0) {
			if (n == 1) {
				System.out.println(0);
			} else if (n == 2) {
				System.out.println(10);
			} else {
				System.out.println(100);
			}
			return;
		}
		boolean flg = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] <= 0) {
				if (flg) {
					sb.append(0);
				} else {
					if (ans[i] == 0) {
						System.out.println(-1);
						return;
					}
					sb.append(1);
					flg = true;
				}
			} else {
				sb.append(ans[i]);
				flg = true;
			}
		}
		System.out.println(sb.toString());
	}
}
