import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int A;
	static int B;
	static int C;
	static int[] l;
	static int mincost;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		mincost = 1000000000;
		dfs(0, 0, 0, 0, 0);
		System.out.println(mincost);
	}
	static void dfs(int cnt, int a, int b, int c, int cost) {
		if (cnt == n) {
			if (a == 0 || b == 0 || c == 0) {
				cost = 1000000000;
			} else {
				cost += Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
			}
			mincost = Math.min(mincost, cost);
			return;
		}
		dfs(cnt + 1, a, b, c, cost);
		dfs(cnt + 1, a + l[cnt], b, c, cost + 10);
		dfs(cnt + 1, a, b + l[cnt], c, cost + 10);
		dfs(cnt + 1, a, b, c + l[cnt], cost + 10);

	}
}