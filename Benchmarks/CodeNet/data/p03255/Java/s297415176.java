import java.util.*;
import java.io.*;

public class Main {
    public static long solve(int N, long X, long[] x){
        long[] dp = new long[N];
        //total cost when trash 0~i are put into the garbage box
        //the final answer is dp[N-1]
        
        dp[0] = x[0] + X + 4*x[0] + X;
        
        for(int n=1;n<N;n++){
        	//not pick up the other trash
        	dp[n] = x[n] + X + 4*x[n] + X + dp[n-1];
        	//try to pick some trash
        	long energy = x[n];
        	energy += X;
        	long trash = 1;
        	for(int m=n-1;m>=0;m--){
        	    energy += (x[m+1]-x[m])*(trash+1)*(trash+1)+X;
        	    trash++;
        	    long cur = energy + x[m]*(trash+1)*(trash+1) + X + (m>0 ? dp[m-1] : 0);
        	    dp[n] = Math.min(dp[n], cur);
        	}
        }
        return dp[N-1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] x = new long[N];
        for(int n=0;n<N;n++)x[n]=sc.nextLong();
      
        System.out.println(solve(N,X,x));
    }
}