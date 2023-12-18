import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Main{
    
    static int[] mData = new int[100000];
    static int[] dp = new int[100000];

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            mData[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = Math.abs( mData[0] - mData[1] );

        for(int i = 2; i < N; i++){
            dp[i] = Math.min( dp[i-2] + Math.abs(mData[i] - mData[i-2]), 
                                dp[i-1] + Math.abs(mData[i] - mData[i-1]));
        }


        System.out.println(dp[N-1]);
        sc.close();
    }
}
