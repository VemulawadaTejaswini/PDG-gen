import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			int H=scan.nextInt();		
			int W=scan.nextInt();

			if(H==0&&W==0)
			{
				break;				
			}
			else
			{
				for(int i=1;i<=H;i++)
				{	
					if(i==1)
					{
						for(int a=1;a<=W;a++)
						{
							System.out.print("#");
						}
						System.out.println("");
					}
					else if(i==H)
					{
						for(int b=1;b<=W;b++)
						{
							System.out.print("#");
						}
						System.out.println("");
					
					}
					else
					{
						for(int c=1;c<=W;c++)
						{
							if(c==1)
							{
								System.out.print("#");
							}
							else if(c==W)
							{
								System.out.println("#");
							}
							else
							{
								System.out.print(".");
							}	
						}
					}
				}System.out.print("\n");
			
			}
			
		}
		
	}

}