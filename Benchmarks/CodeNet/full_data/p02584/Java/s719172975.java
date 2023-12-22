import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long k=sc.nextLong();
		long d=sc.nextLong();
		//int min=1000000000;
		if(x==d)
		{
			if(k%2==0)
				System.out.println(x);
			else
				System.out.println("0");
		}
		else
		{
			if((x-(k*d))>=0)
			{
				System.out.println((x-(k*d)));
			}
			else
			{
				long u=x/d;
				long g=x-(u*d);
				if((k-u)%2==0)
				  System.out.println((x-(u*d)));
				else
				     System.out.println(Math.abs(g-d));
			}
		}

		
	}
}