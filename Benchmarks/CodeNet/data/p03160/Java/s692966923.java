import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    public static long []dp = new long[110000];
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n; n = in.nextInt();
        long []heights = new long[n];

        for(int i = 0; i < n; i ++)
            heights[i] = in.nextLong();

        dp[0] = 0;
        for (int i = 1; i < n; i ++){
            if(i != 1)
                dp[i] = Math.min(dp[i-1]+Math.abs(heights[i]-heights[i-1]), dp[i-2]+Math.abs(heights[i]-heights[i-2]));
            else
                dp[i] = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
        }

        System.out.println(dp[n-1]);
    }
}