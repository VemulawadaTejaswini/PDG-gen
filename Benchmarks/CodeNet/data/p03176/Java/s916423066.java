import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] h=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=s.nextInt();
		}
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int[] dp=new int[n];
		for(int i=0;i<n;i++)
			dp[i]=a[i];
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(h[j]<h[i]) {
					dp[i]=Math.max(dp[i],dp[j]+a[i]);
				}
			}
		}
		System.out.println(dp[n-1]);
	}
	
	
	
}
