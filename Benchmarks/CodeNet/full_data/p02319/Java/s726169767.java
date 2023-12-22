import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] dp = new long[10010];
		Arrays.fill(dp, 1000000010L);
		dp[0] = 0;
		int k=0, sum=0;
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			sum += v;
			for(int j=sum; j>=v; j--) {
				dp[i] = Math.min(dp[i], dp[i-v]+w);
			}
		}
		for(int i=sum; i>=1; i--) {
			if(dp[i]<=m) {
				k = i;
				break;
			}
		}
		System.out.println(k);
		sc.close();
	}
}
