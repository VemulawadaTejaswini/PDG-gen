import java.util.*;
class Trial
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(((a < c && b > c) || (a > c && b < c)))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}