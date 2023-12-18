import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static long x;
	static int[] c;
	static int[][] a;
	
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
		
		int minCost = Integer.MAX_VALUE;
		for (int i = 0; i < 1 << n; i++) {
			int sumC = 0;
			int[] sumA = new int[m];
			
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					sumC += c[j];
					learn(sumA, a[j]);
				}
			}
			
			if (isEnoughSkill(sumA)) {
				minCost = Math.min(minCost, sumC);
			}
		}
		
		int ans = minCost == Integer.MAX_VALUE ? -1 : minCost;
		System.out.println(ans);
		
		sc.close();
	}
	
	static boolean isEnoughSkill(int[] sum) {
		for (int i = 0; i < m; i++) {
			if (sum[i] < x) return false;
		}
		return true;
	}
	
	static void learn(int[] sum, int[] a) {
		for (int i = 0; i < m; i++) {
			sum[i] += a[i];
		}
	}
	
}


