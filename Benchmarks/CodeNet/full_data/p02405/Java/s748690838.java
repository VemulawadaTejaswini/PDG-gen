import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		int H=scan.nextInt();
		int W=scan.nextInt();
		int i;
		int x;
		int y;
		String str = System.getProperty("line.separator");
		
		if(H!=0&&W!=0)
		{
			for(i=1;i<=H;i++)
			{
				if(i%2==1)
				{
					for(x=1;x<=W;x++)
					{
						if(x%2==1)
						{
							System.out.print("#");
						}
						else if(x%2==0)
						{
							System.out.print(".");
						}					
					}
				}
				else if(i%2==0)
				{
					for(y=1;y<=W;y++)
					{
						if(y%2==1)
						{
							System.out.print(".");
						}
						else if(y%2==0)
						{
							System.out.print("#");
						}					
					}
					System.out.print(str);
				}
			}
		}
	}
}