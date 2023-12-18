import java.util.*;
import java.lang.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,k;
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();k=sc.nextInt();
		if(k<=a)
		{
		 System.out.println(k);   		
		}
	  else if(k>a && k<(a+b))
		{
		 System.out.println(a);   
		}
		else{
		    System.out.println(a-(k-a-b));
		} 
	}
}
		