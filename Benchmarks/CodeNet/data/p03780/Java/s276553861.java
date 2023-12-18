import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long dp[][] = new long[n+1][5001];
		long rdp[][] = new long[n+1][5001];

		dp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				dp[i+1][j] += dp[i][j];
				if(j+a[i]>5000) {
					dp[i+1][5000]+=dp[i][j];
				}
				else {
					dp[i+1][j+a[i]]+=dp[i][j];
				}
			}	
		}
		
		rdp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				rdp[i+1][j] += dp[i][j];
				if(j+a[n-1-i]>5000) {
					rdp[i+1][5000]+=rdp[i][j];
				}
				else {
					rdp[i+1][j+a[n-1-i]]+=rdp[i][j];
				}
			}	
		}
		
		long rsum[][] = new long[n][5001];
		
		for(int i=0;i<n;i++) {
			rsum[i][5000] = rdp[i][5000];
			for(int j=5000;j>=1;j--) {
				rsum[i][j-1] = rsum[i][j] + rdp[i][j-1];
			}
		}
		

		int ans = 0;
		for(int i=1;i<=n;i++) {
			long s = 0, t = 0;
			for(int j=0;j<5001;j++) {
				//selfなしでKを超える組み合わせの数
				s += dp[i-1][j] * rsum[n-i][(int)Math.max(0,k-j)];
				//selfを必ず使って、 Kを越える組み合わせの数
				t += dp[i-1][j] * rsum[n-i][(int)Math.max(0,k-j-a[i-1])];
			}
			if(s==t)ans++;
		}
		
		
		System.out.println(ans);
		
	}
	
}


