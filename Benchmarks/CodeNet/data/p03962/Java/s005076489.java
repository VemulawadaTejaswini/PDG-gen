import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//入力
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();

		//処理
		if ((a == b) || (a == c) || (b == c))
		{
			System.out.println("2");
		} else if ((a == b) && (b == c))
		{
			System.out.println("1");
		} else
		{
			System.out.println("3");
		}
	}
}
