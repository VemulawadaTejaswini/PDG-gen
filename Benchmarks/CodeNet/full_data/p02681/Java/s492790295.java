/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
public class Main
 
 
{
    static Scanner in = new Scanner(System.in);
    
    public static void solve()
    {
       String s=in.nextLine();
       String s1=in.nextLine();
       
       if(s.equals(s1.substring(0,s1.length()-1)))
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
    }
    

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t=1;
	//	in.nextLine();
		
		while(t>0)
		{
		    
		    solve();
		    t--;
		}
		
		
	
	//	System.out.println(x);
	}
}
