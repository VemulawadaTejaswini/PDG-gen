import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer 1-9");
		first = sc.nextInt();
		System.out.println("Enter the second integer: ");
		second = sc.nextInt();

		if(first > 0 && first < 10 && second > 0 && second < 10)
			System.out.println("The result of these two integers is " + first * second);
		else
			System.out.println("-1");
	}
}