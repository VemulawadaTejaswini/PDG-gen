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
		    int k=sc.nextInt();
		    int ar[]=new int[n];
		    int d[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        d[i]=0;
		    }
		    while(k-->0)
		    {
		        int a=sc.nextInt()-1;
		        int b=sc.nextInt()-1;
		        if(ar[a]>ar[b])
		        {
		         d[a]++;d[b]=-1;   
		        }
		        else if(ar[a]<ar[b])
		        {
		            d[b]++;d[a]=-1;
		        }
		        else if(ar[a]==ar[b])
		        {
		            d[a]=-1;d[b]=-1;
		        }
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(d[i]>=0)c++;
		    }
		    System.out.println(c);
		    
		    
		} catch(Exception e) {
		}
	}
}
