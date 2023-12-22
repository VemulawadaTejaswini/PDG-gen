import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			System.out.println(dfs(N, 1, 0));
		}
	}

	static int dfs(int cur, int prev, int d) {
		if (cur == 0) return 1;
		if (d == 4) return 0;
		int ret = 0;
		for (int i = prev;; ++i) {
			int sq = i * i;
			if (sq > cur) break;
			ret += dfs(cur - sq, i, d + 1);
		}
		return ret;
	}

}