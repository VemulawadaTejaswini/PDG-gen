import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long a=s.nextLong();
		long v1=s.nextLong();
		
		long b=s.nextLong();
		long v2=s.nextLong();
		
		if(a<b)
		{
			long temp=a;
			long temp2=v1;
			
			a=b;
			v1=v2;
			
			b=temp;
			v2=temp2;
		}
		
		long t=s.nextLong();
		
		
		if(a==b)
		{
			System.out.println("YES");
		}
		else if(v2<=v1)
		{
			System.out.println("NO");
		}
		else
		{
			long take=(a-b)/(v2-v1);
			
			if(take<=t)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}
	
}