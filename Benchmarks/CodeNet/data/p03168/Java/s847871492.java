import java.util.*;
 
public class Clase {
 
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		double [] dp = new double[n+1];
		dp[0] =1;
		
		for( int i=0; i<n; i++) {
			Double k = (double) in.nextInt();
			for(int j = i+1 ;j>=0; j--) {
				if( j== 0)
					dp[j] = dp[j]* (1-k);
				else
				dp[j] = dp[j-1]* k + dp[j]* ((double)1-k);
			}
		}
		double ans= 0;
		for(int i=n/2 + 1; i<=n; i++)
			ans+= dp[i];
		System.out.printf("%.18f",ans);
	       
	}
	
	
 
}

