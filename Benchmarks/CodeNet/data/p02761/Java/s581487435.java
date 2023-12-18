import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];

		for (int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		//s,cの値を代入していく。コンフリクトが発生したらfalse.
		for (int i = 0; i < m; i++) {
			if (ans[s[i] - 1] != -1 && ans[s[i] - 1] != c[i]) {
				System.out.println(-1);
				return;
			}
			ans[s[i] - 1] = c[i];
		}

		boolean flag = true;
		for (int i = 0; i < m; i++) {
			if (flag && ans[i] == 0 && i != n - 1) {
				System.out.println(-1);
				return;
			} else if (flag && ans[i] == -1) {
				System.out.print(1);
				flag = false;
			} else if (!flag && ans[i] == -1) {
				System.out.print(0);
			} else {
				System.out.print(ans[i]);
				flag = false;
			}
		}

	}

}
