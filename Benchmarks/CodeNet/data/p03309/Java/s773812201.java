import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), a = 0;
		for (int i = 1; i <= n; i++)
		{
			a += Math.abs(scan.nextInt() - i);
		}
		scan.close();
		System.out.println(a);
	}
}
