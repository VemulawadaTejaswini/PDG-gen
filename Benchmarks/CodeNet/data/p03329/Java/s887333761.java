import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {1,6,9,39,81,216,729,1296,6561,7776,46656,59049};
        int dp[] = new int[100005];
        dp[0] =0;

        for(int i=1; i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<a.length; j++){
                if(i>=a[j]){
                    min = Math.min(min,Math.min(dp[i-1]+1,dp[i-a[j]]+1));
                }
            }
            dp[i] = min;
        }
        System.out.println(dp[n]);
    }
}
