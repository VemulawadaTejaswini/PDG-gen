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
        int n=in.nextInt(),m=in.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=in.nextInt();
        }
        
        int sum=0;
        
        for(int i=0;i<m;i++)
        {
            sum+=a[i];
            
            if(sum>n)
            {
                break;
            }
            
        }
        
        if(sum>n)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(n-sum);
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
