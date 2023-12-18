import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		//最初は表で裏の数（ans）を求める
		if(n == 1 || m == 1) {
			if(n == 1 && m == 1) ans = 1;
			else ans = n + m - 3;
		}else {
			int sq = n * m;
			int eg = 2*(m+n-2);
			ans = sq - eg;
		}
		System.out.println(ans);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void permutation(String q, String ans) { //Call permutation(String, "",) from outside
		if (q.length() <= 1)
			System.out.println(ans + q); //Fill in processing
		else
			for (int i = 0; i < q.length(); i++)
				permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
	}

	public static void combination(String q, String ans, int k) { //Call combination(String, "", n) from outside (nCr)
		if (ans.length() == k)
			System.out.println(ans); //Fill in processing
		else
			while (q.length() > 0) {
				combination(q.substring(1), ans + q.charAt(0), k);
				q = q.substring(1);
			}
	}

	long combination(int n, int r, int m) { //nCr mod m
		long[][] Combination = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Combination[i][0] = 1;
			for (int j = 1; j <= i; j++)
				Combination[i][j] = (Combination[i - 1][j - 1] + Combination[i - 1][j]) % m;
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