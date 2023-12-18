import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(func(n,arr,k));
	}
	static int func(int n,int arr[],int k) {
		int dp[] = new int[n];
		dp[0] = 0;
		for(int i=1;i<n;i++) {
			int ans = Integer.MAX_VALUE;
			for(int j=1;j<=k;j++) {
				if(i-j>=0) {
					ans = Math.min(ans,Math.abs(arr[i]-arr[i-j])+dp[i-j]);
				}
			}
			dp[i] = ans;
		}
		return dp[n-1];
	}
}
