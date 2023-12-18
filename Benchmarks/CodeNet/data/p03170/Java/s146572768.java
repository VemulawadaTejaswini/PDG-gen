import java.util.*;

public class Main{
  
  
	    public static void kstones(int k,int arr[]){
	    	
	    	boolean dp[]=new boolean[k+1];
	    	
	    	for(int i=1;i<=k;i++) {
	    		for(int j=0;j<arr.length;j++) {
	    			if(i-arr[j]>=0) {
	    				if(!dp[i-arr[j]]) {
	    					dp[i]=true;
	    					break;
	    				}
	    			}
	    		}
	    	}
	    	
	    	if(dp[k]) {
	    		System.out.println("first");
	    	}
	    	else {
	    		System.out.println("second");
	    	}
	    	
	    }
	    
	    
	    
		  
		    
	    
	    
	    
	    
	    
	    
	   
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int k=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}

kstones(k,arr);
}
	   

}