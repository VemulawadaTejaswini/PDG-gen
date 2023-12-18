import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        boolean[] dp = new boolean[N];
        for(int n=0;n<N;n++){
        	String cut = S.substring(0,n+1);
        	if(cut.endsWith("dream")&&n>=4) dp[n]=dp[n]||(n==4)||dp[n-5];
        	if(cut.endsWith("dreamer")&&n>=6) dp[n]=dp[n]||(n==6)||dp[n-7];
        	if(cut.endsWith("erase")&&n>=4) dp[n]=dp[n]||(n==4)||dp[n-5];
        	if(cut.endsWith("eraser")&&n>=5) dp[n]=dp[n]||(n==5)||dp[n-6];
        }
        System.out.println(dp[N-1] ? "YES" : "NO");
    }
}
