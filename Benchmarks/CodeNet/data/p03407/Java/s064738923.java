import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.NextInt();
		int b = sc.NextInt();
		int c = sc.NextInt();
		
		if (a + b > c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}