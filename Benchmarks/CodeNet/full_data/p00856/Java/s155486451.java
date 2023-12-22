import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();
			if (n == 0) {
				break;
			}
			boolean[] lose = new boolean[n+1];
			boolean[] back = new boolean[n+1];
			for(int i=0;i<l;i++) {
				lose[sc.nextInt()] = true;
			}
			for(int i=0;i<b;i++) {
				back[sc.nextInt()] = true;
			}
			double[][] dp = new double[t+1][n+1];
			dp[0][0] = 1;
			for(int i=0;i<t;i++) {
				for(int j=0;j<n;j++) {
					for(int k=1;k<=6;k++) {
						int next = j + k;
						if (next > n) {
							next = n - (next - n);
						}
						if (lose[next]) {
							if (i < t - 1) {
								dp[i+2][next] += dp[i][j] / 6;
							}
						}else if(back[next]) {
							dp[i+1][0] += dp[i][j] / 6;
						}else{
							dp[i+1][next] += dp[i][j] / 6;
						}
					}
				}
			}
			double sum = 0;
			for(int i=0;i<=t;i++) {
				sum += dp[i][n];
			}
			System.out.printf("%.7f\n",sum);
		}
	}

}