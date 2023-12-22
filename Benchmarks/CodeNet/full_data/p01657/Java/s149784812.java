import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int cnt[];
	int ans[];
	int info[][];
	boolean judge;
	int n, x, m;
	int max = 0;

	void run() {
		n = sc.nextInt();
		x = sc.nextInt();
		m = sc.nextInt();
		cnt = new int[n + 1];
		ans = new int[n + 1];
		info = new int[m][3];
		judge = false;
		for (int i = 0; i < m; i++) {
			info[i][0] = sc.nextInt();
			info[i][1] = sc.nextInt();
			info[i][2] = sc.nextInt();
		}
		Arrays.fill(ans, -1);
		dfs(0);
		if (ans[0] != -1) {
			System.out.println(-1);
		} else {
			for (int j = 1; j < n; j++) {
				System.out.print(ans[j] + " ");
			}
			System.out.println(ans[n]);
		}
	}

	void dfs(int oriCnt) {
		if (oriCnt == n + 1) {
			judge = false;
			for (int i = 0; i < m; i++) {
				int sum = 0;
				for (int j = info[i][0]; j <= info[i][1]; j++) {
					sum += cnt[j];
				}
				if (sum == info[i][2]) {
					judge = true;
				} else {
					judge = false;
				}
				if (!judge) {
					return;
				}
			}
			if (judge) {
				int sum = 0;
				for (int j = 1; j <= n; j++) {
					sum += cnt[j];
				}
				if (sum > max) {
					for (int k = 1; k <= n; k++) {
						ans[k] = cnt[k];
					}
				}
			}
			return;
		} else {
			for (int i = 0; i <= x; i++) {
				cnt[oriCnt] = i;
				dfs(oriCnt + 1);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}