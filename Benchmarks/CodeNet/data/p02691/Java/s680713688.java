import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    int diff=0;
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i;j<n;j++)
		        {
		            if((j-i)==(ar[j]+ar[i]))
		            diff++;
		        }
		    }
		    System.out.println(diff);
		    
		} catch(Exception e) {
		}
	}
}
