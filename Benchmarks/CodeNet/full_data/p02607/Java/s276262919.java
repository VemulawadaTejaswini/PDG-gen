import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n+1];
		int b=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(((a[i]%2)!=0) && ((i%2)!=0))
				b++;
		}
		System.out.println(b);
	}
}