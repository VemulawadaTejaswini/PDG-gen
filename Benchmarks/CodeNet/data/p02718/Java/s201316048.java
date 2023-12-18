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
		    int m=sc.nextInt();
		    int sum=0;
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        sum+=ar[i];
		    }
		    sum=sum/(4*m);
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(ar[i]>=sum)
		        c++;
		        if(c==m)
		        break;
		    }
		    if(c<m)
		    System.out.println("No");
		    else
		    System.out.println("Yes");
		    
		} catch(Exception e) {
		}
	}
}
