import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int n=sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int dp[][] = new int[n+1][h+1];
		dp[0][0]=0;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=a[i]; j++) {
				dp[i][j]=b[i];
			}
		}
		for(int i=1; i<=h; i++) {
			dp[0][i]=Integer.MAX_VALUE;
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=h; j++) {
				int c=j/a[i]+1;
				if(j-a[i]>=0) {
					dp[i][j]=Math.min(dp[i-1][j], dp[i][j-a[i]] + b[i]);
				}
			}
		}
		System.out.println(dp[n][h-1]);
		sc.close();
	}
}
