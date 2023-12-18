import java.util.*;

public class Main{
  
  
  
   public static long kstones(int k,int arr[][]){
	
	 long dp[][]=new long[arr.length][3];
	 
	 
	 
	 for(int i=0;i<3;i++) {
		 dp[0][i]=arr[0][i];
	 }
	    	
	 
	 for(int i=1;i<arr.length;i++) {
		 
		 for(int j=0;j<3;j++) {
			 
			 if(j==0) {
				 dp[i][j]=arr[i][j]+	Math.max(dp[i-1][1],dp[i-1][2]);
			 }
			 
			 
			 if(j==1) {
				 dp[i][j]=arr[i][j]+Math.max(dp[i-1][0],dp[i-1][2]);
			 }
			 
			 if(j==2) {
				 dp[i][j]=arr[i][j]+Math.max(dp[i-1][0],dp[i-1][1]);
			 }
			 
		 }
		 
	 }
	 
//	 
//	 for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<3;j++)
//			{ System.out.print(dp[i][j]+" ");
//	 
//			}System.out.println();
//	 }
//	 
	 long out=Long.MIN_VALUE;
	 for(int i=0;i<3;i++) {
		 
		 
//		 System.out.println(dp[arr.length-1][i]);
		 
		 
		 out=Math.max(out,dp[arr.length-1][i]);
	 }
	    	
	    	return out;
	    }
	    
	    
	    
		  
		    
	    
	    
	    
	    
	    
	    
	   
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	int dp[][]=new int[n][3];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<3;j++)
		{
			dp[i][j]=s.nextInt();
			
		}
	
	
	
	}

System.out.println(kstones(3,dp));
}
	   

}