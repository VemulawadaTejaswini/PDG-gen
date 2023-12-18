import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = sc.next();
		int N = K.length();
		int D = Integer.parseInt(sc.next());
		int mod = 1_000_000_007;

		int[] Remainder = new int[Math.min(10,D)];
		for (int i=0;i<Math.min(10,D);i++) {
			// int tmp;
			// if (i==0) {
			// 	tmp = 0;
			// } else {
			// 	tmp = i%D;
			// }
			// Remainder[tmp]++;
			Remainder[i]=1;
		}
		// System.out.println((int)K.charAt(1));
		// System.out.println(K.charAt(0));
		// System.out.println(K.charAt(1));

		long[][][] dp = new long[N+1][D][2];
		dp[0][0][0]=1;
		dp[0][0][1]=0;
		for (int i=0;i<N;i++) {
			for (int j=0;j<D;j++) {
				// for (int k=0;k<Math.min(10,D);k++) {
				for (int k=0;k<10;k++) {
					if (K.charAt(i)-48<k) {
						dp[i+1][(j+k)%D][0]+=0;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1])%mod;
						// dp[i+1][(j+k)%D][1]+=dp[i][j][1]*Remainder[k];
					} else if (K.charAt(i)-48==k) {
						dp[i+1][(j+k)%D][0]=(dp[i+1][(j+k)%D][0]+dp[i][j][0])%mod;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1])%mod;
						// System.out.println(K.charAt(i)-48);
						// System.out.println(i + " " + k);
						// dp[i+1][(j+k)%D][0]+=dp[i][j][0]*Remainder[k];
						// dp[i+1][(j+k)%D][1]+=dp[i][j][1]*Remainder[k];
					} else if (K.charAt(i)-48>k) {
						dp[i+1][(j+k)%D][0]+=0;
						dp[i+1][(j+k)%D][1]=(dp[i+1][(j+k)%D][1]+dp[i][j][1]+dp[i][j][0])%mod;
						// dp[i+1][(j+k)%D][1]+=dp[i][j][1]*Remainder[k]+dp[i][j][0]*Remainder[k];
					}
				}
			}
		}
		System.out.println((dp[N][0][0]+dp[N][0][1]-1) % mod);
	}
}