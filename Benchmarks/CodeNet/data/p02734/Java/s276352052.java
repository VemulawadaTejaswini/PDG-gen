import java.util.Scanner;

/**
 * Created by Harry on 3/29/20.
 */
// https://atcoder.jp/contests/abc159/submissions/11120535
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print(calc(n, target, nums));
    }

    public static int calc(int n, int target, int[] nums){
        int[][][] dp = new int[n][n][target+1];
        int mod = 998244353;
        for(int j=0; j<n; j++){
            for(int i=j; i>=0; i--){
                if(i==j){
                    if(nums[j]<=target){
                        dp[i][j][nums[j]]=1;
                    }
                    dp[i][j][0] = 1;
                }
                else{
                    dp[i][j][0] = 1;
                    for(int k=1; k<=target; k++){
                        dp[i][j][k] = (dp[i][j][k]+(k-nums[j] >=0 ? dp[i][j-1][k-nums[j]] : 0)+dp[i][j-1][k])%mod;
                    }
                }
//                System.out.println(i+","+j+","+dp[i][j][target]);
            }
        }
        long res = 0;
        for(int j=0; j<n; j++){
            for(int i=0; i<=j; i++){
                int count = 0;
                if(i==j){
                    count = dp[i][j][target];

                }
                else{
                    if(target-nums[i]-nums[j]<0){
                        count = 0;
                    }
                    else if(target-nums[i]-nums[j]==0){
                        count = i+1>j-1 ? 1 : dp[i+1][j-1][0];
                    }
                    else{
                        count = i+1>j-1 ? 0 : dp[i+1][j-1][target-nums[i]-nums[j]];
                    }
                }
//                System.out.println(i+","+j+","+count);
                res = (res+ (i+1)*(n-j)*count%mod)%mod;
            }
        }
        return (int)res;
    }
}
