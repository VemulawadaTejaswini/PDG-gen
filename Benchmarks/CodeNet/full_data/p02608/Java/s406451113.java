import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=(int) Math.sqrt(n);

	    int[] ans=new int[n+1];
	    
	    
	    
	    for(int s=1;s<=n;s++) {
	    
	    	for(int x=1;x<=m;x++) {
		    	for(int y=1;y<=m;y++) {
		    		for(int z=1;z<=m;z++) {
		    			if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==s)ans[s]++;
		    		}
		    		
		    	}
		    	
		    }
	    
	    }
	    
	    for(int s=1;s<=n;s++) {
	    	System.out.println(ans[s]);
	    }

	    
	}
}
