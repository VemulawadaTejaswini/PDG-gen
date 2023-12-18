import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[] x = new int[900001];
		int[] y = new int[900001];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int tmp = sc.nextInt();
				x[tmp] = i;
				y[tmp] = j;
			}
		}
		int q = sc.nextInt();
		int L;
		int R;
		for(int i = 0; i < q; i++) {
			L = sc.nextInt();
			R = sc.nextInt();
			int ans = 0;
			for(; L != R; L += d) {
				ans += Math.abs(x[L]-x[L+d])+Math.abs(y[L]-y[L+d]);
			}
			System.out.println(ans);
		}
		sc.close();
		
		
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	long combination(int n, int r, int m) { //nCr mod m
		long[][] Combination = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Combination[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				Combination[i][j] = (Combination[i - 1][j - 1] + Combination[i - 1][j]) % m;
			}
		}
		return Combination[n][r];
	}

	int gcd(int a, int b) {
		if (a < b) {
			int c = a;
			a = b;
			b = c;
		}
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}