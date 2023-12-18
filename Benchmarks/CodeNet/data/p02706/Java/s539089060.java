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
		    for(int i=0;i<m;i++)
		    {
		        sum+=sc.nextInt();
		    }
		    n=n-sum;
		    if(n<0)
		    System.out.println(-1);
		    else
		    System.out.println(n);
		} catch(Exception e) {
		}
	}
}
