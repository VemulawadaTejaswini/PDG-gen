import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		long C=Long.parseLong(in.next()), x[]=new long[n+1], v[]=new long[n+1];
		x[0]=0; v[0]=0;
		
		for(int i=1;i<=n;i++) {
			x[i]=Long.parseLong(in.next()); v[i]=Long.parseLong(in.next());
		}
		
		long dp[]=new long[n+1];
		
		for(int i=1;i<=n;i++) {
			dp[i]=Math.max(dp[i-1], dp[i-1]+v[i]-(x[i]-x[i-1]));
		}
		System.out.println(dp[n]);
	}

}
