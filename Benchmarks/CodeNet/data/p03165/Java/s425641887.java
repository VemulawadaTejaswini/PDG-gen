import java.util.*;
import java.lang.*;

public class Main {
  
    public int dp(String s1,String s2,int i1,int i2,int[][] dp,int l1,int l2) {
    	if(i1==l1 || i2==l2) {
    		return 0;
    	}
    	if(dp[i1][i2]!=-1) {
    		return dp[i1][i2];
    	}
    	if(s1.charAt(i1)==s2.charAt(i2)) {
    		dp[i1][i2]=1+this.dp(s1, s2, i1+1, i2+1, dp, l1, l2);
    	}
    	else {
    		dp[i1][i2]=Math.max(this.dp(s1, s2, i1+1, i2, dp, l1, l2),this.dp(s1, s2, i1, i2+1, dp, l1, l2));
    	}
    	return dp[i1][i2];
    }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        Main mm=new Main();
        int[][] dp=new int[l1][l2];
        for(int i=0;i<l1;i++) {
        	for(int j=0;j<l2;j++) {
        		dp[i][j]=-1;
        	}
        }
        mm.dp(s1, s2, 0, 0, dp, l1, l2);
        int i1=0;
        int i2=0;
        while(i1<l1 && i2<l2) {
        	if(s1.charAt(i1)==s2.charAt(i2)) {
        		System.out.print(s1.charAt(i1));
        		i1++;i2++;
        	}
        	else {
        		if(i1+1<l1 && i2+1<l2) {
        		if(dp[i1+1][i2]>=dp[i1][i2+1]) {
        			i1++;
        		}
        		else {
        			i2++;
        		}}
        		else if(i1+1<l1) {
        			i1++;
        		}
        		else {
        			i2++;
        		}
        		
        	}
        }
	}
}

