import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long w = sc.nextLong();
    	int maxSumVal = 10;
    	long[] wei = new long[n + 10];
    	int[] val = new int[n + 10];
    	for(int i = 0 ; i < n ; i++) {
    		wei[i] = sc.nextLong();
    		val[i] = sc.nextInt();
    		maxSumVal += val[i];
    	}

    	long[][] dp = new long[n + 10][maxSumVal];
    	for(int i = 0 ; i < n + 10 ; i++) {
    		Arrays.fill(dp[i], Long.MAX_VALUE / 2);
    	}
    	dp[0][0] = 0;  //初期条件！！！！！
    	for(int i = 0 ; i < n ; i++) {
    		for(int sumVal = 0 ; sumVal < maxSumVal ; sumVal++) {
    			if(sumVal - val[i] >= 0) {
    				dp[i + 1][sumVal] = Math.min(dp[i + 1][sumVal], dp[i][sumVal - val[i]]  + wei[i]);
    			}
    			else {
    				dp[i + 1][sumVal] = Math.min(dp[i + 1][sumVal] , dp[i][0] + wei[i]);
    			}
    			dp[i + 1][sumVal] = Math.min(dp[i + 1][sumVal], dp[i][sumVal]);
    		}
    	}
    	sc.close();
    	long ans = Integer.MIN_VALUE;
    	for(int i = 0 ; i < maxSumVal ; i++) {
    		if(dp[n][i] > w)
    			break;
    		ans = i;
    	}
    	System.out.println(ans);
    }

}
