import java.util.*;
public class Main {

	public static void main(String[] args) {
		int mod = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[][] com = new long[2001][2001];
		for(int i = 0; i < 2001; i++)
			com[i][0] = 1;
		for(int i = 1; i < 2001; i++) {
			for(int j = 1; j <= i; j++) {
				com[i][j] = com[i-1][j-1] + com[i-1][j];
				com[i][j] %= mod;
			}
		}
		for(int i = 1; i <= K; i++) {
			long ans = com[N-K+1][i]*com[K-1][i-1];
			ans %= mod;
			System.out.println(ans);	
		}

	}

}
