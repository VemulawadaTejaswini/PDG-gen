import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		int a,d=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			int b=a-(i*c);
			if(b<=0)
			{
				System.out.println(i);
				System.exit(0);
			}
			else
			{
				d++;
			}
			
			
		}
		System.out.println(d);
	
	}
}