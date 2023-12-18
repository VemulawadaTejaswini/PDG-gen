import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int h[]=new int[n];

		int dp[]=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=scan.nextInt();
			dp[i]=Integer.MAX_VALUE;
		}
		scan.close();

		dp[0]=0;

		for(int i=1;i<n;i++) {
			dp[i]= dp[i - 1] + Math.abs(h[i] - h[i - 1]);
	        if (i > 1) dp[i]= dp[i - 2] + Math.abs(h[i] - h[i - 2]);
		}

		System.out.println(dp[n-1]);
	}

}
