


import java.io.*;

import java.util.*;

class pair{
	int a ;int b;
	public pair(int a,int b){
		this.a=a;
		this.b=b;
	}}

public class Main {
	
	 static long fun(long n) 
	    { 
	          
	        // Base cases 
	        if (n == 0 || n == 1) 
	        return n; 
	      
	        // Do Binary Search for  
	        // floor of 5th square root 
	        long low = 1, high = n, ans = -1; 
	        while (low <= high) 
	        { 
	              
	            // Find the middle point 
	            // and its power 5 
	            long mid = low + (high-low) / 2; 
	            long mid5 = mid * mid * mid *  
	                            mid * mid; 
	      
	            // If mid is the required root 
	            if (mid5 == n) 
	                return mid; 
	      
	            // Since we need floor,  
	            // we update answer when 
	            // mid5 is smaller than n,  
	            // and move closer to 
	            // 5'th root 
	            if (mid5 < n) 
	            { 
	                low = mid + 1; 
	                ans = mid; 
	            } 
	              
	            // If mid^5 is greater 
	            // than n 
	            else
	                high = mid - 1; 
	        } 
	        return -1; 
	    } 

	public static void main(String[] args) throws IOException 
	{ 

		Scanner s=new Scanner(System.in);
		long x=s.nextLong();
		long a=0;
		long b=0;
		boolean fl=false;
		for (int i = 0; i <(int)10000; i++) {
			b=i;
			fl=false;
			long temp=(long)Math.pow(i,5);
			long cc=fun(temp+x);
			if(cc!=-1) {
				a= cc;
			
				break;
			}
			long cc1=fun(-temp+x);
			if(cc1!=-1) {
				a= cc1;
				fl=true;
				
				break;
			}
			
			
		}
		if(fl)
	System.out.println(a+" "+-b);
		else
			System.out.println(a+" "+b);

	}


}