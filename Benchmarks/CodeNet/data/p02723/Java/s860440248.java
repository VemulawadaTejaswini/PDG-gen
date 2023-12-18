import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		char[] words = new char[6];
		for (int i=0;i<6;i++)
		{
			words[i] = s.charAt(i);
		}

		if (
			words[2]==words[3]&&
			words[4]==words[5]&&
			words[0]!=words[2]&&
			words[0]!=words[4]&&
			words[1]!=words[2]&&
			words[1]!=words[4]&&
			words[0]!=words[1]
			)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}