import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();

		sc.close();
		String ans = "safe";
		if (w >= s ) {
			ans = "unsafe";
		}

		System.out.println(ans);
	}
}
