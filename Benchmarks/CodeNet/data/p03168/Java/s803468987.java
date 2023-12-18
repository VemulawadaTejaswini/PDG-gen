import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		float [] dp = new float[n+1];
		dp[0] =1;
		
		for( int i=0; i<n; i++) {
			float k =in.nextFloat();
			for(int j = i+1 ;j>=0; j--) {
				if( j== 0)
					dp[j] = dp[j]* (1-k);
				else
				dp[j] = dp[j-1]* k + dp[j]* (1-k);
				//System.out.print(dp[j] + " ");
			}
			//System.out.println();
		}
		
		/*for(int i=1; i<=n; i++)
			System.out.print(dp[i] + " ");
		    System.out.println();*/
		float ans= 0;
		for(int i=n/2 + 1; i<=n; i++)
			ans+= dp[i];
		System.out.println(ans);
	       
	}
	
	

}
