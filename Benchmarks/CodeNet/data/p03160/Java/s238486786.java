import java.util.*
import java.io.*
public class Sol{
	public static void main(String[] args) throws IOException{
    	Scanner sc = new Scanner;
    	int n = sc.nextInt();
        int frog[] = new int[n];
        int dp[] = new int[n];
    	for(int i=0; i<n; i++) {
    		frog[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[i] = Math.abs(frog[1]-frog[0]);
        for(int i=2; i<n; i++) {
        	first = Math.abs(frog[i]-frog[i-2]);
            second = Math.abs(frog[i]-frog[i-1]);
            dp[i] = Math.min(dp[i-2]+second, dp[i-1]+first);
        }
    }
}
