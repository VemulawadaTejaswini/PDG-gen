import java.util.*;

public class Main{
  
  	    
	
	    public static long knapsack(int target,int wt[],int val[]){
	
	 long dp[][]=new long[wt.length+1][target+1];
	 
	 
	 for(int i=1;i<=wt.length;i++) {
		 for(int j=1;j<=target;j++) {
			 
			 if(j-wt[i-1]>=0) {
				 
				 dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
				 
				 
			 }
			 
			 else {
				 dp[i][j]=dp[i-1][j];
			 }
			 
			 
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	
	    	return dp[wt.length][target];
	    }
	    
	    
	    
		  
		    
	    
	    
	    
	    
	    
	    
	   
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int w=s.nextInt();
	int weight[]=new int[n];
	int val[]=new int[n];
	for(int i=0;i<n;i++) {
	
		
		weight[i]=s.nextInt();
	val[i]=s.nextInt();		
		}
	
	
	
	

System.out.println(knapsack(w,weight,val));
}
	   

}
