import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println((a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) ? "YES" : "NO");
		}
	}
}