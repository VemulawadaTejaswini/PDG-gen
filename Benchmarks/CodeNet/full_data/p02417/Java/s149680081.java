import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		char[] input = sc.nextLine().toLowerCase().toCharArray();

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		int[] alphabetNum = new int[26];
		for (int i = 0; i < alphabetNum.length; i++)
		{
			alphabetNum[i] = 0;
		}

		for (int i = 0; i < input.length; i++)
		{
			for (int j = 0; j < alphabet.length; j++)
			{
				if (input[i] == alphabet[j])
				{
					alphabetNum[j]++;
					break;
				}
			}
		}

		for (int i = 0; i < alphabetNum.length; i++)
		{
			System.out.println(alphabet[i] + " : " + alphabetNum[i]);
		}
	}
}
