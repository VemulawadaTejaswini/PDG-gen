import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		
		while(true)
		{
			int x=scan.nextInt();
			int y=scan.nextInt();

			if(x>y)
			{
				System.out.println(y+" "+x);
			}
			else if(x<y)
			{
				System.out.println(x+" "+y);
			}
			else if(x==0&&y==0)
			{
				System.out.println(x+" "+y);
				break;
			}
		}
	}
}