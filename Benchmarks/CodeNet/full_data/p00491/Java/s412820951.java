import java.util.*;
import java.io.IOException;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	int K = sc.nextInt();
    	int[] listA = new int[K];
    	int[] listB = new int[K];
    	for(int i = 0; i < K; i++) {
    		listA[i] = sc.nextInt();
    		listB[i] = sc.nextInt();
    	}
    	
    	int[][] dp = new int[n][27];
    	IN:for(int i = 0; i < n; i++) {
    		if(i == 0) {
    			for(int j = 0; j < K; j++) {
    				if(1 == listA[j]) {
    					int k = listB[j]-1;
    					dp[0][k] = 1;
    					continue IN;
    				}
    			}
    			for(int j = 0; j < 3; j++) {
    				dp[0][j] = 1;
    			}
    			continue IN;
    		}
    		if(i == 1) {
    			for(int j = 0; j < K; j++) {
    				if(2 == listA[j]) {
    					int tmp = listB[j]-1;
    					for(int k = 0; k < 9; k++) {
    						if(k % 3 == tmp) {
    							dp[1][k] = dp[0][k/3];
    						}
    					}
    					continue IN;
    				}
    			}
    			for(int j = 0; j < 9; j++) {
    				dp[1][j] = dp[0][j/3];
    			}
    			continue IN;
    		}
    		for(int j = 0; j < K; j++) {
    			if(i+1 == listA[j]) {
    				for(int k = 0; k < 27; k++) {
    					if(k % 3 == listB[j]-1 && !(k%3 == (k%9)/3 && (k%9)/3 == k/9)) {
    						dp[i][k] += dp[i-1][(k/9)*3 + (k%9)/3] + dp[i-1][9 + (k/9)*3 + (k%9)/3] + dp[i-1][18 + (k/9)*3 + (k%9)/3];
    					}
    				}
    				continue IN;
    			}
    		}
    		for(int k = 0; k < 27; k++) {
				if(!((k%3) == (k%9)/3 && (k%9)/3 == k/9)) {
					dp[i][k] += dp[i-1][(k/9)*3 + (k%9)/3] + dp[i-1][9 + (k/9)*3 + (k%9)/3] + dp[i-1][18 + (k/9)*3 + (k%9)/3];
				}
			}
    	}
    	int sum = 0;
    	for(int i = 0; i < 27; i++) {
    		sum += dp[n-1][i] % 10000;
    		sum %= 10000;
    	}
    	System.out.println(sum);
    }
}