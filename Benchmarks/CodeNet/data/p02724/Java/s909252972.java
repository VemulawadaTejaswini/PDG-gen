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
		    int b=n/500;
		    n=n%500;
		    int sum=0;
		    sum+=(b*1000)+((n/5)*5);
		    System.out.println(sum);
		    
		} catch(Exception e) {
		}
	}
}
