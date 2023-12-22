import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++)
		{
			if (Character.isLowerCase(input.charAt(i)))
			{
				System.out.print(Character.toUpperCase(input.charAt(i)));

			}
			else if (Character.isUpperCase(input.charAt(i)))
			{
				System.out.print(Character.toLowerCase(input.charAt(i)));

			}
			else
			{
				System.out.print(input.charAt(i));
			}
		}
	}
}

