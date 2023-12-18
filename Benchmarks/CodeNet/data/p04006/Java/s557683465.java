import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x,kk,ans;
		int n;
		Scanner in =new Scanner(System.in);
		n=in.nextInt();x=in.nextLong();
		long []  a=new long[n+1000];
		long [][] dp = new long[n+500][n+500];
		for(int i=1;i<=n;i++) {
			a[i]=in.nextLong();
		}
		ans=9000000000000000000L;kk=-1;
		for(int i=1;i<=n;i++) {
			dp[i][0]=a[i];
			for(int k=1;k<n;k++) {
				int pi=i-k;
				if(pi<=0)pi=n+pi;
				if(dp[i][k-1]>=a[pi])dp[i][k]=a[pi];
				else dp[i][k]=dp[i][k-1];
//				if(bal1>a[pi] + ((long)k)*x) {
//					bal1=a[pi]+(k)*x;bal2=k;bal3=a[pi];
//				}
			}
//			if(bal2>kk)kk=bal2;
//			ans+=bal3;
			
		}
		long sum=0;
		for(int k=0;k<n;k++) {
			sum=0;
			for(int i=1;i<=n;i++) {
				sum+=dp[i][k];
			}
			if(sum<ans+k*x)ans=sum+k*x;
		}
		System.out.println(ans);
	}

}
