
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double dp[][] = new double[n+1][n+1];
		double p[] = new double[n+1];
		for (int i=1;i<=n;i++) 
			p[i] = sc.nextDouble();
		
		dp[0][0]= 1;
		for (int i=1;i<=n;i++)
			for (int j=0;j<=i;j++) {
				dp[i][j] =  dp[i-1][j] * (1-p[i]);
				if (j>0) dp[i][j] +=  dp[i-1][j-1] * p[i];
			}
		double ans = 0.0;
		for (int i=(n+1)/2;i<=n;i++)
			ans+=dp[n][i];
		System.out.println(ans);
		

	}
}
