import java.util.*;
public class Main 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if (input == 1)
			System.out.println("Hello World");
		else if (input == 2)
		{
			int input2 = scan.nextInt();
			int input3 = scan.nextInt();
			System.out.println(input2+input3);
		}
	}
}