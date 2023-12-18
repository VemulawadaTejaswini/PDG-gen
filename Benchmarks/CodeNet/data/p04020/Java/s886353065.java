import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		long ans = 0;
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
			ans+=a[i]/2;
			a[i]%=2;
		}
		int dp[] = new int[n];
		if(a[1]==a[0] && a[1]==1) {
			dp[1] =1 ;
		}
		for(int i=2;i<n;i++) {
			if(a[i]==a[i-1] && a[i]==1) {
				dp[i] = dp[i-2]+1;
			}
			dp[i] = Math.max(dp[i],dp[i-1]);
		}
		ans+=dp[n-1];
		System.out.println(ans);
	}
}
