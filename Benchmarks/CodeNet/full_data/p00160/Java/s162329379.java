import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int price = 0;
			while(n-- != 0)
			{
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				int h = stdIn.nextInt();
				int w = stdIn.nextInt();
				int size = x + y + h;
				if(size <= 60 && w <= 2)
				{
					price += 600;
				}
				else if(size <= 80 && w <= 5)
				{
					price += 800;
				}
				else if(size <= 100 && w <= 10)
				{
					price += 1000;
				}
				else if(size <= 120 && w <= 15)
				{
					price += 1200;
				}
				else if(size <= 140 && w <= 20)
				{
					price += 1400;
				}
				else if(size <= 160 && w <= 25)
				{
					price += 1600;
				}
				else
				{
					continue;
				}
			}
			System.out.println(price);
		}
	}
}