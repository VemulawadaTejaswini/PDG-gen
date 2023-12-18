import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static long x;
	static int[] c;
	static int[][] a;
	
	static int minC = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		
		c = new int[n];
		a = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			Arrays.setAll(a[i], idx -> sc.nextInt());
		}
		
		dfs(0, new int[m], 0, true);
		dfs(0, new int[m], 0, false);
		
		int ans = minC == Integer.MAX_VALUE ? -1 : minC;
		System.out.println(ans);
		
		sc.close();
	}
	
	static void dfs(int sumC, int[] sumA, int idx, boolean buy) {
		if (idx == n) {
			if (checkSkill(sumA))
				minC = Math.min(minC, sumC);
			return;
		}
		
		if (buy) {
			sumC += c[idx];
			for (int i = 0; i < m; i++) {
				sumA[i] += a[idx][i];
			}
		}
		
		dfs(sumC, Arrays.copyOf(sumA, m), idx + 1, true);
		dfs(sumC, Arrays.copyOf(sumA, m), idx + 1, false);
		
	}
	
	static boolean checkSkill(int[] arr) {
		for (int num : arr)
			if (num < x) return false;
		return true;
	}
}


