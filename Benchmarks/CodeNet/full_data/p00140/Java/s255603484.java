import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			int s=in.nextInt();
			int t=in.nextInt();
			if(s<t)
			{
				for(int i=s;i<=t;i++)
					if(i!=t)
						System.out.print(i+" ");
					else
						System.out.println(i);
			}
			else if(s>t)
			{
				if(s<=5)
				{
					for(int i=s;i>=t;i--)
						if(i!=t)
							System.out.print(i+" ");
						else
							System.out.println(i);
				}
				else if(s>=6)
				{
					for(int i=s;i<=9;i++)
						System.out.print(i+" ");
					if(t>=0&&t<=5)
						for(int i=5;i>=t;i--)
						{
							if(i!=t)
								System.out.print(i+" ");
							else
								System.out.println(i);
						}
					else if(t>=6&&t<=9)
					{
						System.out.print("5 4 3 2 1 0 1 2 3 4 5 ");
						for(int i=6;i<=t;i++)
						if(i!=t)
							System.out.print(i+" ");
						else
							System.out.println(i);
					}
				}
			}
		}
	}
}