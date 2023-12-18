/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;  // Import the Scanner class
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println(n);
	    int ans=0;
	    for(int i=1;i<=n;i++)
	    {   String s=String.valueOf(i);
	        for(int j=1;j<=n;j++)
	        {
	            String t=String.valueOf(j);
	            //System.out.println(s.charAt(0)==t.charAt(t.length()-1));
	  
	            if (s.charAt(0)==t.charAt(t.length()-1) && s.charAt(s.length()-1)==t.charAt(0))
	            {
	                ans+=1;
	            }
	            
	            //System.out.println(s.indexOf(s.length()-1)==t.indexOf(0),s.indexOf(0)==t.indexOf(t.length()-1));
	
	            //System.out.println(s.indexOf(s.length()-1)==t.indexOf(0),s.indexOf(0)==t.indexOf(t.length()-1));
	            
	            
	        }
	        
	    }
	    System.out.println(ans);
	    
	    
	    
		//System.out.println("GfG!");
	}
}