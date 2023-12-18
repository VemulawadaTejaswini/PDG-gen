import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] A = new long[N+1];
        for(int i=1;i<=N;i++){
            A[i] = sc.nextLong();
        }
        long[] dp = new long[N+1];
        long[] end = new long[N+1];
        long[] sum = new long[N+1];
        for(int i=1;i<=N;i++){
            sum[i] = sum[i-1]+A[i];
        }
        for(int i=1;i<=N;i++){
            if(sum[i]<M) continue;
            long cur = 0;
            for(int j=i;j>=1;j--){
                cur += A[j];
                if(cur%M==0){
                    end[i] = end[j-1]+1;
                    break;
                }
            }
            dp[i] = dp[i-1] + end[i];
        }
        System.out.println(dp[N]);
    }
}