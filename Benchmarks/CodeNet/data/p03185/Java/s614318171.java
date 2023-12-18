import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long c=s.nextLong();
		long[] arr=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextLong();
		long[] dp=new long[n];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0]=0;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				dp[i]=Math.min(dp[i],dp[j]+c+(arr[i]-arr[j])*(arr[i]-arr[j]));
			}
		}
		System.out.println(dp[n-1]);
	}
}
