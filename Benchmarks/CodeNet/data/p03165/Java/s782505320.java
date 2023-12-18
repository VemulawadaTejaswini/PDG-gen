/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    public static String longestCommonSubsequence(String text1, String text2) {
        if(text1.length() == 0 || text2.length() == 0 ) return "";
        int n = text1.length();
        int m = text2.length();
        String str = "";
        int dp[][] = new int[n+1][m+1];
        for(int i =1; i<=n ;i++) {
            for (int j =1; j<=m ;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1+dp[i-1][j-1];
                   
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i = n;
        int j = m;
        StringBuilder sb = new StringBuilder();
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i-1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j-1]) {
                j--;
            } else {
                sb.append(text2.charAt(j-1));
                i--;
                j--;
            }
        }
       return sb.reverse().toString();
        
    }
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    String s1 = s.next();
	    String s2 = s.next();
	    System.out.println(longestCommonSubsequence(s1, s2));
	    
	}
}