import java.util.Scanner;

public class Main{
	static int[]c;
	static int n, m;
	static final int MAX = 50000;
	static final int INF = (1<<21);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		c = new int[m + 1];
		for(int i = 0; i < m; i++) {
			c[i + 1] = scan.nextInt();
		}
		scan.close();
		solve();
	}
	static void solve() {
		int[]T = new int[n + 1];
		for(int i = 0; i <= n; i++) {
			T[i] = INF;
		}
		T[0] = 0;
		for(int i = 1; i <= m; i++) {
			for(int j = 0; j + c[i] <= n; j++) {
				T[j + c[i]] = Math.min(T[j + c[i]], T[j] + 1);
			}
		}
		System.out.println(T[n]);
	}
}
