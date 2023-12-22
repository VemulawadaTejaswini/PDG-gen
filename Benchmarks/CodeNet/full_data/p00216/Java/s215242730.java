import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int w = stdIn.nextInt();
			if(w == -1)
			{
				break;
			}
			int sum = 1150;
			if(w >= 20)
			{
				sum += 1250;
				if(w >= 30)
				{
					sum += 1400 + 160 * (w - 30);
				}
				else
				{
					sum += 140 * (w - 20);
				}
			}
			else if(w >= 10)
			{
				sum += 125 * (w - 10);
			}
			System.out.println(4280 - sum);
		}
	}
}