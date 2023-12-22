import java.util.Scanner;

public class Main {
	static int a, n, m;
	static int map[];
	static int coin[];
	static int dfs(int n) {
		if (n == 0) return 0;
		if (map[n] > 0) {
			return map[n];
		}
		int min = 10000000; 
		for (int i = 0; i < m; i++) {
			if (n - coin[i] < 0) continue;
			int c = dfs(n - coin[i]) + 1;
			if (c < min) min = c;
		}
		map[n] = min;
		return map[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		coin = new int[m];
		for (int i = 0; i < m; i++) {
			coin[i] = sc.nextInt();
		}
		map = new int[n+1];
		System.out.println(dfs(n));
	}
}