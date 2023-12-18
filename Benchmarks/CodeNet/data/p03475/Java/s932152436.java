import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long eki[][] = new long[3][n-1];
		for(int i=0;i<n-1;i++) {
			eki[0][i]=sc.nextInt();
			eki[1][i]=sc.nextInt();
			eki[2][i]=sc.nextInt();
		}
		long ichiji = 0;
		long dp[] = new long[n];
		for(int i=0;i<n;i++) {
			dp[i]=0;
		}

		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n-1;j++) {

				if(dp[i]<=eki[1][j]) {
					dp[i]= eki[1][j]+eki[0][j];
				}
				else {
					ichiji = (dp[i]-eki[1][j])/eki[2][j];
					dp[i]=(ichiji)*eki[2][j]+eki[1][j]+eki[0][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(dp[i]);
		}



	}

}
