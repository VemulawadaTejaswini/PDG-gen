import java.util.Scanner;

public class Main {

	static int n, a[] = new int[3], l[];

	public static int solve(int cur, int c, int d, int e) {
		if (cur == n) {
			int tmp = 0;
			int b[] = new int[3];
			b[0] = c;
			b[1] = d;
			b[2] = e;
			int min = c;
			for (int i = 0; i < 3; ++i) {
				min = Math.min(min, b[i]);
			}
			if (min <= 0)
				return 1000000000;
			for (int i = 0; i < 3; ++i)
				tmp += Math.abs(b[i] - a[i]);
			tmp -= 30;
			return tmp;
		}
		int ans[] = new int[4];
		ans[0] = solve(cur + 1, c, d, e);
		ans[1] = solve(cur + 1, c + l[cur], d, e) + 10;
		ans[2] = solve(cur + 1, c, d + l[cur], e) + 10;
		ans[3] = solve(cur + 1, c, d, e + l[cur]) + 10;
		int min = ans[0];
		for(int i = 0; i < 4; ++i) {
			min = Math.min(min,  ans[i]);
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < 3; ++i)
			a[i] = sc.nextInt();
		l = new int[n];
		for (int i = 0; i < n; ++i) {
			l[i] = sc.nextInt();
		}
		sc.close();
		int ans = solve(0, 0, 0, 0);
		System.out.println(ans);
	}

}
