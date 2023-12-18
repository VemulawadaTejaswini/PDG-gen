import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                arr[i]=scan.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
        }
        System.out.println(dp[n-1]);
    }
}
