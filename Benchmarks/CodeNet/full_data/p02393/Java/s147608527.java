import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a>b&&a>c)
		{
			if(b>c)
			{
				System.out.println(c+" "+b+" "+a);
			}
			else if(b<c)
			{
				System.out.println(b+" "+c+" "+a);
			}
			else if(b==c)
			{
				System.out.println(b+" "+c+" "+a);
			}
		}
		else if(b>a&&b>c)
		{
			if(a>c)
			{
				System.out.println(c+" "+a+" "+b);
			}
			else if(a<c)
			{
				System.out.println(a+" "+c+" "+b);
			}
			else if(a==c)
			{
				System.out.println(a+" "+c+" "+b);
			}
			
		}
		else if(c>a&&c>b)
		{	
			if(a>b)
			{
				System.out.println(b+" "+a+" "+c);
			}
			else if(a<b)
			{
				System.out.println(a+" "+b+" "+c);
			}
			else if(a==b)
			{
				System.out.println(a+" "+b+" "+c);
			}

		}
	}
}