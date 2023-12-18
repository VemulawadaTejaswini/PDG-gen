import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n;
	static long INF = (long)1e18;
	static int[] v, w;
	static long[][] memo;
	
	public static long dp(int i, int r) {
		if(r < 0)
			return -INF;
		if(i == n || r == 0)
			return 0;
		if(memo[i][r] != -1)
			return memo[i][r];
		
		return memo[i][r] = Math.max(v[i] + dp(i + 1, r - w[i]), dp(i + 1, r));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int weight = sc.nextInt();
		
		v = new int[n];
		w = new int[n];
		for(int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		memo = new long[n][weight + 1];
		for(int i = 0; i < n; i++)
			Arrays.fill(memo[i], -1);
		
		System.out.println(dp(0, weight));
	}
}
