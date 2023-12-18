import java.util.*;

public class Main {

	public static int countTruth(int a[]) {
		int n = a.length, ans = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] != 0) {
				if (a[i] == 1)
					++ans;
			}
		}
		return ans;
	}

	public static int solve(int s[][], int n) {
		int ans = 0, max = 0, cnt = 0;
		if (n <= 1)
			return 1;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (j != i && s[i][j] == 1) {
					++cnt;
					if (s[j][i] != -1)
						ans += countTruth(s[j]);
				}
			}
			max = Math.max(max, ans);
		}
		if(cnt == 0)return 1;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[][] = new int[n][n];
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			for (int j = 0; j < a; ++j) {
				int x = sc.nextInt(), y = sc.nextInt();
				if (y == 0)
					y = -1;
				s[i][x - 1] = y;
			}
		}
		int ans = solve(s, n);
		sc.close();
		System.out.println(ans);
	}
}
