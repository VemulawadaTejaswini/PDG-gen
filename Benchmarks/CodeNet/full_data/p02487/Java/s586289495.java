import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine())
		{
			String[] str = sc.nextLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			
			if (H == 0 && W == 0)
			{
				break;
			}
			
			for (int i = 0; i < H; i++)
			{
				for (int j = 0; j < W - 1; j++)
				{
					if (j < 0 && j < W - 2)
					{
						System.out.print(".");
					}
					else
					{
						System.out.print("#");
					}
				}
				
				System.out.println("#");
			}
			
			System.out.println("");
		}
	}
}