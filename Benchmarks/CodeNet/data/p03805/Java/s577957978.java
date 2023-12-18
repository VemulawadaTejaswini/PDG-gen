import java.util.Scanner;

/*
 * AtCoder Beginner Contest 054
 * 2017/02/11
 * C - One-stroke Path
 *
 * https://beta.atcoder.jp/contests/abc054/tasks/abc054_c
 * */
public class Main {

	static int[] a, b;
	static int N, M, ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M];
		b = new int[M];
		boolean[] flg = new boolean[N];

		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}

		int now = 0;
		flg[now] = true;
		dfs(now, flg);

		System.out.println(ans);
	}

	public static void dfs(int now, boolean[] flg) {
		for (int i = 0; i < M; i++) {
			if (a[i] == now && !flg[b[i]]) {
				flg[b[i]] = true;
				dfs(b[i], flg);
				flg[b[i]] = false;
			}
			if (b[i] == now && !flg[a[i]]) {
				flg[a[i]] = true;
				dfs(a[i], flg);
				flg[a[i]] = false;
			}
		}

		for ( int i = 0; i < N; i++) {
			if ( flg[i] == false) {
				return;
			}
		}
		ans++;
		return;
	}

}
