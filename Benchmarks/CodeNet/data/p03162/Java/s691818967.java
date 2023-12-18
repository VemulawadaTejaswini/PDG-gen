import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        long []dp = new long[3];
        dp[0] = in.nextLong();
        dp[1] = in.nextLong();
        dp[2] = in.nextLong();
        for(int i=1;i<n;i++){
            long [] curr = new long[3];
            long [] temp_dp = new long[3];
            for(int k = 0;k<3;++k)curr[k] = in.nextLong();
            for(int k =0 ;k<3;++k){
                for(int j=0;j<3;j++){
                    if(k==j)continue;
                    temp_dp[k]= Math.max(temp_dp[k],dp[j]);
                }
                temp_dp[k]+=curr[k];
            }
            dp = temp_dp;
        }
        long ret = 0;
        for(long i : dp)ret = Math.max(ret,i);
        System.out.println(ret);
    }
}
