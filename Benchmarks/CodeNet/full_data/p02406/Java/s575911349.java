import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i=1; i<n; i++)
		{
			if(i%3==0)
			{
				System.out.print(" "+i);
			}
			int x =i;
			while(x>0)
			{
				if(x%10==3)
				{
					System.out.print(" "+i);
				}
				x/=10;
			}
		}

	}
}