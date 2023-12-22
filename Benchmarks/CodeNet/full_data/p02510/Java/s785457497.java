import java.util.Scanner;
import java.util.InputMismatchException;

public class Shuffle
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String deck;
			int h;

			while(true)
			{
				deck = sc.next();
				if(deck.charAt(0) == '-')
				{
					break;
				}
				
				for(int m = sc.nextInt(); m > 0; m--)
				{
					h = sc.nextInt();
					
					if(h == 1)
					{
						deck = deck.substring(h, deck.length()) + deck.charAt(0);
					}
					else
					{
						deck = deck.substring(h, deck.length()) + deck.substring(0, h);
					}
				}
				
				System.out.println(deck);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}