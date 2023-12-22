import java.util.Arrays;
import java.util.Scanner;


public class Main {

	private static int[][] cache;
	private static char[] x;
	private static char[] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int set = sc.nextInt();

		for (int k = 0; k < set; k++) {
			x = sc.next().toCharArray();
			y = sc.next().toCharArray();
			int m = x.length;
			int n = y.length;
			
			// 再帰的トップダウン型、履歴管理
			cache = new int[m + 1][n + 1];
			for (int i = 1; i <= m; i++) {
				Arrays.fill(cache[i], Integer.MIN_VALUE);
				cache[i][0] = 0;
			}
			Arrays.fill(cache[0], 0);
			
			System.out.println(lcs(m, n));
		}
		
         sc.close();
	}

	private static int lcs(int m, int n) {
		if (cache[m][n] != Integer.MIN_VALUE) {
			return cache[m][n];
		}
		
		int result;
		if (x[m - 1] == y[n - 1]) {
			result = lcs(m - 1, n - 1) + 1;
		} else {
			result = Math.max(lcs(m - 1, n), lcs(m, n - 1));
		}
		
		cache[m][n] = result;
		return result;
	}
}