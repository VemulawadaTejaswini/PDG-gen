import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		int a,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0;i<c;i++)
		{
			d=sc.nextInt();
			a=a-d;
			
		}
		if(a<=0)
		{System.out.println("Yes");}
		else
		{System.out.println("No");}
	
	}
}