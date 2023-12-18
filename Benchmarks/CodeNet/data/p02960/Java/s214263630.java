import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       String  S = sc.next();
       char[] c = S.toCharArray();

       long[][] dp = new long[c.length+15][13];
       
       if(c[c.length-1]=='?') {
    	   for(int i=0;i<10;i++) {
    		   dp[0][i]=1;
    	   }
       } else {
    	   dp[0][Character.getNumericValue(c[c.length-1])]=1;
       }
       
       int amari=1;
       for(int i=1;i<c.length;i++) {
    	   amari=(amari*10)%13;
    	   if(c[c.length-1-i]=='?') {
    		   for(int j=0;j<10;j++) {
    			   for(int k=0;k<13;k++) {
        			   dp[i][(k+j*amari)%13]=(dp[i][(k+j*amari)%13]+dp[i-1][k])%mod;    				   
    			   }
    		   }
    	   } else {
    		   int tmp=Character.getNumericValue(c[c.length-1-i]);
			   for(int k=0;k<13;k++) {
    			   dp[i][(k+tmp*amari)%13]=(dp[i][(k+tmp*amari)%13]+dp[i-1][k])%mod;    				   
			   }
    	   }
       }

       System.out.println(dp[c.length-1][5]);
       
   }
}