import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String args[]){

		Scanner s=new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();

		int[] pasta = new int[n];

		Arrays.fill(pasta, -1);
		for(int i=0; i<k; i++) {
			int day = s.nextInt()-1;
			pasta[day] = s.nextInt()-1;
		}

		int[][][] dp = new int[n][3][3]; // i日目,i-1目のpasta,i日目のpasta
		if(pasta[0] != -1) {
			dp[0][(pasta[0]+1)%3][pasta[0]] = 1;
		} else {
			dp[0][1][0] = dp[0][2][1] = dp[0][0][2] = 1;
		}

		for(int i=1; i<n; i++) {
			if(pasta[i]!=-1) {
				for(int j=0; j<3; j++) {
					dp[i][j][pasta[i]] += dp[i-1][(j+1)%3][j];
					dp[i][j][pasta[i]] += dp[i-1][(j+2)%3][j];
					if(j!=pasta[i]) dp[i][j][pasta[i]] += dp[i-1][j][j];
					dp[i][j][pasta[i]]%=10000;
				}
			} else {
				for(int j=0; j<3; j++) {
					for(int t=0; t<3; t++) {
						dp[i][j][t] += dp[i-1][(j+1) %3][j];
						dp[i][j][t] += dp[i-1][(j+2) %3][j];
						if(j!=t) dp[i][j][t] += dp[i-1][j][j];
						dp[i][j][t] %= 10000;
					}
				}
			}
		}

		int cnt=0;

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				cnt += dp[n-1][i][j];
			}
		}
		System.out.println(cnt%10000);

	}
}

