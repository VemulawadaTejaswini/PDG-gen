import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int N;
	static long[] a;
	static long[][] dp;
	static long f(int i, int j) {
		if(i == j) return ((N + i - j - 1) % 2 == 0) ? a[i] : -a[i];
		if(dp[i][j] != Long.MIN_VALUE) return dp[i][j];
		if((N + i - j - 1) % 2 == 0) {
			return dp[i][j] = Math.max(f(i + 1, j) + a[i], f(i, j - 1) + a[j]);
		}else {
			return dp[i][j] = Math.min(f(i + 1, j) - a[i], f(i, j - 1) - a[j]);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			N = sc.nextInt();
			a = new long[N];
			dp = new long[N][N];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < N; i++)  Arrays.fill(dp[i], Long.MIN_VALUE);
			System.out.println(f(0, N - 1));
		}
	}
}