import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = sc.next();
		int N = K.length();
		int D = Integer.parseInt(sc.next());
		int mod = 1_000_000_007;

		int[][][] dp = new int[N+1][D][2];
		dp[0][0][0]=1;
		for (int i=0;i<N;i++) {
			for (int j=0;j<D;j++) {
				for (int k=0;k<10;k++) {
					if (K.charAt(i)-48<k) {
						dp[i+1][(j+k)%D][0]+=0;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1])%mod;
					} else if (K.charAt(i)-48==k) {
						dp[i+1][(j+k)%D][0]=(dp[i+1][(j+k)%D][0]+dp[i][j][0])%mod;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1])%mod;
					} else if (K.charAt(i)-48>k) {
						dp[i+1][(j+k)%D][0]+=0;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1]+dp[i][j][0])%mod;
					}
				}
			}
		}
		System.out.println((dp[N][0][0]+dp[N][0][1]+mod-1) % mod);
	}
}