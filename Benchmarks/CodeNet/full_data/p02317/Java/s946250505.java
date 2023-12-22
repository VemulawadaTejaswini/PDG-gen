import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] dp= new long[100010];
		long[] a=new long[100010];
		int n=sc.nextInt();
		long m=0;
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			if(a[i]==0) {
				dp[i]=1;
			}
			for(int j=i-1; j>=0; j--) {
				if(a[i]>a[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
			m=Math.max(m, dp[i]);
		}
		System.out.println(m);
	}
}
