import java.util.Scanner;

//https://atcoder.jp/contests/dp/tasks/dp_m
/**
 * Created by Harry on 3/30/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(calc(n,k,A));
    }

    public static int calc(int n, int k, int[] A){
        int mod = 1000000007;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j=k; j>=0; j--){
                dp[j] = (dp[j]-(j-A[i]-1>=0 ? dp[j-A[i]-1] : 0)+mod)%mod;
            }
            for(int j=1; j<=k; j++){
                dp[j] = (dp[j]+dp[j-1])%mod;
            }
        }
        return dp[k];
    }

    //O(N^2*K)
//    public static int calc(int n, int k, int[] A){
//        int mod = 1000000007;
//        int[] dp = new int[k+1];
//        dp[0] = 1;
//        for(int i=0; i<n; i++){
//            for(int j=k; j>=0; j--){
//                int curRes = 0;
//                for(int l=0; l<=A[i]; l++){
//                    if(j-l<0){
//                        break;
//                    }
//                    curRes = (curRes + dp[j-l])%mod;
//                }
//                dp[j] = curRes;
//            }
//        }
//        return dp[k];
//    }
}
