import java.util.Scanner;

public class Main {

	static int ans = -1001001001;
	static int[] a = new int[10];
	static int[][] f, p;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = new int[n][10];
		p = new int[n][11];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				f[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 11 ; j++) {
				p[i][j] = sc.nextInt();
			}
		}
		dfs(0);
		System.out.println(ans);
	}

	public static void dfs(int pos) {
		if(pos == 10) {
			if(check(a)) return;
			int score = func(a);
			ans = Math.max(ans, score);
			return;
		}
		a[pos] = 0; dfs(pos + 1);
		a[pos] = 1; dfs(pos + 1);
	}

	// 0000000000~1111111111で全部試して計算
	public static int func(int[] a) {
		int ret = 0;
		for(int i = 0 ; i < n ; i++) {
			int cnt = 0;
			for(int j = 0 ; j < 10 ; j++) {
				if((a[j]&f[i][j]) != 0) cnt++;
			}
			ret += p[i][cnt];
		}
		return ret;
	}

	// a[i]が全て0かどうかのチェック
	public static boolean check(int[] a) {
		boolean ok = true;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] == 1) ok = false;
		}
		return ok ? true : false;
	}

}