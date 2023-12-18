import java.util.Scanner;

public class a
{
	public static void main(String[] args)
	{
		String s;
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		if (s.equals("Sunny"))
			System.out.println("Cloudy");
		else if (s.equals("Cloudy"))
			System.out.println("Rainy");
		else
			System.out.println("Sunny");
	}
}