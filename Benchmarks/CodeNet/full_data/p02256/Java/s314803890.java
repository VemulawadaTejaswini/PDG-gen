import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(gcd(a, b));
	}

	public static int gcd(int a, int b)
	{
		if( a%b == 0 )
			return b;
		else
			return gcd(b, a%b);
	}
}