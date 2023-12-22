import java.util.*;
import java.io.*;
import java.lang.*;

class Main{

    public static void main(String args[])throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String A,B;
	while((A = in.readLine()) != null){
	    B = in.readLine();
	    String MA,MI;
	    if(A.length() >= B.length()){
		MA = A;
		MI = B;
	    }
	    else{
		MA = B;
		MI = A;
	    }	  
	    int mex = 0;
	    int[][] dp = new int[MI.length()][2];
	    for(int i=0;i<MI.length();i++){
		if(MI.charAt(i) == MA.charAt(0)){
		    dp[i][0] = 1;
		    mex = Math.max(1,mex);
		}
		else{
		    dp[i][0] = 0;
		}
	    }	 

	    for(int i=1;i<MA.length();i++){
		for(int j=0;j<MI.length();j++){
		    if(j == 0){
			if(MA.charAt(i) == MI.charAt(j)){
			    dp[j][1] = 1;
			    mex = Math.max(1,mex);
			}
			else {		      
			    dp[j][1] = 0;
			}
		    }
		    else {
			if(MA.charAt(i) == MI.charAt(j)){
			    dp[j][1] = dp[j-1][0]+1;
			    mex = Math.max(mex,dp[j][1]);
			}
			else {
			    dp[j][1] = 0;
			}
		    }
		}
		for(int j=0;j<MI.length();j++)dp[j][0] = dp[j][1];
	    }



	    System.out.println(mex);


	}

    }

}