import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long dp[] = new long[100100];
        Arrays.fill(dp,Integer.MAX_VALUE);
        int h[] = new int[n+101];
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j =1; j<=k; j++){
                dp[i+j] = Math.min(dp[i+j],dp[i] + Math.abs(h[i]-h[i+j]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
