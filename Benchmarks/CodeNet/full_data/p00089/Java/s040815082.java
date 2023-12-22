import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	int[][] dp = new int[101][51];
	try{
	    String st; int j = 0, before = 1;
	    while((st=sc.readLine())!=null){
		String[] cp = st.split(",");
		if(j==0){
		    dp[0][0] = Integer.valueOf(cp[0]);
		    j++;
		}
		else if(before == cp.length-1){
		    dp[j][0]=dp[j-1][0] + Integer.valueOf(cp[0]);
		    for(int i=1; i<cp.length-1; i++)
			dp[j][i] = Math.max(dp[j-1][i-1], dp[j-1][i]) + Integer.valueOf(cp[i]);
		    dp[j][cp.length-1]=dp[j-1][cp.length-2] + Integer.valueOf(cp[cp.length-1]);
		    before = cp.length;
		    j++;
		}
		else{
		    for(int i=0; i<cp.length; i++)
			dp[j][i] = Math.max(dp[j-1][i], dp[j-1][i+1]) + Integer.valueOf(cp[i]);
		    j++;
		    before = cp.length;
		}
	    }
	    System.out.println(dp[j-1][0]);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}