import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int cnt[];
	int info[][];
	boolean judge;
	int n, x, m;

	void run() {
		n = sc.nextInt();
		x = sc.nextInt();
		m = sc.nextInt();
		cnt = new int[n + 1];
		info = new int[m][3];
		judge = false;
		for (int i = 0; i < m; i++) {
			info[i][0] = sc.nextInt();
			info[i][1] = sc.nextInt();
			info[i][2] = sc.nextInt();
		}
		dfs(0);
		if (!judge) {
			System.out.println(-1);
		}
	}

	void dfs(int oriCnt) {
		if (judge) {
			return;
		}
		if (oriCnt == n + 1) {
			boolean use[] = new boolean[n + 1];
			for (int i = 0; i < m; i++) {
				int sum = 0;
				for (int j = info[i][0]; j <= info[i][1]; j++) {
					use[j] = true;
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
				for (int j = 1; j <= n; j++) {
					if (!use[j]) {
						cnt[j] = x;
					}
				}
				for (int j = 1; j < n; j++) {
					System.out.print(cnt[j] + " ");
				}
				System.out.println(cnt[n]);
			}
			return;
		} else {
			for (int i = 1; i <= x; i++) {
				cnt[oriCnt] = i;
				dfs(oriCnt + 1);
			}
		}
	}

	public static void main(String[] args) {
		new  Main().run();
	}
}