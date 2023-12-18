import java.util.*;
import java.lang.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,k;
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();k=sc.nextInt();
		if(k==0)
		{
		    System.out.println(0);
		}
		else if(k<=(a+b))
		{
		 System.out.println(a);   
		}
		else{
		    System.out.println(a-(k-a-b));
		} 
	}
}
		