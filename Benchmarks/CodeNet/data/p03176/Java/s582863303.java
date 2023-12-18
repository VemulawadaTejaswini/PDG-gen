import java.util.*;
import java.io.*;
public class Main {
    static long h[],arr[],dp[];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        h=new long[n];
        arr=new long[n];
        dp=new long[n];
        for(int i=0;i<n;i++) {
            h[i]=input.nextLong();
        }
        for(int i=0;i<n;i++) {
            arr[i]=input.nextLong();
            dp[i]=arr[i];
        }
        System.out.println(solve(n));
    }
    public static long solve(int n) {
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--) {
                if(h[j]<h[i]) {
                    dp[i]=Math.max(dp[i],dp[j]+arr[i]);
                }
            }
        }
        return dp[n-1];
    }
}
