import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long x=s.nextLong();
		
		long a1=0;
		long a2=0;
		
		for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=100;j++)
			{
				if(power(i)+power(j)==x)
				{
					a1=i;
					a2=-1*j;
				}
			}
		}
		
		System.out.println(a1+" "+a2);
		
	}
	
	public static long power(long a)
	{
		long res=1;
		
		for(int i=0;i<5;i++)
		{
			res=res*a;
		}
		
		return res;
	}
	
}