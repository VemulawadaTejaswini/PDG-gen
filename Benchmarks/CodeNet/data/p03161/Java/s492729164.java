import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{
    
    static int[] mData = new int[100000];
    static int[] dp = new int[100000];

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i = 0; i < N; i++){
            mData[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = Math.abs( mData[0] - mData[1] );

        for(int i = 2; i < N; i++){
            if(i - K < 0){
                int mmini = Math.abs( mData[0] - mData[i] );
                for(int j = 1; j < i; j++){
                    if(mmini > (dp[j] + Math.abs(mData[j]-mData[i])))
                        mmini = dp[j] + Math.abs(mData[j]-mData[i]);
                }
                dp[i] = mmini;
            }
            else{
                int mmini = Math.abs( mData[i-K] - mData[i] ) + dp[i-K];
                for(int j = i-K+1; j < i; j++){ 
                    if(mmini > (dp[j] + Math.abs(mData[j]-mData[i])))
                        mmini = dp[j] + Math.abs(mData[j]-mData[i]);
                }
                dp[i] = mmini;
            }
        }


        System.out.println(dp[N-1]);
        sc.close();
    }
}
