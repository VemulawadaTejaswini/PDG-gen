import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[100010];
		int n=sc.nextInt();
		int mm=0;
		long m=0;
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
			mm=Math.max(mm, a[i]);
		}
		if(mm<100000) {
			long[] dp= new long[mm+1];
			for(int i=1; i<=n; i++) {
				if(a[i]==0) {
					dp[a[i]]=1;
				}
				else {
					dp[a[i]]=dp[a[i]-1]+1;
				}
					for(int j=a[i]+1; j<=mm; j++) {
						dp[j]=Math.max(dp[a[i]], dp[j]);
					}
			}
			m=dp[mm];
		}
		else {
			long[] dp= new long[100010];
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
		}
		System.out.println(m);
	}
}
