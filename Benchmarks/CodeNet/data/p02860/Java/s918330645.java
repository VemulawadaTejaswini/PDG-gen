import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		boolean concatenation = false;

		for(int i = 1; i<word.length(); i++)
		{
			if(concatenation)
				break;
			if(word.charAt(i) == word.charAt(0))
			{
				int counter = 0;
				for(int j = i; j<word.length(); j++)
				{
					if(word.charAt(j) == (word.charAt(counter)))
					{
						counter++;
					}
					else
						break;

					if(j == word.length()-1)
					{
						concatenation = true;
						break;
					}
				}
			}
		}
		if(concatenation)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}