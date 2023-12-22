import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			int n, r, p, c, count;
			Scanner sc = new Scanner(System.in);
			String input;

			while(true)
			{
				n = sc.nextInt();
				r = sc.nextInt();

				int[] deck = new int[n];
				int[] ndeck = new int [n];

				for(int i = n; i > 0; i--)
				{
					deck[n - i] = i;
					ndeck[n - i] = deck[n - i];
				}

				if(n == 0 && r == 0)
				{
					break;
				}

				while(r > 0)
				{
					count = 0;
					p = sc.nextInt();
					c = sc.nextInt();

					for(int i = p - 1; i < p - 1 + c; i++)
					{
						ndeck[count] = deck[i];
						count++;
					}

					for(int i = 0; i < p - 1; i++)
					{
						ndeck[count] = deck[i];
						count++;
					}

					for(int i = 0; i < n; i++)
					{
						deck[i] = ndeck[i];
					}

					r--;
				}

				System.out.println(ndeck[0]);
			}

		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}