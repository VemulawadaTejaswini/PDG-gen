
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int A[] = new int[n];
		for(int i = 0;i < n;i++)A[i] = scan.nextInt();

		boolean dp[][] = new boolean[n+1][2001];
		for(int i = 0;i < n;i++)
			for(int j = 0;j <= 2000;j++)dp[i][j] = false;
		dp[0][0] = true;

		for(int j = 0;j <= 2000;j++) {
			for(int i = 0;i < n;i++) {
				dp[i+1][j] = j >= A[i] ? (dp[i][j - A[i]] || dp[i][j]) : dp[i][j];
			}
		}

		int q = scan.nextInt();
		for(int i = 0;i < q;i++) {
			int m = scan.nextInt();
			if(dp[n][m])System.out.println("yes");
			else System.out.println("no");
		}


		scan.close();
	}

}

