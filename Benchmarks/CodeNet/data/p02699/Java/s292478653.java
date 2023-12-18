/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		
	
	    if(b>=c)
	    {
	        System.out.println("Yes");
	        return;
	    }
	    else if(d>=a)
	    {
	        System.out.println("No");
	        return;
	    }
	   
	    float ans1=(c*1.0f)/b;
	    int a1= (int)ans1;
	    if(ans1%1!=0)
	    {
	        a1++;
	    }
	    
	    float ans2=(a*1.0f)/d;
	    int a2= (int)ans2;
	    if(ans2%1!=0)
	    {
	        a2++;
	    }
	    
	    if(a1<=a2)
	    {
	        System.out.println("Yes");
	        
	    }
	    else
	    System.out.println("No");
	}
}
