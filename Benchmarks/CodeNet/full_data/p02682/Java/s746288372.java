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
      int a =in.nextInt(),b=in.nextInt(),c=in.nextInt(),k=in.nextInt();
      
      if(a>=k)
      {
          System.out.println(k);
      }
      else if(a+b>=k)
      {
          System.out.println(a);
      }
      else
      {
          
          k=k-a-b;
          System.out.println(a-(k));
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
