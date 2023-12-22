import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		int a;
			a = sc.nextInt();
		int b;
			b = sc.nextInt();

		System.out.println(a * b + " " + 2 * a + 2 * b);
	}
}