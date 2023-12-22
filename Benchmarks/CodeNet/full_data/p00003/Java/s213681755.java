import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		for(int i = 0; i < m; i++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}