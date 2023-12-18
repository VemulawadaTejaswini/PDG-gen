import java.util.Scanner;

public class Prob1
{

	public static void main(String[] args)
	{
		int n = 0;

		Scanner s = new Scanner(System.in);
		
		String l = s.nextLine();
		
		for (int i = 0; i < 4; i++)
		{
			n = l.charAt(i) == '+' ? n + 1 : n - 1;
		}
		System.out.println(n);
	}
}
