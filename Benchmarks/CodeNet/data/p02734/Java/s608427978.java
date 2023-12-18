import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		long MOD = 998244353;
		long dp[] = new long[S + 1];
		long result = 0;
		for(int R = 0 ; R < N ; ++R){
			int a = sc.nextInt();
			for(int i = S ; i >= a ; --i){
				if(i > a){
					dp[i] = (dp[i - a] + dp[i]) % MOD;
				}else if(i == a){
					dp[i] = (dp[i] + (R + 1) ) % MOD;
				}
			}
			result = (result + dp[S]) % MOD;
		}
		System.out.println(result);
	}
}
