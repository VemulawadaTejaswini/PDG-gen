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
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        
        if(s.length()<=n)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println(s.substring(0,n)+"...");
        }
        
    }
    

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t=1;
		//in.nextLine();
		
		while(t>0)
		{
		    
		    solve();
		    t--;
		}
		
		
	
	//	System.out.println(x);
	}
}
