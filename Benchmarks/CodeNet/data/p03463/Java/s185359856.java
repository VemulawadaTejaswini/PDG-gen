import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		int S=0;
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		S+=a[i];
		}
		int s=S/2;
		Arrays.sort(a);
//		int b=0;int c=0;
//		for(int i=n;i>=1;i--) {
//			if(b<c)b+=a[i];
//			else c+=a[i];
//		}
//		if(b<c)System.out.println(c);
//		else System.out.println(b);
		int dp[][]=new int[n+1][s+1];
		for(int i=0;i<=s;i++)dp[0][i]=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=s;j++) {
				if(j>=a[i]) {
					dp[i+1][j]=Math.max(dp[i][j-a[i]]+a[i],dp[i][j]);
//					System.out.println("dp["+(i+1)+"]["+j+"]="+Math.max(dp[i][j-a[i]]+a[i],dp[i][j]));
				}
				else {
					dp[i+1][j]=dp[i][j];
//					System.out.println("dp["+(i+1)+"]["+j+"]="+dp[i][j]);
				}
			}
		}
		System.out.println(S-dp[n][s]);


	}
}
