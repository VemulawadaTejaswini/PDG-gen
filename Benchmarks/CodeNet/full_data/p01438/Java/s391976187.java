import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, ans;
	static int[] L, times;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			times = new int[N];
			L = new int[N];
			for (int i = 0; i < N; ++i) {
				int M = sc.nextInt();
				L[i] = sc.nextInt();
				for (int j = 0; j < M; ++j) {
					int S = sc.nextInt();
					int E = sc.nextInt();
					for (int k = S; k < E; ++k) {
						times[i] |= (1 << k);
					}
				}
			}
			ans = 0;
			dfs(0, 0, 0);
			System.out.println(ans);
		}
	}

	static void dfs(int cur, int st, int sum) {
		if (cur == N) {
			ans = Math.max(ans, sum);
			return;
		}
		if ((st & times[cur]) == 0) {
			dfs(cur + 1, st | times[cur], sum + L[cur]);
		}
		dfs(cur + 1, st, sum);
	}

}