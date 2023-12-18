/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args)   {
	   Scanner s=new Scanner(System.in); 
        // String str=s.next();
        // if(str.charAt(5)==str.charAt(4) && str.charAt(3)==str.charAt(2))
        // System.out.println("Yes");
        // else
        // println("No");
        long n=s.nextLong();
        long ans=0;
        if(n>=500)
        {
            ans+=(n/500)*1000;
            //System.out.println(ans);
            n=(n%500);
            if(n>=5)
            {
                ans+=(n/5)*5;
                //System.out.println(ans);
            }
        }
        else
        {
            ans+=(n/5)*5;
        }
        System.out.println(ans);
	   
	    
 
	}
	
}